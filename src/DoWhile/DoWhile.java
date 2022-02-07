package DoWhile;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        //DoWhile loop = always executes a block of codes first and then check the condition
        Scanner scanner = new Scanner(System.in);
        String name = "";

        do{
            System.out.print("Enter your Name : ");
            name = scanner.nextLine();
        }while (name.isBlank());
        System.out.println("Hello " + name);
    }
}
