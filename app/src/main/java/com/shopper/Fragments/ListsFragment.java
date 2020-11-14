package com.shopper.Fragments;

import android.os.Build;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.ListFragment;

import com.shopper.R;
import com.shopper.Model.ShoppingList;
import com.shopper.Adapter.ShoppingListAdapter;

import java.time.LocalDate;
import java.util.ArrayList;

public class ListsFragment extends ListFragment {


    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        ShoppingList list1 = new ShoppingList(LocalDate.of(2020, 2, 2), "Lidl", 12, 132);
        ShoppingList list2 = new ShoppingList(LocalDate.of(2020, 3, 12), "Biedronka", 15, 222);
        ShoppingList list3 = new ShoppingList(LocalDate.of(2020, 11, 12), "Biedronka", 1, 222);
        ArrayList<ShoppingList> shoppingLists = new ArrayList<>();

        shoppingLists.add(list1);
        shoppingLists.add(list2);
        shoppingLists.add(list3);

        ShoppingListAdapter adapter = new ShoppingListAdapter(getActivity(), R.layout.shopping_lists_adapter, shoppingLists);
        setListAdapter(adapter);

    }
}

