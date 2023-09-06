package HW2;

import HW2.Classes.*;
import HW2.Interfaces.iActorBehaviour;

public class App {
    public static void main(String[] args) throws Exception {
        Market magnit = new Market();

        iActorBehaviour client1 = new OrdinaryClient("boris");
        iActorBehaviour client2 = new SpecialClient("prezident", 1);
        iActorBehaviour client3 =new TaxInspector();
        iActorBehaviour client4 = new PromotionClient("Иван", "Summer Sale", 56, 11);

        magnit.acceptToMarket(client1);
        magnit.acceptToMarket(client2);
        magnit.acceptToMarket(client3);
        magnit.acceptToMarket(client4);

        magnit.update();

        PromotionClient promoClient = (PromotionClient) client4;

        if (promoClient.isParticipantsLimit()) {
            System.out.println("Количество участников в акции превышено, клиент " + promoClient.getName()
                    + " не может участвовать в акции");
        }

    }
}
