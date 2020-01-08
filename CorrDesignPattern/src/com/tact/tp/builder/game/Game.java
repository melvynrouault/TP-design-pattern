package com.tact.tp.builder.game;

import com.tact.tp.builder.base.Item;
import com.tact.tp.builder.base.Packing;

import lombok.Data;

@Data
public abstract class Game implements Item {

    private String name;

    private final Packing packing = new GameBag();

    private float price = 0;

}
