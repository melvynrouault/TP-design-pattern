package fr.mds.abstractfactory.factory;

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
}
