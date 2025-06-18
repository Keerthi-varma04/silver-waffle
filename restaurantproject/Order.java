package apply;

import java.util.ArrayList;
import java.util.List;

public class Order {
    String customerName;
    List<MenuItem> items = new ArrayList<>();
    boolean paymentDone = false;

    public double getTotalAmount() {
        return items.stream().mapToDouble(i -> i.price).sum();
    }
}
