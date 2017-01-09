public class Main2 {
    public static void main(String[] args) {
        Waiter wr = new Waiter();
        Waiter wr1 = new Waiter();

        MakePizza meatPizza = new MPizza();
        wr.setPizzaMaker(meatPizza);
        wr.constructPizza();

        MakePizza vegetablePizza = new VPizza();
        wr1.setPizzaMaker(vegetablePizza);
        wr1.constructPizza();

        Pizza pizza = wr.getPizza();
        Pizza pizza1 = wr1.getPizza();
        System.out.println(pizza);
        System.out.println(pizza1);
    }
}