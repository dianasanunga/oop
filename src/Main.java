import figures.Line;
import figures.Rectangule;
import figures.Square;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

     Scanner scanner = new Scanner(System.in);
     int option = 0;
     do {
      System.out.println("1. Enter a Line");
      System.out.println("2. Enter a Square");
      System.out.println("3. Enter a Rectangle");
      System.out.println("4. Exit");
      System.out.println("Select a option: ");
      option = scanner.nextInt();

      switch(option){
       case 1:
        System.out.println("Please enter a lenght for Line");
        int num = scanner.nextInt();
        Line l1 = new Line(num);
        l1.printLine();
        break;
       case 2:
        System.out.println("Please enter a lenght for Square");
        int lenght = scanner.nextInt();
        Square sq1 = new Square(lenght);
        sq1.printSquare();
        break;
       case 3:
        System.out.println("Please enter a width for Rectangule");
        int width = scanner.nextInt();
        System.out.println("Please enter a height for Rectangule");
        int height = scanner.nextInt();
        Rectangule rc1 = new Rectangule(width,height);
        rc1.printRectangule();
      }
     } while (option != 4);
    }
    }



