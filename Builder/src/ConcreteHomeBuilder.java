public class ConcreteHomeBuilder implements HomeBuilder {
    private Home home;

    public ConcreteHomeBuilder() {
        this.home = new Home();
    }
    @Override
    public HomeBuilder buildBasement(String basement) {
        home.setBasement(basement);
        return this;
    }
    @Override
    public HomeBuilder buildWalls(String walls) {
        home.setWalls(walls);
        return this;
    }
    @Override
    public HomeBuilder buildRoof(String roof) {
        home.setRoof(roof);
        return this;
    }
    @Override
    public Home build() {
        return home;
    }
}
