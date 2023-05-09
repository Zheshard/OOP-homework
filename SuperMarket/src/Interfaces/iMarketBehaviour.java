package Interfaces;

import java.util.List;

import Classes.Actor;

/**
 * Интерфейс действий в магазине
 */
public interface iMarketBehaviour {
	/**
	 * Добавление клиента в магазин
	 * 
	 * @param actor клиент магазина
	 */
	void acceptToMarket(iActorBehaviour actor);

	/**
	 * Удаление клиента из магазина
	 * 
	 * @param actors клиент магазина
	 */
	void releaseFromMarket(List<Actor> actors);

	/*
	 * Обслуживание акционных клиентов
	 */
	void promotionalCustomerService(iActorBehaviour actor);

	/* обновление */
	void update();
}
