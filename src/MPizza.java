public class MPizza extends MakePizza {
    @Override
    public void addCheese() {
        pizza.setCheese("camembert");
    }

    @Override
    public void addMeat() {
        pizza.setMeat("salami, chicken");
    }

    @Override
    public void addVegetables() {
        pizza.setVegetables("without vegetables");
    }

    @Override
    public void addType() {
        pizza.setType("default");
    }
}
