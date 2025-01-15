import java.io.Console;

public class Main {
    public static void main(String[] args) {
        //Создали 3 вида пицц
        Pizza pizza1 = new Pizza("Piperoni,Dough 30 cm", PizzaType.PIPERONI, 600);
        Pizza pizza2 = new Pizza("Tomato,dough 35 cm",PizzaType.Traditional,550);
        Pizza pizza3 = new Pizza("Chicken, ham, cheese 25 cm",PizzaType.Meat,650);

        System.out.println("-----------------Меню--------------");
        System.out.println(pizza1);
        System.out.println(pizza2);
        System.out.println(pizza3);

        //Создаем клиентов
        Client client1 = new Client("Alex","Saratov,dom 2");
        Client client2 = new Client("Roma");

        System.out.println("--------------Клиенты-----------------------");
        System.out.println(client1);
        System.out.println(client2);

        //Принимаем заказы клиентов, передаем им заказы

        Order order1 = new Order(pizza1,client1);
        Order order2 = new Order(pizza2,client2);

        System.out.println("--------------Выдали заказы клиентам-----------------------");
        System.out.println(order1);
        System.out.println(order2);
        System.out.println("-------------------------------------------");

    }
}

enum PizzaType{
    PIPERONI,
    Traditional,
    Hawaiian,
    Meat,
    Mushroom,
}