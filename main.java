package GroceryList;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class main
{
    static Scanner scanner;

    public static void main(String[] args)
    {
        GroceryList groceryList = new GroceryList();

        groceryList.add(new GroceryItemOrder("Milk", 4, 10));
        groceryList.add(new GroceryItemOrder("Cookies", 2, 25));
        groceryList.add(new GroceryItemOrder("Apple", 8, 2));
        groceryList.add(new GroceryItemOrder("Tuna", 2, 10));
        groceryList.add(new GroceryItemOrder("Chocolate", 1, 20));
        groceryList.add(new GroceryItemOrder("Bread", 1, 8));
        groceryList.add(new GroceryItemOrder("Juice", 1, 12));
        groceryList.add(new GroceryItemOrder("Butter", 1, 14));
        groceryList.add(new GroceryItemOrder("Beef", 1, 25));
        groceryList.add(new GroceryItemOrder("Egg", 12, 2));
        groceryList.add(new GroceryItemOrder("Cheese", 1, 45));

        System.out.println(groceryList);
    }
}
