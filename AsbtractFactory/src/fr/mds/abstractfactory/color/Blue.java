package fr.mds.abstractfactory.color;

public class Blue implements Color{

	public static final String BLUE = "Blue";

	@Override
	public void fill() {
		System.out.println("THIS IS THE COLOR BLUE");
	}

}
