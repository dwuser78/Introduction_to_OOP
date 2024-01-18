public class Person {
    private String name;

    @Override
    public String toString() {
        return this.getName();
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
