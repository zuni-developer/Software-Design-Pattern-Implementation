import java.util.HashMap;
import java.util.Map;

public class GameConfiguration {
    // 1️⃣ Private static variable holding the single instance
    private static volatile GameConfiguration instance = null;
    // 2️⃣ Map to store game configuration settings
    private Map<String, String> settings;
    // 3️⃣ Private constructor prevents external instantiation
    private GameConfiguration() {
        settings = new HashMap<>();
        System.out.println("Game Configuration Initialized!");
    }
    // 4️⃣ Public static accessor (lazy initialization + thread-safe)
    public static GameConfiguration getInstance() {
        if (instance == null) {
            synchronized (GameConfiguration.class) { // Ensures thread-safety
                if (instance == null) {
                    instance = new GameConfiguration();
                }
            }
        }
        return instance;
    }
    // 5️⃣ Set configuration key-value pair
    public void setConfig(String key, String value) {
        settings.put(key, value);
    }
    // 6️⃣ Get configuration value
    public String getConfig(String key) {
        return settings.get(key);
    }
    // 7️⃣ Prevent reinitialization via serialization/deserialization
    protected Object readResolve() {
        return getInstance();
    }
}
