package prototypeDesignPattern;

import java.util.HashMap;
import java.util.Map;

public class ConfigurationRegistry  implements ConfigurationPrototypeRegistry{

    private Map<ConfigurationType, Configuration> registry = new HashMap<>();

    @Override
    public void addPrototype(Configuration configuration) {
        registry.put(configuration.getType(), configuration);
    }

    @Override
    public Configuration getPrototype(ConfigurationType type) {
        Configuration prototype = registry.get(type);
        return (prototype != null) ? prototype.cloneObject() : null;
    }

    @Override
    public Configuration clone(ConfigurationType type) {
        return getPrototype(type);
    }
}
