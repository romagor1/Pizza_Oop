public class Pizza {
    private String Composition;
    private PizzaType pizzaType;
    private int price;

    public Pizza(String composition, PizzaType pizzaType, int price) {
        Composition = composition;
        this.pizzaType = pizzaType;
        this.price = price;

    }

    @Override
    public String toString() {
        return "Pizza " + pizzaType;
    }

    public String toStringComposition() {
        return "Pizza " + pizzaType +", composition" + Composition+"\n";
    }


    public String getComposition() {
        return Composition;
    }

    public void setComposition(String composition) {
        Composition = composition;
    }

    public PizzaType getPizzaType() {
        return pizzaType;
    }

    public void setPizzaType(PizzaType pizzaType) {
        this.pizzaType = pizzaType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}


