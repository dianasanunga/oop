public class Main {
    public static void main(String[] args) {
        //Example for printing method
        printLine(3);
        printLine(15);

        printSquare(5);
        printSquare(10);

        printanguletriangule(6);
        printanguletriangule(9);
    }

    public static void printLine(int num) {
        System.out.println("-----Printing Line " + num + " -----");
        for (int i = 0; i < num; i++) {
            System.out.print("* ");
        }
        ;
        System.out.println();
    }

    public static void printSquare(int num) {
        System.out.println("-----Printing Square " + num + " -----");
        for (int height = 0; height < num; height++) {
            for (int weight = 0; weight < num; weight++) {
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }

    public static void printanguletriangule(int num) {
        System.out.println("-------printng rectangule triangule" + num + "---------");
        for (int height = 0; height < num; height++) {
            for (int weight = 0; weight < num; weight++) {
                if (weight <= height) {
                    System.out.print(" * ");
                }
            }
            System.out.println(" ");
        }
    }
}


