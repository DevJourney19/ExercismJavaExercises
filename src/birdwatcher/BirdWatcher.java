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

    //The sum of the bird count is performed within an established limit, starting from the begining of the week.
    //Se realiza la suma de la cantidad de los pajaros dentro de un limite establecido, comenzado desde el comienzo de la semana.
    public int getCountForFistDays(int numberOfDays) {
        //The limit allows you to restrict the number of the elements of the array to work with.
        //El limit permite restringir la cantidad del array para trabajar.
        return Arrays.stream(birdsPerDay).limit(numberOfDays).sum();
    }

    //The numbers of days is obtained in which more than 5 birds were surpassed.
    //Se obtiene la cantidad de días, en las cuales se superan de 5 a más de aves.
    public int getBusyDays() {
        return (int) Arrays.stream(birdsPerDay).filter(t -> t >= 5).count();
    }
}
