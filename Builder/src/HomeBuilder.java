public interface HomeBuilder {
    HomeBuilder buildBasement(String basement);
    HomeBuilder buildWalls(String walls);
    HomeBuilder buildRoof(String roof);
    Home build();
}
