import java.util.LinkedList;
import java.util.Scanner;

public class ProductManagerLinkedList {
    static LinkedList<Product> list = new LinkedList<>();
    public static Scanner input = new Scanner(System.in);
    private static final int ID = 1;
    private static final int Name = 2;
    private static final int Price = 3;

    public static void addProduct(String name, String id, double price) {
        list.add(new Product(id, name, price));
    }

    public static void editProduct(String id) {
        for (Product p : list) {
            if (p.getId().equals(id)) {
                editChoices(p);
                return;
            }
        }
    }

    private static void editChoices(Product p) {
        System.out.println("What to change");
        System.out.println("1. ID");
        System.out.println("2. Name");
        System.out.println("3. Price");
        int choice = Integer.parseInt(input.nextLine());
        switch (choice) {
            case ID -> {
                System.out.println("Input new ID");
                String newID = input.nextLine();
                p.setId(newID);
            }
            case Name -> {
                System.out.println("Input new Name");
                String name = input.nextLine();
                p.setName(name);
            }
            case Price -> {
                System.out.println("Input new price");
                double price = Double.parseDouble(input.nextLine());
                p.setPrice(price);
            }
        }
    }

    public static void delete(String id) {
        for (Product p : list) {
            if (p.getId().equals(id)) {
                list.remove(p);
                return;
            }
        }
    }

    public static void show() {
        for (Product p : list) {
            System.out.println(p);
        }
    }

    public static void search(String name) {
        for (Product p : list) {
            if (p.getName().equals(name)) {
                System.out.println(p);
                break;
            }
        }
    }

    public static void sort() {
        list.sort(Product.comparator);
    }
}
