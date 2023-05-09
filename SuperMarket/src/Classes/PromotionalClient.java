package Classes;

/**
 * Класс акционного клиента (наследуется от обычного клиента)
 */
public class PromotionalClient extends OrdinaryClient {

	private String nameAction;
	private static int countClient;

	/*
	 * Конструктор с 3 параметрами
	 * 
	 * @param name имя клиента
	 * 
	 * @param nameAction название акции
	 * 
	 * @param countClient номер клиента в акции
	 */
	public PromotionalClient(String name, String nameAction) {
		super(name);
		this.nameAction = nameAction;
	}

	public String getNameAction() {
		return nameAction;
	}

	public static int getCountClient() {
		return countClient;
	}

	public static int setCountClient() {
		return countClient += 1;
	}

}
