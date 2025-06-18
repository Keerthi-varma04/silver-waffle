package apply;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class CustomerStore {
    private static final ObservableList<String> customers = FXCollections.observableArrayList();

    public static void addCustomer(String customer) {
        customers.add(customer);
    }

    public static ObservableList<String> getCustomers() {
        return customers;
    }
}
