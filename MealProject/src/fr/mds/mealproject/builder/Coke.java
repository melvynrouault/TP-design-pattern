package fr.mds.mealproject.builder;

public class Coke extends ColdDrink{
	@Override
	public String name() {
		return this.name = "COCA";
	}
	
	@Override
	public Float price() {
		return this.price = 2F;
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
