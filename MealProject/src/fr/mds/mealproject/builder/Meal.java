package fr.mds.mealproject.builder;

import java.util.ArrayList;
import java.util.List;

public class Meal {
	
	private List<Item> items = new ArrayList<>();
	private float price;
	
	public void addItem(Item item) {
		this.items.add(item);
		this.price = this.price + item.price();
	}
	
	public float getCost() {
		return price;
	}
	
	public void showItems() {
		for (Item item : items) {
			System.out.println(item);
		}
	}
}
