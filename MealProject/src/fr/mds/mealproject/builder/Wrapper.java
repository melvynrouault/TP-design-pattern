package fr.mds.mealproject.builder;

public class Wrapper implements Packing{
	
	private String packingType;

	public Wrapper(String packingType) {
		this.packingType = packingType;
	}

	@Override
	public String toString() {
		return "Wrapper [packingType=" + packingType + "]";
	}
	
}
