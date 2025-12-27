public class President {
    // 1️⃣ Private static instance variable
    private static President instance;
    private String name;
    // 2️⃣ Private constructor
    private President(String name) {
        this.name = name;
        System.out.println("President " + name + " has taken office!");
    }
    // 3️⃣ Public static accessor with lazy initialization
    public static President getInstance(String name) {
        if (instance == null) {
            instance = new President(name);
        }
        else {
            System.out.println("A President already exists: " + instance.name);
        }
        return instance;
    }
    // 4️⃣ President behavior
    public void addressNation() {
        System.out.println("My fellow citizens, I am " + name + ", your President.");
    }
}
