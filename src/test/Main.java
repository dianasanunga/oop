
package test;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int c = 0;
        System.out.println("a: " + a);
        System.out.println("c: " + c);
        printSum(a, c);
        printDiv(a, c);
        printDiff(a, c);
    }

    public static void printSum(int a, int c) {
        System.out.println("a + c = " + (a+c));
    }

    public static void printDiff(int a, int c){
        System.out.println("a - c = " + (a-c));
    }

    public static void printDiv(int a, int c){
        try {
            System.out.println("a / c = " + (a/c));
            System.out.println("*************** / Operation ****************");
        } catch (ArithmeticException ae) {
            System.out.println("One of the numbers is 0, and / operation can't be executed" + ". Exception Message: " + ae.getMessage());
        } finally {
            System.out.println("Division Method Executed");
        }
    }
}
