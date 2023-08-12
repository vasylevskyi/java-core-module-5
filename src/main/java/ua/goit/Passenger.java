package ua.goit;

/**Module 5 Tasks 11-12
 * */
abstract class Passenger {
    public abstract String getType();

    public abstract int getTicketPrice();

    public static void main(String[] args) {
/*        Passenger regular = new RegularPassenger();
        System.out.println(regular.getType()); //Regular
        System.out.println(regular.getTicketPrice()); //199*/

        Passenger vip = new VIPPassenger();
        System.out.println(vip.getType());  //VIP
        System.out.println(vip.getTicketPrice()); //399
    }
}

class RegularPassenger extends Passenger {
    @Override
    public String getType() {
        return "Regular";
    }
    @Override
    public int getTicketPrice() {
        return 199;
    }
}

class VIPPassenger extends Passenger {
    @Override
    public String getType() {
        return "VIP";
    }
    @Override
    public int getTicketPrice() {
        return 399;
    }
}
