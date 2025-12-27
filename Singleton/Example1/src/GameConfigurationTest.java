public class GameConfigurationTest {
    public static void main(String[] args) {
        GameConfiguration config1 = GameConfiguration.getInstance();
        config1.setConfig("maxPlayers", "8");
        config1.setConfig("difficulty", "Hard");
        config1.setConfig("map", "Desert");
        // Access same instance elsewhere
        GameConfiguration config2 = GameConfiguration.getInstance();
        System.out.println("Max Players: " + config2.getConfig("maxPlayers"));
        System.out.println("Difficulty: " + config2.getConfig("difficulty"));
        System.out.println("Map: " + config2.getConfig("map"));
        // Verify both are same instance
        System.out.println("Same instance? " + (config1 == config2));
    }
}
