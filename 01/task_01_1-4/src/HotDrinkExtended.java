public class HotDrinkExtended extends HotDrink{
    private int temperature;

    public HotDrinkExtended(String name, int volume, int temperature) {
        super(name, volume);
        this.temperature = temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }
}
