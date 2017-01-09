public class VPizza extends MakePizza {
    @Override
    public void addCheese() {
        pizza.setCheese("mozzarella");
    }

    @Override
    public void addMeat() {
        pizza.setMeat("chicken");
    }

    @Override
    public void addVegetables() {
        pizza.setVegetables("ruccola, tomato, pepper");
    }

    @Override
    public void addType() {
        pizza.setType("margarita");
    }
}