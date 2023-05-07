package Products;

// класс горячий напиток для вендингового аппарата (потомок класса Product)
public class HotDrink extends Product {

	// объем напитка:
	private int volume;
	// температура напитка:
	private int temp;

	/**
	 * * Конструктор напитка с 4 параметрами
	 * * @param name название товара (унаследовано от родителя)
	 * * @param price цена товара (унаследовано от родителя)
	 * * @param volume объем напитка
	 * * @param temp температура напитка
	 */
	public HotDrink(String name, double price, int volume, int temp) {
		super(name, price);
		this.volume = volume;
		this.temp = temp;
	}

	// получить объем напитка:
	public int getVolume() {
		return volume;
	}

	// задать объем напитка:
	public void setVolume(int volume) {
		this.volume = volume;
	}

	// получить температуру напитка:
	public int getTemp() {
		return temp;
	}

	// задать температуру напитка:
	public void setTemp(int temp) {
		this.temp = temp;
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
				", temp=" + temp +
				'}';
	}
}
