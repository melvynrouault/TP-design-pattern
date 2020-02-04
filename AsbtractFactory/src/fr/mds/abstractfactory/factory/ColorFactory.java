package fr.mds.abstractfactory.factory;

import fr.mds.abstractfactory.color.Blue;
import fr.mds.abstractfactory.color.Color;
import fr.mds.abstractfactory.color.Green;
import fr.mds.abstractfactory.color.Red;
import fr.mds.abstractfactory.shape.Shape;

public class ColorFactory implements AbstractFactory{
	public static final String COLOR = "Color";

	@Override
	public Shape getShape(String shape) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Color getColor(String color) {
		switch (color) {
		case Red.RED:
			return new Red();
		case Blue.BLUE:
			return new Blue();
		case Green.GREEN:
			return new Green();
		default:
			return null;
		}
	}
}
