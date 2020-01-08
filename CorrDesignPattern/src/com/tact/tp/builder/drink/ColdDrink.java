package com.tact.tp.builder.drink;

import com.tact.tp.builder.base.Item;
import com.tact.tp.builder.base.Packing;

import lombok.Data;

@Data
public abstract class ColdDrink implements Item {

    private String name;

    private final Packing packing = new Bottle();

    private float price;

}
