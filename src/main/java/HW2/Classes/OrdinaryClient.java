package HW2.Classes;

public class OrdinaryClient extends Actor {


    public OrdinaryClient(String name) {
        super(name);
    }

    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    public void setTakeOrder(boolean isTakeOrder) {
        super.isTakeOrder = isTakeOrder;
    }

    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    public void setMakeOrder(boolean isMakeOrder) {
        super.isMakeOrder = isMakeOrder;
    }

    public Actor getActor() {
        return this;
    };

    @Override
    public String getName() {
        return super.name;

    }

    @Override
    public void setName(String name) {
        super.name = name;

    }
}
