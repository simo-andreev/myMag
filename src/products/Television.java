package products;

import main.Products;
import main.Products.Saleable;

public abstract class Television extends Products implements Saleable{
	
	enum TVModels{PANASONIC,LG,SAMSUNG,STARLIGHT};
	
	protected TVModels televisions;

	public Television(String name, double price, int number,TVModels televisions) {
		super(name, price, number, Categories.IT);
		this.televisions = televisions;
	}
}
