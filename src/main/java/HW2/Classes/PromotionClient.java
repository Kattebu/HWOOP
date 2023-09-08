package HW2.Classes;

public class PromotionClient extends Actor {

    private int id;
    private int participantCount;
    private String promotionName;

    public PromotionClient(String name, String promotionName, int id, int participantCount) {
        super(name);
        this.promotionName = promotionName;
        this.id = id;
        this.participantCount = participantCount;
    }

    /**
     * Метод, возвращающий название акции
     */
    public String getPromotionName() {
        return promotionName;
    }

    /**
     * Метод, устанавливающий название акции
     */
    public void setPromotionName(String promotionName) {
        this.promotionName = promotionName;
    }

    /**
     * Метод, проверяющий, превышено ли количество участников акции
     */
    public boolean isParticipantsLimit() {
        return participantCount > 10;
    }
    /**
     * Метод приинятия заказа
     */
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }
    /**
     * Метод, проверяющий приинят ли заказ
     */
    public void setTakeOrder(boolean isTakeOrder) {
        super.isTakeOrder = isTakeOrder;
    }
    /**
     * Метод осуществления заказа
     */
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }
    /**
     * Метод, проверяющий осуществлен ли заказ
     */
    public void setMakeOrder(boolean isMakeOrder) {
        super.isMakeOrder = isMakeOrder;
    }

    public Actor getActor() {
        return this;
    }

    /**
     * Метод, возвращающий имя участника
     */

    @Override
    public String getName() {
        return super.name;

    }
    /**
     * Метод, устанавливающий имя участника
     */
    @Override
    public void setName(String name) {
        super.name = name;

    }

    /**
     * Метод, возвращающий id клиента
     */
    public int getId() {
        return id;
    }

    /**
     * Метод, устанавливающий id клиента
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Метод, возвращающий количество участников в акции
     */
    public int getParticipantCount() {
        return participantCount;
    }

    /**
     * Метод, устанавливающий количество участников в акции
     */
    public void setParticipantCount(int participantCount) {
        this.participantCount = participantCount;
    }
}