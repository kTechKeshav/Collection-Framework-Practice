package collection_framework.List.CopyOnWriteArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Cowal {
    public static void main(String[] args) {
        /*
        *
        * --------------------CopyOnWriteArrayList-----------------
        * 0. It is Thread safe.
        *
        * 1. "Copy On Write" means:
        *
        * That whenever a write operation (Like adding or removing an element)
        * instead of directly modifying the existing list a new copy of the list
        * is created and the modification is applied to the copy.
        *
        * 2. This ensures that other threads reading the list while it's
        * being modified or unaffected.
        *
        * 3. Read operation: Fast and Direct,
        * Since they happen on a stable list without interference from
        * modifications.
        *
        * 4. Write operation:
        * A new copy of the list is created for every modification
        * The reference to the list is then updated so that subsequent reads use this new list.
        *
        * 5. It is used when reading is more frequent than Writing.
        *
        * */


        /*

        * The below code will raise an error because ArrayList is not thread safe.

        List<String> shoppingList = new ArrayList<>();
        shoppingList.add("Butter");
        shoppingList.add("Ghee");
        shoppingList.add("Pencil");
        shoppingList.add("Remote");
        shoppingList.add("Eraser");

        for(String item : shoppingList){
            System.out.println(item);
            if(item.equals("Remote"))
                shoppingList.add("TV");
        }

        System.out.println(shoppingList);
        */

        List<String> shoppingList = new CopyOnWriteArrayList<>();
        shoppingList.add("Butter");
        shoppingList.add("Ghee");
        shoppingList.add("Pencil");
        shoppingList.add("Remote");
        shoppingList.add("Eraser");

        for(String item : shoppingList){
            System.out.println(item);
            if(item.equals("Remote"))
                shoppingList.add("TV");
        }

        System.out.println(shoppingList);
    }
}
