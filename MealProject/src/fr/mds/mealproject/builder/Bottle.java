package fr.mds.mealproject.builder;

public class Bottle {

	private String packingType;

	public Bottle(String packingType) {
		this.packingType = packingType;
	}

	@Override
	public String toString() {
		return "Wrapper [packingType=" + packingType + "]";
	}
}
