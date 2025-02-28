
import java.util.ArrayList;

public class Food {
	
	ArrayList<Ingredient> ingredients;
	private String name;
	private String desc;
	private int kalori;
	private int spicyLevel;
	
	public Food(String name, String desc, int spicyLevel, int kalori) {
		
		this.name=(name);
		this.desc = desc;
		this.spicyLevel = spicyLevel;
		this.kalori = kalori;
		ingredients = new ArrayList<Ingredient>();
		
	}
	
	public void addIngredient(Ingredient ingridents) {
		
		ingredients.add(ingridents);
		
	}
	
		public void getIngredients() {
			
			System.out.print(ingredients.getFirst());
			
	        for (int i = 1; i < ingredients.size(); i++) {
	            System.out.print(", " + ingredients.get(i).getName());
	        }
			
			
			System.out.println("\n----------------------------------------------------------------------------------------------------");
		}

	public String getName() {
		return name;
	}

	public String getDesc() {
		return desc;
	}

	public int getKalori() {
		return kalori;
	}

	public int getSpicyLevel() {
		return spicyLevel;
	}
	
	
	
}
