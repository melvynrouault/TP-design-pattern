package fr.mds.abstractfactory.shape;

import fr.mds.abstractfactory.factory.Item;

public class Rectangle implements Shape, Item{

	public static final String RECTANGLE = "Rectangle";

	@Override
	public void draw() {
		System.out.println("THIS IS A RECTANGLE");
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Shape " + RECTANGLE;
	}

}
