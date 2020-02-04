package fr.mds.abstractfactory.color;

import fr.mds.abstractfactory.factory.Item;

public class Blue implements Color, Item{

	public static final String BLUE = "Blue";

	@Override
	public void fill() {
		System.out.println("THIS IS THE COLOR BLUE");
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Color " + BLUE;
	}

}
