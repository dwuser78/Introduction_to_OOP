import java.util.List;

class Controller {
    private SteamService steamService;

    public Controller(SteamService steamService) {
        this.steamService = steamService;
    }

    public void steamSort(List<Steam> steams) {
        steamService.steamSort(steams);
    }
}