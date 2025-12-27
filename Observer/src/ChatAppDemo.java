public class ChatAppDemo {
    public static void main(String[] args) {

        Chatroom chatroom = new Chatroom();

        User user1 = new User("Ali");
        User user2 = new User("Sara");
        User user3 = new User("Ahmed");

        chatroom.addObserver(user1);
        chatroom.addObserver(user2);
        chatroom.addObserver(user3);

        chatroom.sendMessage("Hello everyone! Welcome to the chatroom!");
    }
}
