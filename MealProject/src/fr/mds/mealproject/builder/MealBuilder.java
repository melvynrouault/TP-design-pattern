package fr.mds.mealproject.builder;

public class MealBuilder {
	private Meal meal = new Meal();

	public MealBuilder prepareVegMeal() {
		
		meal.addItem(new VegBurger());
		meal.addItem(new Pepsi());
		
		return this;
	}
	
	public MealBuilder prepareNonVegMeal() {
		
		meal.addItem(new ChickenBurger());
		meal.addItem(new Coke());
		
		return this;
	}
	
	public MealBuilder addItem(Item item) {
		this.meal.addItem(item);
		return this;
	}
	
	public Meal build() {
		Meal result = meal;
		meal = new Meal();
		return result;
	}
}
