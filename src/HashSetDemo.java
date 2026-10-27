
import java.util.HashSet;

public class HashSetDemo {

    private HashSet<String> items = new HashSet<>();

    // Add an element
    public void addItem(String item) {
        if (items.add(item)) {
            System.out.println(item + " added successfully.");
        } else {
            System.out.println(item + " already exists. Duplicate ignored.");
        }
    }

    // Check whether an element exists
    public void searchItem(String item) {
        if (items.contains(item)) {
            System.out.println(item + " exists in the HashSet.");
        } else {
            System.out.println(item + " does not exist in the HashSet.");
        }
    }

    // Remove an element
    public void removeItem(String item) {
        if (items.remove(item)) {
            System.out.println(item + " removed successfully.");
        } else {
            System.out.println(item + " not found. Nothing removed.");
        }
    }

    // Display all unique elements
    public void displayItems() {
        System.out.println("\nCurrent HashSet: " + items);
        System.out.println("Total unique elements: " + items.size());
    }

    public static void main(String[] args) {
        HashSetDemo demo = new HashSetDemo();

        demo.addItem("Java");
        demo.addItem("Python");
        demo.addItem("SQL");
        demo.addItem("Java"); // Duplicate
        demo.addItem("Python"); // Duplicate

        demo.displayItems();

        demo.searchItem("Java");
        demo.searchItem("C++");

        demo.removeItem("SQL");

        demo.displayItems();
    }
}
