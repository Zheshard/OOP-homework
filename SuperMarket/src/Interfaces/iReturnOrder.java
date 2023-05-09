package Interfaces;

public interface iReturnOrder {
	/*
	 * вернуть товар*@return true-успешно,false-
	 * если нет
	 */
	void returnOrder(boolean ReturnOrder);

	/*
	 * 
	 * товар успешно возвращен*@return true-успешно,false-
	 * если нет.
	 */
	void orderAccepted(boolean OrderAccepted);

}
