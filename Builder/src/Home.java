public class Home {
    private String basement;
    private String walls;
    private String roof;

    public void setBasement(String basement) { this.basement = basement; }
    public void setWalls(String walls) { this.walls = walls; }
    public void setRoof(String roof) { this.roof = roof; }

    @Override
    public String toString() {
        return "Home [Basement=" + basement + ", Walls=" + walls + ", Roof=" + roof + "]";
    }
}
