import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        //Задача 4:
        //Да се прочете масив и да се отпечата дали е огледален.
        int[] array = new int[]{4, 2, 2, 4};
        if (array[0] == array[3] && array[1] == array[2]) {
            System.out.println("Масивът е огледален");
        } else {
            System.out.println("Масивът не е огледален");
        }
    }
}




