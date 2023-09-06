package HW2.Classes;

public class PromotionClient extends Actor {

    private int id;
    private int participantCount;
    private String promotionName;

    public String getPromotionName() {
        return promotionName;
    }

    public void setPromotionName(String promotionName) {
        this.promotionName = promotionName;
    }

    public PromotionClient(String name, String promotionName, int id, int participantCount) {
        super(name);
        this.promotionName = promotionName;
        this.id = id;
        this.participantCount = participantCount;
    }

    public boolean isParticipantsLimit() {
        return participantCount > 10;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}