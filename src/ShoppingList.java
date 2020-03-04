import java.util.ArrayList;

public class ShoppingList {

    private static ArrayList <String> shoppingList = new ArrayList<>();

    public static void addItem (String item){
        if (!findItem(item)){
            shoppingList.add(item);
        }
        else{
            System.out.println("Item already on the list");
        }
    }

    public static void removeItem (String item){
        if (findItem(item)){
            shoppingList.remove(item);
        }
        else{
            System.out.println("Item is not on the list");
        }
    }

    private static int itemIndex (String item){
        if(findItem(item)){
            return shoppingList.indexOf(item);
        }
        return -1;
    }

    public static void modifyItem (String currentItem, String newItem){
        if (findItem(currentItem)){
            int localIndex = itemIndex(currentItem);
            shoppingList.set(localIndex,newItem);
        }
        else{
            System.out.println("Item is not on the list");
        }
    }

    private static boolean findItem (String item){
         return shoppingList.contains(item);
    }
    public static void clearList (){
        shoppingList.clear();
    }

    public static void printList (){
        System.out.println("You have " + shoppingList.size() + " items in your list.");
        for (String s : shoppingList) {
            System.out.println(s);
        }
    }


}

