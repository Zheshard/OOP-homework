package Products;

// класс бутылка с напитком для вендингового аппарата (потомок класса Product)
public class BottleOfWater extends Product {

	// объем напитка:
	private int volume;

	/**
	 * * Конструктор напитка с 3 параметрами
	 * * @param name название товара (унаследовано от родителя)
	 * * @param price цена товара (унаследовано от родителя)
	 * * @param volume объем напитка
	 */
	public BottleOfWater(String name, double price, int volume) {
		super(name, price);
		this.volume = volume;
	}

	// получить объем напитка:
	public int getVolume() {
		return volume;
	}

	// задать объем напитка:
	public void setVolume(int volume) {
		this.volume = volume;
	}

	/**
	 * переопределение вывода продукта
	 */
	@Override
	public String toString() {
		return "Product{" +
				"name='" + super.getName() + '\'' +
				", cost=" + super.getPrice() +
				", volume=" + volume +
				'}';
	}
}
