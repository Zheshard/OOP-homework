package Interfaces;

import Classes.Actor;

/**
 * Интерфейс действий посетителя
 */
public interface iActorBehaviour {
	/* установить статус заказа */
	void setMakeOrder(boolean makeOrder);

	/* установить статус получения заказа */
	void setTakeOrder(boolean pickUpOrder);

	/* статус зказа (заказ сделан/заказ не сделан) */
	boolean isMakeOrder();

	/* статус зказа (получен/не получен) */
	boolean isTakeOrder();

	/* получить информацию о клиенте */
	Actor getActor();
}
