abstract class MakePizza {
    Pizza pizza;

    public Pizza getPizza(){
        return pizza;
    }

    public void makePizza(){
        pizza = new Pizza();
    }

    public abstract void addCheese();
    public abstract void addMeat();
    public abstract void addVegetables();
    public abstract void addType();
}
