import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DataGenerator.createCustomer();
        DataGenerator.createCategory();

        int selectedId = selectCustomer();
        int menuId = menuSelection();

        System.out.println(selectedId + " " + menuId);
    }

    private static int selectCustomer() {
        int selectedId;
        while (true) {
            System.out.println("Select customer:");
            for (int i = 0; i < StaticConstants.CUSTOMER_LIST.size(); i++) {
                System.out.println("Type " + i + " for customer: " + StaticConstants.CUSTOMER_LIST.get(i).getEmail());
            }
            selectedId = new Scanner(System.in).nextInt();
            if (StaticConstants.CUSTOMER_LIST.size() > selectedId && selectedId >= 0) break;
            System.err.println("There is no such a customer. Please re-try");
        }
        return selectedId;
    }

    private static int menuSelection() {
        int selectedId;
        while (true) {
            System.out.println("What would you like to do? Just type id for selection");

            String[] options = new String[]{"List Categories", "List Products", "List Discount", "See Balance", "Add Balance",
                    "Place an order", "See Cart", "See order details", "See your address", "Close App"};
            for (int i = 0; i < options.length; i++) {
                System.out.println(i + " - " + options[i]);
            }
            selectedId = new Scanner(System.in).nextInt();
            if (options.length > selectedId && selectedId >= 0) break;
            System.err.println("There is no such an option. Please re-try");

        }
        return selectedId;
    }

}
