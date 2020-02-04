package fr.mds.abstractfactory.shape;

public class Rectangle implements Shape{

	public static final String RECTANGLE = "Rectangle";

	@Override
	public void draw() {
		System.out.println("THIS IS A RECTANGLE");
	}

}
