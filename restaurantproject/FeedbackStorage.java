package apply;

import java.util.ArrayList;

public class FeedbackStorage {
    private static final ArrayList<String> feedbackList = new ArrayList<>();

    public static void addFeedback(String name, String feedback) {
        feedbackList.add("Name: " + name + "\nFeedback: " + feedback);
    }

    public static String getAllFeedback() {
        if (feedbackList.isEmpty()) return "No feedback submitted.";
        return String.join("\n\n", feedbackList);
    }
}

