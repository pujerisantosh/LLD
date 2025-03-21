package adpaterStatergyPattern;

import lombok.Getter;

@Getter
public class Configuration implements Cloneable {
    private final String configType;

    public Configuration(String configType) {
        this.configType = configType;
    }

    @Override
    public Configuration clone() {
        try {
            return (Configuration) super.clone(); // Ensures object is correctly cloned
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Cloning failed", e);
        }
    }
}
