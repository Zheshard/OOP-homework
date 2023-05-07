package VendingMachines;

import Products.Product;
import java.util.ArrayList;
import java.util.List;

/**
 * Вендинговый аппарат
 */
public class VendingMachine {

	// вместимость аппарата:
	private int volume;
	// список продуктов:
	private List<Product> products; // = new ArrayList<Product>();
	// log операций по продаже проуктов:
	private List<String> workLog;// = new ArrayList<String>();

	/**
	 * Конструктор вендинг аппарата
	 * 
	 * @param volume колчиество единиц товара в аппарате
	 */
	public VendingMachine(int volume) {
		this.volume = volume;
		products = new ArrayList<>();
		workLog = new ArrayList<String>();
	}

	// добавление продукта в аппарат:
	public void addProduct(Product prod) {
		if (this.volume > products.size()) {
			products.add(prod);
		} else {
			throw new IllegalStateException(String.format("Аппарат заполнен!", this.volume));
		}
	}

	// продажа продукта (запись в log)
	public void addSales(String line) {
		workLog.add(line);
	}

	// вернуть продукт по названию:
	public Product getProdByName(String name) {
		for (Product prod : products) {
			if (prod.getName().contains(name)) {
				return prod;
			}
		}
		return null;
	}

	// вернуть все оставшиеся продукты:
	public List<Product> getProdAll() {
		return products;
	}
}
