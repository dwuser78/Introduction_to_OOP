public class VendingMachine implements TradeAutomaton {
    @Override
    public void insertCoin(int coin) {
        System.out.println("Inserting coin " + coin);
    }


    @Override
    public void selectDrink(int drink) {
        System.out.println("Selecting drink " + drink);
    }


    @Override
    public void getProduct(int name, int volume, int temperature) {
        System.out.println("Dispensing " + volume + "ml of " + getNameFromId(name) + " at " + temperature + " degrees");
    }


    private String getNameFromId(int id) {
        switch (id) {
            case 1:
                return "Cola";
            case 2:
                return "Sprite";
            case 3:
                return "Fanta";
            case 4:
                return "Coffee";
            default:
                return "Unknown drink";
        }
    }
}
