public class Main {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        Duck redhead = new RedheadDuck();
        Duck rubberDuck = new RubberDuck();

        String mallardOutput = mallard.performFly();
        String redheadOutput = redhead.performFly();
        String rubberDuckOutput = rubberDuck.performFly();

        // Change the fly behavior dynamically
        mallard.setFlyBehavior(new FlyRocketPowered());
        String rocketMallardOutput = mallard.performFly();

        // Create a WildTurkey
        WildTurkey turkey = new WildTurkey();
        turkey.gobble();
        // Use the TurkeyAdapter to make the turkey behave like a duck
        Duck turkeyAdapter = new TurkeyAdapter(turkey);
        String turkeyAdapterOutput = turkeyAdapter.performFly();

        System.out.println("Mallard duck: " + mallardOutput);
        System.out.println("Redhead duck: " + redheadOutput);
        System.out.println("Rubber duck: " + rubberDuckOutput);
        System.out.println("Mallard duck with rocket: " + rocketMallardOutput);
        System.out.println("Turkey adapted to duck: " + turkeyAdapterOutput);
    }
}
