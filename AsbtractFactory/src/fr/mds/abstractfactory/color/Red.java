package fr.mds.abstractfactory.color;

public class Red implements Color{

	public static final String RED = "Red";

	@Override
	public void fill() {
		System.out.println("THIS IS THE COLOR RED");
	}

}
