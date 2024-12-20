public abstract class Duck {
    private FlyBehavior flyBehavior;

    public Duck() {
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public String performFly() {
        return flyBehavior.fly();
    }
}
