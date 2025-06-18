package apply;

import java.util.*;

public class RestaurantData {
    public static List<MenuItem> menu = new ArrayList<>();
    public static List<Reservation> reservations = new ArrayList<>();
    public static List<Order> orders = new ArrayList<>();
    public static List<String> feedbacks = new ArrayList<>();

    static {
        menu.add(new MenuItem("Veg Biryani", 180));
        menu.add(new MenuItem("Chicken Burger", 150));
        menu.add(new MenuItem("Cold Coffee", 90));
        menu.add(new MenuItem("Ice Cream", 100));
    }

    public static boolean reserveTable(String name, String phone, int tableNumber) {
        for (Reservation r : reservations) {
            if (r.tableNumber == tableNumber) return false;
        }
        reservations.add(new Reservation(name, phone, tableNumber));
        return true;
    }
}
