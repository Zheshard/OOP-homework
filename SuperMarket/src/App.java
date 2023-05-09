import Classes.Market;
import Classes.OrdinaryClient;
import Classes.SpecialClient;
import Classes.PromotionalClient;
import Interfaces.iActorBehaviour;

public class App {
	public static void main(String[] args) throws Exception {
		// Market market = new Market();
		// OrdinaryClient client1 = new OrdinaryClient("Boris");
		// OrdinaryClient client2 = new OrdinaryClient("Dasha");
		// SpecialClient client3 = new SpecialClient("Fedor", 1101);
		// market.acceptToMarket(client1);
		// market.acceptToMarket(client2);
		// market.acceptToMarket(client3);
		// market.update();

		Market market = new Market();
		iActorBehaviour item1 = new OrdinaryClient("Boris");
		iActorBehaviour item2 = new PromotionalClient("Anton", "Акция");
		iActorBehaviour item3 = new SpecialClient("Fedor", 1101);
		iActorBehaviour item4 = new OrdinaryClient("Dasha");
		iActorBehaviour item5 = new PromotionalClient("Egor", "Акция");
		iActorBehaviour item6 = new OrdinaryClient("Boriska");
		iActorBehaviour item7 = new PromotionalClient("Egorka", "Акция");
		iActorBehaviour item8 = new SpecialClient("Igor", 1102);
		iActorBehaviour item9 = new OrdinaryClient("Dasha");

		market.acceptToMarket(item1);
		market.acceptToMarket(item2);
		market.acceptToMarket(item3);
		market.acceptToMarket(item4);
		market.acceptToMarket(item5);
		market.acceptToMarket(item6);
		market.acceptToMarket(item7);
		market.acceptToMarket(item8);
		market.acceptToMarket(item9);

		market.update();
	}
}
