package com.tact.tp.builder.burger;

import com.tact.tp.builder.base.Item;
import com.tact.tp.builder.base.Packing;

import lombok.Data;

@Data
public abstract class Burger implements Item {

    private String name;

    private final Packing packing = new Wrapper();

    private float price;

//    @Override
//    public String getName() {
//        return this.name;
//    }

//    @Override
//    public Packing getPacking() {
//        return this.wrapper;
//    }

//    @Override
//    public float getPrice() {
//        return this.price;
//    }
}
