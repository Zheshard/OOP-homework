package Classes;

/**
 * Класс, описывающий обычного клиента (наследуется от абстрактного Actor)
 */
public class OrdinaryClient extends Actor {

	/**
	 * Конструктор с одним параметром
	 * 
	 * @param name имя клиента
	 */
	public OrdinaryClient(String name) {
		super(name);
	}

	/**
	 * переопределение метода получения имени клиента
	 */
	@Override
	public String getName() {
		return super.name;
	}

	/* статус зказа (заказ сделан/заказ не сделан) */
	@Override
	public boolean isMakeOrder() {
		return super.isMakeOrder;
	}

	/* статус зказа (получен/не получен) */
	@Override
	public boolean isTakeOrder() {
		return super.isTakeOrder;
	}

	/* установить статус заказа */
	@Override
	public void setMakeOrder(boolean makeOrder) {
		super.isMakeOrder = makeOrder;
	}

	/* установить статус получения заказа */
	@Override
	public void setTakeOrder(boolean pickUpOrder) {
		super.isTakeOrder = pickUpOrder;
	}

	/* получить информацию о клиенте */
	@Override
	public Actor getActor() {
		return this;
	}

	@Override
	public void orderAccepted(boolean orderAccepted) {
		super.isOrderAccepted = orderAccepted;
	}

	@Override
	public void returnOrder(boolean returnOrder) {
		super.isReturnOrder = returnOrder;
	}
}
