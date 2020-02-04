package fr.mds.abstractfactory.shape;

import fr.mds.abstractfactory.factory.Item;

public class Square implements Shape, Item{

	public static final String SQUARE = "Square";

	@Override
	public void draw() {
		System.out.println("THIS IS A SQUARE");
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Shape " + SQUARE;
	}

}
