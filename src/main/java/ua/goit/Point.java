package ua.goit;

/**Module 5 Tasks 19
 * */

public class Point {
    private int x;

    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }

    private int y;
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }

    private int z;

    public int getZ() {
        return z;
    }
    public void setZ(int z) {
        this.z = z;
    }

    public static void main(String[] args) {
        Point p1 = new Point();
        p1.setX(1);
        p1.setY(1);
        p1.setZ(1);

        Point p2 = new Point();
        p2.setX(1);
        p2.setY(1);
        p2.setZ(1);

        System.out.println(p1.equals(p2)); //Will be false
    }
}

