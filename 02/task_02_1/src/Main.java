public class Main {
    public static void main(String[] args) {
        Market market = new Market();

        Person person1 = new Person("Ivan");
        Person person2 = new Person("Katya");
        Person person3 = new Person("Marina");

        market.enqueue(person1);
        market.enqueue(person2);
        market.enqueue(person3);

        System.out.println("Queue size: " + market.size());
        System.out.println("The first person in the queue: " + market.dequeue());
        System.out.println("Queue size after deletion: " + market.size());

        Order order1 = new Order("Order 1");
        Order order2 = new Order("Order 2");

        market.placeOrder(order1);
        market.placeOrder(order2);

        market.update();
        market.update();
        market.update();
        market.update();
    }
}