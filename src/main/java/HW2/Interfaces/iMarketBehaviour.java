package HW2.Interfaces;

import HW2.Classes.Actor;

import java.util.List;

public interface iMarketBehaviour {

    void acceptToMarket(iActorBehaviour actor);

    void releaseFromMarket(List<Actor> actors);

    void update();
}
