package fr.mds.abstractfactory.color;

import fr.mds.abstractfactory.factory.Item;

public class Green implements Color, Item{

	public static final String GREEN = "Green";

	@Override
	public void fill() {
		System.out.println("THIS IS THE COLOR GREEN");
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Color " + GREEN;
	}

}
