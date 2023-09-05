package Interfaces;

import Classes.Actor;

public interface iQeueBehaviour {
    void takeInQueue(iActorBehaviour actor);

    void releaseFromQueue();

    void takeOrder();

    void giveOrder();

    Actor getActor();
}
