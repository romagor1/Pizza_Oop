public class Client {
    private String name;
    private String Address;
    private int order;

    public Client(String name, String address) {
        this.name = name;
        Address = address;
        this.order = 0;
    }
    public Client(String name) {
        this.name = name;
        Address = "";
        this.order = 0;
    }

    public String toString() {
        return "Name=" + name +
                ", Address='" + Address + '\'' +
                ", order=" + order;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return Address;
    }

    public int getOrder() {
        return order;
    }
}
