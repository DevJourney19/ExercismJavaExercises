package birdwatcher;

public class Main {

    public static void main(String[] args) {
        int semana1[] = {1, 2, 0, 4, 5, 6, 7};
        //Se crea un nuevo array
        BirdWatcher bw = new BirdWatcher(semana1);
        System.out.println(bw.getCountForFistDays(5));
    }
}
