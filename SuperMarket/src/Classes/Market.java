package Classes;

import java.util.ArrayList;
import java.util.List;

import Interfaces.iActorBehaviour;
import Interfaces.iMarketBehaviour;
import Interfaces.iQueueBehaviour;

/**
 * Класс магазин, с подключенными интерфейсами действий посетителей в магазине и
 * действий в очереди
 */
public class Market implements iMarketBehaviour, iQueueBehaviour {
	// private List<Actor> queue;
	private List<iActorBehaviour> queue;

	/**
	 * Конструктор создания очереди
	 */
	public Market() {
		this.queue = new ArrayList<iActorBehaviour>();
	}

	/* Добавление а в магазин */
	@Override
	public void acceptToMarket(iActorBehaviour actor) {
		System.out.println(actor.getActor().getName() + " пришел в магазин ");
		takeInQueue(actor);
	}

	/* Добавление в очередь */
	@Override
	public void takeInQueue(iActorBehaviour actor) {
		this.queue.add(actor);
		System.out.println(actor.getActor().getName() + " добавлен в очередь ");
		promotionalCustomerService(actor);
	}

	/* Удаление а из магазина */
	@Override
	public void releaseFromMarket(List<Actor> actors) {
		for (Actor actor : actors) {
			System.out.println(actor.getName() + " ушел из магазина ");
			queue.remove(actor);
		}

	}

	/* Обновление состояния магазина */
	@Override
	public void update() {
		takeOrder();
		giveOrder();
		releaseFromQueue();
	}

	/* Получение заказа */
	@Override
	public void giveOrder() {
		for (iActorBehaviour actor : queue) {
			if (actor.isMakeOrder()) {
				actor.setTakeOrder(true);
				System.out.println(actor.getActor().getName() + " получил свой заказ ");
			}
			if (actor instanceof SpecialClient) {
				System.out.println(actor.getActor().getName() + " получил скидку ");
			}
		}

	}

	/* Удаление из очереди */
	@Override
	public void releaseFromQueue() {
		List<Actor> releaseActors = new ArrayList<>();
		for (iActorBehaviour actor : queue) {
			if (actor.isTakeOrder()) {
				releaseActors.add(actor.getActor());
				System.out.println(actor.getActor().getName() + " ушел из очереди ");
			}
		}
		releaseFromMarket(releaseActors);
	}

	/* Оформление заказа */
	@Override
	public void takeOrder() {
		for (iActorBehaviour actor : queue) {
			if (!actor.isMakeOrder()) {
				actor.setMakeOrder(true);
				System.out.println(actor.getActor().getName() + " сделал заказ ");
			}
		}
	}

	/* Обслуживание акционных клиентов */
	@Override
	public void promotionalCustomerService(iActorBehaviour actor) {
		int numPromItems = 2;
		if ((actor instanceof PromotionalClient)) {
			System.out.println(actor.getActor().getName() + " акционный клиент ");
			PromotionalClient.setCountClient();
			if ((actor instanceof PromotionalClient) && (PromotionalClient.getCountClient() > numPromItems)) {
				System.out.println(actor.getActor().getName() + " не участвует в акции из за превышения числа участников ");
			}
		}

	}

}
