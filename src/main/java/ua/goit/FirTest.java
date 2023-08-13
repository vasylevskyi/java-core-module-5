package ua.goit;

import javax.print.attribute.standard.OrientationRequested;

class FirTest {
    public int test(FirNum firNum, int number) {
        return firNum.calc(number);
    }

    public static void main(String[] args) {
/*        FirNum firNum = new FirNum();
        FirTest firTest = new FirTest();

        //Should be 10
        System.out.println(firTest.test(firNum, 10));*/

/*        FirNum firNum = new FirNumSum();
        FirTest firTest = new FirTest();

        //Should be 6
        System.out.println(firTest.test(firNum, 3));*/

        FirNum firNum = new FirNumFactorial();
        FirTest firTest = new FirTest();

        //Should be 120
        System.out.println(firTest.test(firNum, 5));
    }
}
class FirNum {
    public int calc(int n) {
        return n;
    }
}

class FirNumSum extends FirNum {
    @Override
    public int calc(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        return sum;
    }
}

class FirNumFactorial extends FirNum {
    @Override
    public int calc(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int factorial = n * calc(n - 1);
        return factorial;

/*        OR
        int result = 1;
        for(int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;    */
    }
}
