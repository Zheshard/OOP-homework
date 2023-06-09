package Classes;

/**
 * Класс, описывающий VIP клиента (наследуется от абстрактного Actor)
 */
public class SpecialClient extends Actor {
	/* Идентификатор VIP клиента */
	private int idVIP;

	public SpecialClient(String name, int idVIP) {
		super(name);
		this.idVIP = idVIP;
	}

	@Override
	public String getName() {
		return super.name;
	}

	public int getIdVIP() {
		return idVIP;
	}

	@Override
	public boolean isMakeOrder() {
		return super.isMakeOrder;
	}

	@Override
	public boolean isTakeOrder() {
		return super.isTakeOrder;
	}

	@Override
	public void setMakeOrder(boolean makeOrder) {
		super.isMakeOrder = makeOrder;
	}

	@Override
	public void setTakeOrder(boolean pickUpOrder) {
		super.isTakeOrder = pickUpOrder;
	}

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