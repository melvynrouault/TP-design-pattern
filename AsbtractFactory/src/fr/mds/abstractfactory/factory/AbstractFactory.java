package fr.mds.abstractfactory.factory;

import fr.mds.abstractfactory.color.Color;
import fr.mds.abstractfactory.shape.Shape;

public interface AbstractFactory {
	public Shape getShape(String shape);
	public Color getColor(String color);
}
