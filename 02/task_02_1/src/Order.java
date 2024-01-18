public class Order {
    @Override
    public String toString() {
        return this.getName();
    }

    private String name;

    public Order(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
