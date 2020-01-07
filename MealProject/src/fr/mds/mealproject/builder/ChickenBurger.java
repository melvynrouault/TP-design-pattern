package fr.mds.mealproject.builder;

public class ChickenBurger extends Burger {
	
	@Override
	public String name() {
		return this.name = "Chicken";
	}
	
	@Override
	public Float price() {
		return this.price = 9.0F;
	}

	@Override
	public Packing packing() {
		Wrapper wrapper = new Wrapper("Carton");
		return wrapper;
	}

	@Override
	public String toString() {
		return "VegBurger name()=" + name() + ", price()=" + price() + ", packing()=" + packing();
	}
}
