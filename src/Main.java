
import java.util.Scanner;


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
                    addItem();
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
                    clearList();
                    break;
                case 7:
                    quit = true;
                    break;
            }
        }
    }
    public static void printInstructions (){
        System.out.println(" Press: ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list. ");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item on the list.");
        System.out.println("\t 4 - To remove an item to the list.");
        System.out.println("\t 5 - To search for an item on the list.");
        System.out.println("\t 6 - Clear the current list.  ");
        System.out.println("\t 7 - To quit the program. ");
    }

    public static void addItem (){
        System.out.print("Enter the item to be added to the list ");
        mallList.addItem(input.nextLine());
    }

    public static void modifyItem(){
        System.out.println("Enter the item to will be modified ");
        String currentItem = input.nextLine();
        System.out.println("Enter the item that will replace the current item in the list");
        String futureItem = input.nextLine();
        mallList.modifyItem(currentItem,futureItem);
    }

    public static void removeItem(){
        System.out.println("Enter the item that will be removed form the list ");
        mallList.removeItem(input.nextLine());
    }
    public static void searchItem(){
        System.out.print("Search in the list for: ");
        String itemSearched = input.nextLine();

           if (mallList.findItem(itemSearched)) {
               System.out.println(itemSearched + " is present on the list.");
           }
           else {
               System.out.println(itemSearched + " is  not present on the list.");
           }
    }
    public static void clearList(){
        System.out.println("The current list has been cleared");
        mallList.clearList();
    }

}
