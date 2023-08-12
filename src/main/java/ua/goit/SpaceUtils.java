package ua.goit;

/**Module 5 Tasks 18
 * */

public class SpaceUtils {
    public static final int PLANET_COUNT = 8;
    public static final String HOME_PLANET_NAME = "Earth";
    public static final String HOME_STAR_NAME = "Sun";

    public static String pluralPlanets(int planetCount) {
        String pluralPlanetsMessage;
        if (planetCount == 1) {
            pluralPlanetsMessage = "1 planet";
        } else {
            pluralPlanetsMessage = Integer.toString(planetCount) + " planets";
        }
        return pluralPlanetsMessage;
    }

    public static String generateStartMessage(String shipName, String time) {
        return "Ship " + shipName + " start at " + time;
    }

    public static void main(String[] args) {
        System.out.println(SpaceUtils.PLANET_COUNT); // виводить до консолі 8;
        System.out.println(SpaceUtils.pluralPlanets(1)); // виводить до консолі 1 planet;
        System.out.println(SpaceUtils.pluralPlanets(5)); // виводить до консолі 5 planets;
        System.out.println(SpaceUtils.generateStartMessage("Earthkeeper", "20:40")); // виводить до консолі Ship Earthkeeper start at 20:40.

    }

}
