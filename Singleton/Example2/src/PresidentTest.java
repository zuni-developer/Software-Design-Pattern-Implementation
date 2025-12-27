public class PresidentTest {
    public static void main(String[] args) {
        President p1 = President.getInstance("John Doe");
        p1.addressNation();
        // Attempting to create another President
        President p2 = President.getInstance("Jane Smith");
        p2.addressNation();
        System.out.println("Same instance? " + (p1 == p2));
    }
}
