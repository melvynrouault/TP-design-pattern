package fr.mds.abstractfactory.color;

import fr.mds.abstractfactory.factory.Item;

public class Red implements Color, Item{

	public static final String RED = "Red";

	@Override
	public void fill() {
		System.out.println("THIS IS THE COLOR RED");
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Color " + RED;
	}

}
