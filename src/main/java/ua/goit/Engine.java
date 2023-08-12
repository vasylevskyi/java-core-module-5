package ua.goit;

/**Module 5 Tasks 7
 * */

public class Engine {
    private int power;

    public int getPower () {
        return power;
    }
    public void setPower(int power) {
        this.power = power;
    }
    public String getFuelType() {
        String fuelType = "A500";
        return fuelType;
    }

    public static void main(String[] args) {
        System.out.println(new Engine().getFuelType());
    }
}
