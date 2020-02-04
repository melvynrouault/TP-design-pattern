package fr.mds.abstractfactory.factory;

import fr.mds.abstractfactory.color.Color;
import fr.mds.abstractfactory.shape.Circle;
import fr.mds.abstractfactory.shape.Rectangle;
import fr.mds.abstractfactory.shape.Shape;
import fr.mds.abstractfactory.shape.Square;

public class ShapeFactory implements AbstractFactory{

	public static final String SHAPE = "shape";

	@Override
	public Shape getShape(String shape) {
		switch (shape) {
		case Rectangle.RECTANGLE:
			return new Rectangle();
		case Circle.CIRCLE:
			return new Circle();
		case Square.SQUARE:
			return new Square();
		}
		return null;
	}

	@Override
	public Color getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}
}
