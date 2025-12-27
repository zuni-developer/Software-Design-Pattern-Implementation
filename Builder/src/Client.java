public class Client {
    public static void main(String[] args) {
        HomeBuilder builder = new ConcreteHomeBuilder();
        HomeDirector director = new HomeDirector(builder);

        Home home = director.constructSimpleHome();
        System.out.println(home);
    }
}
