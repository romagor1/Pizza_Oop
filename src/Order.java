public class Order {
    private int NumberOrder;
    private final Pizza pizza;
    private Client client;
    private int SumOrder;
    private boolean delivery;
    private String address;

    public Order(Pizza pizza, Client client) {
        NumberOrder = (int) (Math.random() * 100);
        this.pizza = pizza;
        this.client = client;
        if (!client.getAddress().isBlank() && client.getAddress() != null) {
            delivery = true;
            address = client.getAddress();
        }
        SumOrder = pizza.getPrice();
        //Номер заказа будет у клиента
        client.setOrder(NumberOrder);
    }

    @Override
    public String toString() {
        String NeedDelivery;
        if(delivery){
            NeedDelivery = "Delivery to the client";
        }else {
            NeedDelivery = " Self-delivery";
        }

        return "Order" + '\n' +
                "Number order: " + NumberOrder +
                ", pizza: " + pizza +
                ", client: " + client +
                ", SumOrder: " + SumOrder +
                ", Delivery: " + NeedDelivery +
                '\n';
    }

    public boolean isDelivery() {
        return delivery;
    }


    public String getAddress() {
        return address;
    }

    public int getNumberOrder() {
        return NumberOrder;
    }

    public void setNumberOrder(int numberOrder) {
        NumberOrder = numberOrder;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public int getSumOrder() {
        return SumOrder;
    }

    public void setSumOrder(int sumOrder) {
        SumOrder = sumOrder;
    }
}
