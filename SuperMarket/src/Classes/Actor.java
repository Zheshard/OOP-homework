package Classes;

import Interfaces.iActorBehaviour;
import Interfaces.iReturnOrder;

/*
 * Абстрактный класс родитель посетителей магазина с подключенным интерфейсом
 * действий посетителей
 */
public abstract class Actor implements iActorBehaviour, iReturnOrder {
	/* имя клиента */
	protected String name;
	/* статус зказа (получен/не получен) */
	protected boolean isTakeOrder;
	/* статус зказа (заказ сделан/заказ не сделан) */
	protected boolean isMakeOrder;

	/* заявка на возврат товара */
	protected boolean isReturnOrder;
	/* возвращение товара */
	protected boolean isOrderAccepted;

	/**
	 * Конструктор с одним параемтром
	 * 
	 * @param name имя клиента
	 */
	public Actor(String name) {
		this.name = name;
	}

	/**
	 * абстрактный метод получения имени клиента
	 * 
	 * @return
	 */
	public abstract String getName();

}
