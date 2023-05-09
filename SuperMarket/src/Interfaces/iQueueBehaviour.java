package Interfaces;

/**
 * Интерфейс действий в очереди
 */
public interface iQueueBehaviour {
	/**
	 * Добавление клиента в очередь
	 * 
	 * @param actor
	 */
	void takeInQueue(iActorBehaviour actor);

	/* Удаление из очереди */
	void releaseFromQueue();

	/* осуществление заказа */
	void takeOrder();

	/* получение заказа */
	void giveOrder();

}
