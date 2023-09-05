package Interfaces;

import Classes.Actor;
import Classes.Market;

public interface iActorBehaviour {
    public boolean isTakeOrder();

    public boolean isMakeOrder();

    public void setTakeOrder(boolean take);

    public void setMakeOrder(boolean make);

    Actor getActor();

    public String getName();

    default void acceptToMarket(Market market) {
        System.out.println(getName() + " клиент пришел в магазин ");
        market.takeInQueue(this);
    }
}
