package ro.ase.cts.singleton.main;

import ro.ase.cts.singleton.Hotel;

public class Main {
    public static void main(String[] args) {
        Hotel hotel1 = Hotel.getInstance("Ramada", 7, 5);
        Hotel hotel2 = Hotel.getInstance("Grand Hotel", 200, 0);

        hotel1.rezervaCamera();
        hotel1.rezervaCamera();

        hotel2.rezervaCamera();
        hotel2.rezervaCamera();

    }
}
