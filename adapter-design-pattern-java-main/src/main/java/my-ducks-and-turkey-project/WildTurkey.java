public class WildTurkey implements Turkey {

    @Override
    public void gobble() {
        System.out.println("Turkey:Gobble gobble...");
    }

    @Override
    public void fly() {
        System.out.println("Turkey:Short distance flight...");
    }
}
