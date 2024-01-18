import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Steam implements Iterable<StudyGroup> {
    private List<StudyGroup> groups;

    public Steam() {
        groups = new ArrayList<>();
    }

    public void addGroup(StudyGroup group) {
        groups.add(group);
    }

    @Override
    public Iterator<StudyGroup> iterator() {
        return groups.iterator();
    }

    public int getCount() {
        return groups.size();
    }
}