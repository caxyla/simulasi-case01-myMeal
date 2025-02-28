
public class Order {

	private static int ordered;
	private User user;
	private Food food;
	private String date;
	
	
	public Order(User user, Food food, String date) {
		
		this.user = (user);
		this.food = (food);
		this.date = (date);
		ordered += 1;
		
	}
	
	public static int getCount() {
		return ordered;
	}

	public User getUser() {
		return user;
	}

	public Food getFood() {
		return food;
	}

	public String getDate() {
		return date;
	}





	
}
