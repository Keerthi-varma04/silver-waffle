package apply;

import java.util.ArrayList;

public class OrderHistory {
    private static final ArrayList<String> orders = new ArrayList<>();

    public static void addOrder(String name, int amount) {
        orders.add("Name: " + name + ", Total: ₹" + amount);
    }

    public static String getAllOrders() {
        if (orders.isEmpty()) return "No orders found.";
        return String.join("\n", orders);
    }
}
