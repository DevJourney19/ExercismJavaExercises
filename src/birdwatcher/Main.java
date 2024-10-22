package birdwatcher;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int week[] = {1, 2, 0, 4, 5, 6, 7};
        BirdWatcher bw = new BirdWatcher(week);
        System.out.format("The bird count for the last week:  %n%s%n",
                Arrays.toString(bw.getLastWeek()));
    }
}
