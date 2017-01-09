public class Waiter {
    private MakePizza pizzaMaker;

    public void setPizzaMaker(MakePizza mp) {
        pizzaMaker = mp;
    }

    public Pizza getPizza() {
        return pizzaMaker.getPizza();
    }

    public void constructPizza() {
        pizzaMaker.makePizza();
        pizzaMaker.addCheese();
        pizzaMaker.addMeat();
        pizzaMaker.addVegetables();
    }
}
