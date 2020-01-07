package fr.mds.mealproject.builder;

public class VegBurger extends Burger {
	
	@Override
	public String name() {
		return this.name = "Végé";
	}
	
	@Override
	public Float price() {
		return this.price = 9.8F;
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
