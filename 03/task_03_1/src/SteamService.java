import java.util.List;
class SteamService {
    public void steamSort(List<Steam> steams) {
        steams.sort(new StreamComparator());
    }
}