package fr.mds.abstractfactory.shape;

public class Square implements Shape{

	public static final String SQUARE = "Square";

	@Override
	public void draw() {
		System.out.println("THIS IS A SQUARE");
	}

}
