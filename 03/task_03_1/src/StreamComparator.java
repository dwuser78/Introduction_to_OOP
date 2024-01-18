import java.util.Comparator;

public class StreamComparator implements Comparator<Steam> {
    @Override
    public int compare(Steam steam1, Steam steam2) {
        int groupCount1 = steam1.getCount();
        int groupCount2 = steam2.getCount();

        return Integer.compare(groupCount1, groupCount2);
    }
}