package fr.mds.mealproject.builder;

public class Pepsi extends ColdDrink{
	@Override
	public String name() {
		return this.name = "PEPSI";
	}
	
	@Override
	public Float price() {
		return this.price = 1.5F;
	}

	@Override
	public Packing packing() {
		Wrapper wrapper = new Wrapper("Plastique recyclé");
		return wrapper;
	}

	@Override
	public String toString() {
		return "VegBurger name()=" + name() + ", price()=" + price() + ", packing()=" + packing();
	}
}
