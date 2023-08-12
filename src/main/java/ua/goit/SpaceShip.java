package ua.goit;

/**Module 5 Tasks 1-5
 *
 *
 * */

public class SpaceShip {
    private String name;

    private String serialNumber;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        if (name.isBlank() || name.length() > 100) {
            return;
        }
        this.name = name;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        if (serialNumber.length() != 8) {
            return;
        }

        if (!serialNumber.startsWith("SN")) {
            return;
        }

        this.serialNumber = serialNumber;
/*
        OR
        if (serialNumber.startsWith("SN") && serialNumber.length() == 8) {
            this.serialNumber = serialNumber;
*/
        }

    public void printInfo() {
        System.out.printf("Name is %s, serial number is %s", getName(), getSerialNumber());
    }

    //Test output
    public static void main(String[] args) {
        SpaceShip ship = new SpaceShip();
/*        ship.setName("Walker");
        System.out.println(ship.getName()); //Should be Walker

        ship.setName("");
        System.out.println(ship.getName()); //Should be Walker, empty value ignored

        ship.setName("Voyager ".repeat(100));
        System.out.println(ship.getName()); //Should be Walker, too long value ignored*/

/*        SpaceShip ship = new SpaceShip();

        ship.setSerialNumber("SN506788");
        System.out.println(ship.getSerialNumber()); //Should be SN506788

        ship.setSerialNumber("EE123456");
        System.out.println(ship.getSerialNumber()); //Should be SN506788 - old value*/

        ship.setName("Voyager");
        ship.setSerialNumber("SN506788");

        //Name is Voyager, serial number is SN504030
        ship.printInfo();
    }



}
