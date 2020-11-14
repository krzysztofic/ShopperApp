package com.shopper.Model;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ShoppingList {

    private LocalDate date;
    private String shop;
    private int products;
    private int money_spend;
}
