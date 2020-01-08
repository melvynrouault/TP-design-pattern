package com.tact.tp.builder;

import com.tact.tp.builder.base.Item;
import com.tact.tp.builder.base.Meal;
import com.tact.tp.builder.burger.ChickenBurger;
import com.tact.tp.builder.burger.VegBurger;
import com.tact.tp.builder.drink.Coke;
import com.tact.tp.builder.drink.Pepsi;
import com.tact.tp.builder.game.CarGame;
import com.tact.tp.builder.game.DrawGame;

public class MealBuilder {

    private final Meal meal = new Meal();

    public MealBuilder prepareVegMeal() {
        this.meal.addItem(new VegBurger());
        this.meal.addItem(new Coke());

        return this;
    }

    public MealBuilder prepareNonVegMeal() {
        this.meal.addItem(new ChickenBurger());
        this.meal.addItem(new Pepsi());

        return this;
    }

    public MealBuilder prepareHappyMealCarGame() {
        this.prepareNonVegMeal();
        this.meal.addItem(new CarGame());

        return this;
    }

    public MealBuilder prepareHappyMealDrawGame() {
        this.prepareNonVegMeal();
        this.meal.addItem(new DrawGame());

        return this;
    }

    public MealBuilder addItem(Item item) {
        this.meal.addItem(item);

        return this;
    }

    public Meal build() {
        return this.meal;
    }
}
