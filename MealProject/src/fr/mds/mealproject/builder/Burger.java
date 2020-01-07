package fr.mds.mealproject.builder;

public abstract class Burger implements Item{

	protected String name;
	protected Packing packing;
	protected Float price;	
	
	public String name() {
		return name;
	}
	
	public void name(String name) {
		this.name = name;
	}
	
	public Packing packing() {
		return packing;
	}
	
	public void packing(Packing packing) {
		this.packing = packing;
	}
	
	public Float price() {
		return price;
	}
	
	public void price(Float price) {
		this.price = price;
	}
	
	
}
