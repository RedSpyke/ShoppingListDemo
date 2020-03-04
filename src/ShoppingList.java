import java.util.ArrayList;

public class ShoppingList {

    private ArrayList <String> shoppingList = new ArrayList<>();

    public void addItem (String item){
        if (!findItem(item)){
            shoppingList.add(item);
        }
        else{
            System.out.println("Item already on the list");
        }
    }

    public void removeItem (String item){
        if (findItem(item)){
            shoppingList.remove(item);
        }
        else{
            System.out.println("Item is not on the list");
        }
    }

    private  int itemIndex (String item){
        if(findItem(item)){
            return shoppingList.indexOf(item);
        }
        return -1;
    }

    public void modifyItem (String currentItem, String newItem){
        if (findItem(currentItem)){
            int localIndex = itemIndex(currentItem);
            shoppingList.set(localIndex,newItem);
        }
        else{
            System.out.println("Item is not on the list");
        }
    }

    public boolean findItem (String item){
         return shoppingList.contains(item);
    }
    public  void clearList (){
        if(!shoppingList.isEmpty()){
            shoppingList.clear();
        }
    }

    public void printList (){
        System.out.println("You have " + shoppingList.size() + " item(s) in your list.");
        for (String s : shoppingList) {
            System.out.println(s);
        }
    }
}

