import java.util.ArrayList;
import java.util.List;

public class Chatroom implements Subject {
    private List<Observer> users = new ArrayList<>();
    @Override
    public void addObserver(Observer observer) {
        users.add(observer);
    }
    @Override
    public void removeObserver(Observer observer) {
        users.remove(observer);
    }
    @Override
    public void notifyObservers(String message) {
        for (Observer user : users) {
            user.update(message);
        }
    }

    public void sendMessage(String message) {
        System.out.println("Chatroom: " + message);
        notifyObservers(message);
    }
}
