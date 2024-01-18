public class Main {
    public static void main(String[] args) {
        HotDrink drink1 = new HotDrink("Coffee", 250);
        HotDrinkExtended drink2 = new HotDrinkExtended("Coffee",
                                                250, 50);
        HotDrinkExtended drink3 = new HotDrinkExtended("Tea",
                                                250, 60);

        System.out.println("Name: " + drink2.getName());
        System.out.println("Volume: " + drink2.getVolume());
        System.out.println("Temperature: " + drink2.getTemperature());

        System.out.println("Name: " + drink3.getName());
        System.out.println("Volume: " + drink3.getVolume());
        System.out.println("Temperature: " + drink3.getTemperature());

        VendingMachine VM1 = new VendingMachine();
        VendingMachine VM2 = new VendingMachine();

        VM1.insertCoin(1);
        VM1.selectDrink(2);
        VM1.getProduct(2,250, 10);

        VM2.insertCoin(5);
        VM2.selectDrink(3);
        VM1.getProduct(3,250, 10);
    }
}