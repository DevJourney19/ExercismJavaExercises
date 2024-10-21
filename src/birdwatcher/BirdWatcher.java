package birdwatcher;

import java.util.Arrays;

public class BirdWatcher {

    private final int[] birdsPerDay;

    //A new array is created, which will be an independent copy of the inserted array.
    //Se crea un nuevo array el cual será una copia independiente del array insertado
    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    //Let's go to obtain the previous array
    //Vamos a obtener el array anterior
    public int[] getLastWeek() {
        return this.birdsPerDay;
    }

    //Today's bird count is obtained
    //Se obtiene la cantidad de pájaros de hoy
    public int getToday() {
        return birdsPerDay[birdsPerDay.length - 1];
    }

    //Today's bird count is incremented by one
    //Se aumenta en uno a la cantidad de pajaros de hoy
    public void incrementsTodaysCount() {
        int incrementedByOne = birdsPerDay[birdsPerDay.length - 1] + 1;
        birdsPerDay[birdsPerDay.length - 1] = incrementedByOne;
    }

    //It is verified if there were no birds during the week.
    //Se verifica si no hubo pájaros en la semana
    public boolean hasDayWithoutBirds() {
        return Arrays.stream(birdsPerDay).anyMatch(t -> t == 0);
    }

    //se realiza la suma de la cantidad de los pajaros denbtro de un limite establecido, comenzado desde el comienzo de la semana.
    public int getCountForFistDays(int numberOfDays) {
        int sum = 0;
        if (numberOfDays > 7) {
            for (int i = 0; i < 7; i++) {
                sum += birdsPerDay[i];
            }
            return sum;
        }

        for (int i = 0; i < numberOfDays; i++) {
            sum += birdsPerDay[i];
        }
        return sum;

    }

    public int getBusyDays() {
        int count = 0;
        for (int i = 0; i < birdsPerDay.length; i++) {
            if (birdsPerDay[i] >= 5) {
                count++;
            }
        }
        return count;
    }


}
