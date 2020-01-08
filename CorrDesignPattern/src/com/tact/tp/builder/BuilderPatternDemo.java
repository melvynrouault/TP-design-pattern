package com.tact.tp.builder;

import com.tact.tp.builder.base.Meal;
import com.tact.tp.builder.burger.ChickenBurger;

public class BuilderPatternDemo {

    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal().build();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost: " + vegMeal.getCost());

        mealBuilder = new MealBuilder();
        Meal nonVegMeal = mealBuilder.prepareNonVegMeal().build();
        System.out.println("\n\nNon-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost: " + nonVegMeal.getCost());

      mealBuilder = new MealBuilder();
        Meal customMeal = mealBuilder
                .prepareNonVegMeal()
                .addItem(new ChickenBurger())
                .build();
        System.out.println("\n\nCustom Meal");
        customMeal.showItems();
        System.out.println("Total Cost: " + customMeal.getCost());

//        Meal myMeal = new Meal();
//        myMeal
//            .addItem(new Coke())
//            .addItem(new ChickenBurger())
//            .addItem(new CarGame());
        mealBuilder = new MealBuilder();
        Meal myMeal = mealBuilder.prepareHappyMealCarGame().build();
        System.out.println("\n\nMy Meal");
        myMeal.showItems();
        System.out.println("Total Cost: " + myMeal.getCost());

//        Meal theBigOne = new Meal();
//        theBigOne
//            .addItem(new ChickenBurger(),4)
//            .addItem(new Coke(), 2)
//            .addItem(new DrawGame());
        mealBuilder = new MealBuilder();
        Meal theBigOne = mealBuilder.prepareHappyMealDrawGame().build();
        System.out.println("\n\nThe Big One");
        theBigOne.showItems();
        System.out.println("Total Cost: " + theBigOne.getCost());




        String toto = "xxxx" + "yyy" + "zzz";







        for(int i = 0 ; i < 10000 ; i++) {
            toto += i;
        }

        StringBuilder builder = new StringBuilder();
        for(int i = 0 ; i < 10000 ; i++) {
            builder.append(i);
        }

        toto = builder.toString();







    }

}
