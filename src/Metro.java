import java.util.ArrayList;
import java.util.List;

public class Metro {

    public static void main(String[] args) {
        ArrayList<int[]> list = new ArrayList<int[]>();
        list.add(new int[] {10,0});
        list.add(new int[] {3,5});
        list.add(new int[] {2,5});
        System.out.println(countPassengers(list));
    }

    public static int countPassengers(ArrayList<int[]> stops) {

        int peopleInBus = 0;
        for (int[] stop: stops) {
            int peopleIn = stop[0];
            int peopleOut = stop[1];

            peopleInBus-= peopleOut;
            peopleInBus += peopleIn;
        }

        return peopleInBus;
    }
}
