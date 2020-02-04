package fr.mds.abstractfactory.shape;

public class Circle implements Shape{

	public static final String CIRCLE = "Circle";

	@Override
	public void draw() {
		System.out.println("THIS IS A CIRCLE");
	}

}
