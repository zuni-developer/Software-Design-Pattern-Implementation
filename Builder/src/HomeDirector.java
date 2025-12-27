public class HomeDirector {
    private HomeBuilder builder;

    public HomeDirector(HomeBuilder builder) {
        this.builder = builder;
    }

    public Home constructSimpleHome() {
        return builder
                .buildBasement("Concrete Basement")
                .buildWalls("Brick Walls")
                .buildRoof("Tiled Roof")
                .build();
    }
}
