import java.util.ArrayList;

public class ShoppingList {

    private static ArrayList <String> shoppingList = new ArrayList<>();

    public static void addItem (String item){
        if (!findItem(item)){
            shoppingList.add(item);
        }
    }

    public static void removeItem (String item){
        if (findItem(item)){
            shoppingList.remove(item);
        }
    }

    private static int itemIndex (String item){
        if(findItem(item)){
            return shoppingList.indexOf(item);
        }
        return -1;
    }



    private static boolean findItem (String item){
         return shoppingList.contains(item);
    }
    public static void clearList (){
        shoppingList.clear();
    }

    public static void printList (){

    }


}

