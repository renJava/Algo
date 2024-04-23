package fundamental.properties_container;

import java.util.HashMap;
import java.util.Map;

public class PropertiesContainer {
    private Map<String, String> properties;

    public PropertiesContainer() {
        properties = new HashMap<>();
    }

    public void setProperty(String key, String value) {
        properties.put(key, value);
    }

    public String getProperty(String key) {
        return properties.get(key);
    }

    public void removeProperty(String key) {
        properties.remove(key);
    }

    public boolean containsProperty(String key) {
        return properties.containsKey(key);
    }
}