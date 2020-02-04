package fr.mds.abstractfactory.factory;

import fr.mds.abstractfactory.color.Blue;
import fr.mds.abstractfactory.color.Green;
import fr.mds.abstractfactory.color.Red;
import fr.mds.abstractfactory.shape.Circle;
import fr.mds.abstractfactory.shape.Rectangle;
import fr.mds.abstractfactory.shape.Square;

public class FactoryProducer {
	public static AbstractFactory getFactory(String type) {
		switch (type) {
		case ShapeFactory.SHAPE:
			return new ShapeFactory();
		case ColorFactory.COLOR:
			return new ColorFactory();
		}
		return null;
	}
	
	public static Item getItem(String type) {
		
		switch (type) {
		case Blue.BLUE:
		case Red.RED:
		case Green.GREEN:
			return (Item) new ColorFactory().getColor(type);
		case Rectangle.RECTANGLE:
		case Square.SQUARE:
		case Circle.CIRCLE:
			return (Item) new ShapeFactory().getShape(type);
		default:
			return null;
		}
	}
}

