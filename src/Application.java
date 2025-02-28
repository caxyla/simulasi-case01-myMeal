
import java.util.ArrayList;
import java.util.HashSet;

public class Application {
	
	ArrayList<Food> foods;
	HashSet<User> users;
	ArrayList<Ingredient> ingredients;
	ArrayList<Order> ordered;

	public Application() {
		
		foods = new ArrayList<Food>();
		users = new HashSet<User>();
		ingredients = new ArrayList<Ingredient>();
		ordered = new ArrayList<Order>();
		
	}

	public void addNewFood(Food food) {
		
		System.out.println(food.getName() + " was successfully added to the kitchen");
		foods.add(food);
		
	}

	public void displayFoods() {
		
		
		
		if(foods.isEmpty()) {
			System.out.println("There's no current food");
		} else {

			System.out.println("Food List:");
			System.out.println("--------------------------------------------------------------------------------");
			
			for(Food food: foods) {

				System.out.printf("%s (%dKcal)\n", food.getName(), food.getKalori());
				System.out.printf("Description: %s\n", food.getDesc());
				System.out.printf("Spicy Level : %d\n", food.getSpicyLevel());
				System.out.println("Ingredients: ");
				food.getIngredients();

				
			}
			
		}
		
	}

	public void order(User user, Food food, String date) {
	
		
		ordered.add(new Order(user, food, date));	
		System.out.println(user.getName() + " ordered " + food.getName() + " on " + date);
		
	}

	public void displayOrders() {
		
		if (ordered.isEmpty()) {
			System.out.println("No order recorded");
		} else {
			System.out.println("Order List:\r\n"
					+ "----------------------------------------------------------------------------------------------------");
			
			
			for(Order order : ordered) {
				System.out.println("User : " + order.getUser().getName() + "- " + order.getUser().getId());
				System.out.println("Food : " + order.getFood().getName());
				System.out.println("Date : " + order.getDate());
				System.out.println("----------------------------------------------------------------------------------------------------");
			}
			
		}
		
	}


	
	

}
