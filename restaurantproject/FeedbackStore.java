package apply;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class FeedbackStore {
    private static final ObservableList<String> feedbacks = FXCollections.observableArrayList();

    public static void addFeedback(String feedback) {
        feedbacks.add(feedback);
    }

    public static ObservableList<String> getFeedbacks() {
        return feedbacks;
    }
}
