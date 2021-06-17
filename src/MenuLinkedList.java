import java.util.Scanner;

public class MenuLinkedList {
    public static Scanner input = new Scanner(System.in);

    public static void menu() {
        while (true) {
            welcome();
            int choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 1 -> add();
                case 2 -> edit();
                case 3 -> delete();
                case 4 -> show();
                case 5 -> search();
                case 6 -> sort();
                default -> {
                    System.out.println("Exiting.....");
                    System.exit(0);
                }
            }
        }
    }

    private static void welcome() {
        System.out.println("Welcome to Linkedlist");
        System.out.println("1.Add Product");
        System.out.println("2.Edit product");
        System.out.println("3.Delete");
        System.out.println("4.Show");
        System.out.println("5.Search");
        System.out.println("6.Sort product");
        System.out.println("Press other buttons to exit");
    }

    public static void add() {
        System.out.println("Adding product");
        Scanner input = new Scanner(System.in);
        System.out.println("Input name");
        String name = input.nextLine();
        System.out.println("Input ID");
        String id = input.nextLine();
        System.out.println("Input price");
        double price = input.nextDouble();
        ProductManagerLinkedList.addProduct(name, id, price);
    }

    public static void edit() {
        System.out.println("Input Product ID");
        String id = input.nextLine();
        ProductManagerLinkedList.editProduct(id);
    }

    public static void delete() {
        System.out.println("Input Product ID");
        String id = input.nextLine();
        ProductManagerLinkedList.delete(id);
    }

    public static void show() {
        ProductManagerLinkedList.show();
    }

    public static void search() {
        System.out.println("Input Product Name");
        String name = input.nextLine();
        ProductManagerLinkedList.search(name);
    }

    public static void sort() {
        ProductManagerLinkedList.sort();
    }
}
