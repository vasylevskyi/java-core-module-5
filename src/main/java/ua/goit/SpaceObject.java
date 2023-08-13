package ua.goit;

public abstract class SpaceObject {

}

abstract class Planet extends SpaceObject {

}

class Moon extends SpaceObject {

}

class Mars extends Planet {

}

class PlanetTester {
    String test(SpaceObject object) {
        if (object instanceof Planet) {
            return "planet";
        }
        return "not planet";
    }
}

class Run {
    public static void main(String[] args) {
        PlanetTester tester = new PlanetTester();
        System.out.println(tester.test(new Mars())); //Should be "planet"
        System.out.println(tester.test(new Moon())); //Should be "not planet"
    }
}



