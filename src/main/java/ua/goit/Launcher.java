package ua.goit;

/**Module 5 Task 33-
 * */

class Launcher {
    public static void main(String[] args) {
        Spaceport spaceport = new Spaceport();
        spaceport.launch();
    }
}

class Spaceport {
    private GasStation gasStation = new GasStation();
    public void launch() {
        gasStation.refuel();
    };
}

class GasStation {
    public void refuel() {
        System.out.println("Refuel done!");
    }
}