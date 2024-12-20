public class TurkeyAdapter extends Duck {
   private Turkey turkey;

   public TurkeyAdapter(Turkey turkey) {
       this.turkey = turkey;
   }

   @Override
    public String performFly() {
   turkey.fly();
   return "Turkey is flying (adapted)";
}
}
