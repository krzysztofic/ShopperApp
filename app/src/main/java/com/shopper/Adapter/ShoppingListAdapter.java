package com.shopper.Adapter;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

import com.shopper.R;
import com.shopper.Model.ShoppingList;

import java.time.LocalDate;
import java.util.ArrayList;

public class ShoppingListAdapter extends ArrayAdapter<ShoppingList> {

    private static final String TAG = "ShoppingListAdapter";

    private Activity mContext;
    int mResource;

    public ShoppingListAdapter(Activity context, int resource, @NonNull ArrayList<ShoppingList> objects) {
        super(context, resource, objects);
        mContext = context;
        mResource = resource;
    }

    @SuppressLint("SetTextI18n")
    @RequiresApi(api = Build.VERSION_CODES.O)
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LocalDate date = getItem(position).getDate();
        String shop = getItem(position).getShop();
        int products = getItem(position).getProducts();
        int money_spend = getItem(position).getMoney_spend();

        ShoppingList shoppingList = new ShoppingList(date, shop, products, money_spend);

        LayoutInflater inflater = LayoutInflater.from(mContext);
        convertView = inflater.inflate(mResource, parent, false);

        TextView tvDate = (TextView) convertView.findViewById(R.id.textView1);
        TextView tvShop = (TextView) convertView.findViewById(R.id.textView2);
        TextView tvProducts = (TextView) convertView.findViewById(R.id.textView3);
        TextView tvMoney = (TextView) convertView.findViewById(R.id.textView4);

        tvDate.setText(date.toString());
        tvShop.setText(shop);
        tvProducts.setText(products + " products");
        tvMoney.setText(money_spend + " zl.");

        return convertView;
    }
}
