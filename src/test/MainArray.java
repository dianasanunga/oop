package test;

import java.util.ArrayList;
import java.util.List;

public class MainArray {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");
        stringList.add("!");

        printElement(stringList, 0);
        printElement(stringList, 4);
        printElement(stringList, 2);
    }

    public static void printElement(List<String> stringList, int i) {
        try {
            System.out.println(stringList.get(i));
        } catch (IndexOutOfBoundsException ie) {
            System.out.println("Index is out of bounds, List size: " +  stringList.size() + ". Exception Message: " + ie.getMessage());
        } catch (Exception ex) {
            System.out.println("Unknown Error: " + ex.getMessage());
        }
    }
}