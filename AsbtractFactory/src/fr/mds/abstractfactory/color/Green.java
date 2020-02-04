package fr.mds.abstractfactory.color;

public class Green implements Color{

	public static final String GREEN = "Green";

	@Override
	public void fill() {
		System.out.println("THIS IS THE COLOR GREEN");
	}

}
