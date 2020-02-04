package fr.mds.abstractfactory.shape;

import fr.mds.abstractfactory.factory.Item;

public class Circle implements Shape, Item{

	public static final String CIRCLE = "Circle";

	@Override
	public void draw() {
		System.out.println("THIS IS A CIRCLE");
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Shape " + CIRCLE;
	}

}
