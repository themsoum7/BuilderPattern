public class Pizza {
    private String cheese = "";
    private String meat = "";
    private String vegetables = "";
    private String type = "";

    public void setCheese(String cheese) {
        this.cheese = cheese;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public void setVegetables(String vegetables) {
        this.vegetables = vegetables;
    }

    public void setType(String type){
        this.type = type;
    }

    public String toString(){
        return "U have chosen " + type + " pizza." + " Ur pizza with " + cheese + ", " + meat + ", " + vegetables + ".";
    }
}
