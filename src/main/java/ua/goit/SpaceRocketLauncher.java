package ua.goit;

/**Module 5 Tasks 6
 * */

public class SpaceRocketLauncher {
    private int bigRocketCount;

    private int smallRocketCount;

    public int getBigRocketCount() {
        return bigRocketCount;
    }

    public void setBigRocketCount(int bigRocketCount) {
        if (bigRocketCount < 0 || bigRocketCount > 100) {
            return;
        }
        this.bigRocketCount = bigRocketCount;
    }

    public int getSmallRocketCount() {
        return smallRocketCount;
    }

    public void setSmallRocketCount(int smallRocketCount) {
        if (smallRocketCount < 0 || smallRocketCount > 100) {
            return;
        }
        this.smallRocketCount = smallRocketCount;
    }

    public void launchBigRocket() {
        int bigRocketCounter = getBigRocketCount();
        if (bigRocketCounter > 0) {
            bigRocketCounter--;
            setBigRocketCount(bigRocketCounter);
            System.out.println("Launch big rocket");
        }
    }
    public void launchSmallRocket() {
        int smallRocketCounter = getSmallRocketCount();
        if (smallRocketCounter > 0) {
            smallRocketCounter--;
            setSmallRocketCount(smallRocketCounter);
            System.out.println("Launch small rocket");
        }
    }

    public int getTotalPower() {
        int smallRocketCounter = getSmallRocketCount();
        int biRocketCounter = getBigRocketCount();
        int totalPower;
        totalPower = smallRocketCounter * 50 + bigRocketCount * 100;
        return totalPower;
    }

    public static void main(String[] args) {
        SpaceRocketLauncher launcher = new SpaceRocketLauncher();
        launcher.setBigRocketCount(5);
        launcher.setSmallRocketCount(10);

        System.out.println("Power is " + launcher.getTotalPower());

        launcher.launchBigRocket();
        System.out.println("Big rocket count is " + launcher.getBigRocketCount());

        launcher.launchSmallRocket();
        System.out.println("Small rocket count is " + launcher.getSmallRocketCount());

        System.out.println("Power is " + launcher.getTotalPower());    }


}
