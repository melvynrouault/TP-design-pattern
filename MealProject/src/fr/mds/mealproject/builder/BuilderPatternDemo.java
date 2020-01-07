package fr.mds.mealproject.builder;

public class BuilderPatternDemo {
	public static void main(String[] args) {
		System.out.println("COUCOU");
		
		MealBuilder mb = new MealBuilder();
		
		Meal vegMeal = mb.prepareVegMeal().build();
		System.out.println("Veg Meal");
		vegMeal.showItems();
		System.out.println("prix total : " + vegMeal.getCost());
		
		
		Meal novegMeal = mb.prepareNonVegMeal().build();
		System.out.println("No Veg Meal");
		novegMeal.showItems();
		System.out.println("prix total : " + novegMeal.getCost());
		
		
		Meal customMeal = mb
				.prepareNonVegMeal()
				.addItem(new ChickenBurger())
				.addItem(new Pepsi())
				.build();
		System.out.println("\n\nCustom Meal");
		customMeal.showItems();
		System.out.println("prix total : " + customMeal.getCost());
		

		Meal familyMeal = mb
				.prepareNonVegMeal()
				.addItem(new ChickenBurger())
				.prepareVegMeal()
				.prepareNonVegMeal()
				.prepareNonVegMeal()
				.build();
		System.out.println("\n\nFamily Meal");
		familyMeal.showItems();
		System.out.println("prix total : " + familyMeal.getCost());
		
			
	}
}
