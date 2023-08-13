package ua.goit;

/**Module 5 Tasks 24
 * */

public class Stars {
    private int count;

    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return starsConverter();
    }
    private String starsConverter() {
        int[] starsQuantity = {1000, 100, 10, 1};
        String[] starsSymbols = {"X", "Y", "Z", "*"};
        int calculatedSum = count;
        int index = 0;
        String result= "";

        while (calculatedSum > 0) {
            if (calculatedSum >= starsQuantity[index]) {
                calculatedSum -= starsQuantity[index];
                result += starsSymbols[index];
            } else {
                index++;
            }
         }
        return result;

    }

    public static void main(String[] args) {
        Stars stars = new Stars();
        stars.setCount(153);
        System.out.println(stars);
        System.out.println(stars.getCount());
    }
}
