import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.logging.SocketHandler;

public class Main {
    private static Scanner input = new Scanner(System.in);
    private static ShoppingList  mallList = new ShoppingList();

    public static void main(String[] args) {

        boolean quit = false;
        int choice = 0;
        printInstructions ();

        while (!quit){
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            input.nextLine();
            switch (choice){
                case 0:
                    printInstructions ();
                    break;
                case 1:
                    mallList.printList();
                    break;
                case 2:
                    addItems();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchItem();
                    break;
                case 6:
                    quit = true;
                    break;




            }
        }







    }
}
