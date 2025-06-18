package apply;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class OrderStore {
    private static final ObservableList<String> orders = FXCollections.observableArrayList();

    public static void addOrder(String order) {
        orders.add(order);
    }

    public static ObservableList<String> getOrders() {
        return orders;
    }
}
