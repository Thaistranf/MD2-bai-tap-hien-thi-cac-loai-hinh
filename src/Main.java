import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice = -1;
        Scanner sc = new Scanner(System.in);
        while (choice != 0){
            System.out.println("\nMenu:");
            System.out.println("1.Print the rectangle");
            System.out.println("2.Print the square triangle");
            System.out.println("3.Print isosceles triangle");
            System.out.println("4.Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            
            switch (choice){
                case 1:
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 7; j++) {
                            System.out.print(" * ");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 2:
                    System.out.println("botton-left");
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print(" * ");
                        }
                        System.out.print("\n");
                    }
                    System.out.print("\n");
                    System.out.println("top-left");
                    for (int i = 5; i >= 1; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print(" * ");
                        }
                        System.out.print("\n");
                    }
                    System.out.print("\n");
                    System.out.println("top-right");
                    for (int i = 5; i >= 1; i--) {
                        for (int j = i; j >= 1; j--) {
                            System.out.print(" * ");
                        }
                        System.out.print("\n");
                    }
//                    System.out.print("\n");
//                    System.out.println("botton-right");
//                    for (int i = 1; i <= 5; i++) {
//                        for (int j = 5; j >= i; j--) {
//                            System.out.print(" * ");
//                        }
//                        System.out.print("\n");
//                    }
                    break;
                case 3:
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 5 - i; j++) {
                            System.out.print("  ");
                        }
                        for (int j = 0; j < 2 * i - 1; j++) {
                            System.out.print(" * ");
                        }
                        System.out.print("\n");
                    }
                    break;
            }
        }

    }
}