import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudyGroup group1 = new StudyGroup("Group 1");
        StudyGroup group2 = new StudyGroup("Group 2");
        StudyGroup group3 = new StudyGroup("Group 3");

        Steam steam1 = new Steam();
        steam1.addGroup(group1);
        steam1.addGroup(group2);

        Steam steam2 = new Steam();
        steam2.addGroup(group3);

        SteamService steamService = new SteamService();
        Controller controller = new Controller(steamService);

        List<Steam> steams = new ArrayList<>();
        steams.add(steam1);
        steams.add(steam2);
        controller.steamSort(steams);

        for (Steam steam : steams) {
            System.out.println("Steam:");
            for (StudyGroup group : steam) {
                System.out.println("- " + group.getName());
            }
        }
    }
}