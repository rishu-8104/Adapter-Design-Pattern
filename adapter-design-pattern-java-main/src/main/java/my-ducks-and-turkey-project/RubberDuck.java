public class RubberDuck extends Duck {
    public RubberDuck() {
        setFlyBehavior(new FlyNoWay());
    }
}
