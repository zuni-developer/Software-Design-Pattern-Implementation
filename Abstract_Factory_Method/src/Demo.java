public class Demo {
    public static void main(String[] args) {
        GUIFactory factory;
        String osName = "Windows"; // you can change to "MacOS"

        if (osName.equalsIgnoreCase("Windows")) {
            factory = new WindowsFactory();
        }
        else {
            factory = new MacOSFactory();
        }

        Application app = new Application(factory);
        app.paint();
    }
}