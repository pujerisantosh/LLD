package prototypeDesignPattern;

public class PrototypePatternDemo {
    public static void main(String[] args) {
// Create Configuration Registry
        // Create Configuration Registry
        ConfigurationRegistry registry = new ConfigurationRegistry();

        // Add Prototypes
        registry.addPrototype(new Configuration("Blue", true, "English", false, 12, "Arial", ConfigurationType.BASIC));
        registry.addPrototype(new Configuration("Dark", false, "Spanish", true, 14, "Courier", ConfigurationType.ADVANCED));

        // Clone Configurations
        Configuration clonedBasic = registry.clone(ConfigurationType.BASIC);
        Configuration clonedAdvanced = registry.clone(ConfigurationType.ADVANCED);

        // Null check before accessing the method
        if (clonedBasic != null) {
            clonedBasic.displayConfig();
        } else {
            System.out.println("Cloned Basic Configuration is null");
        }

        if (clonedAdvanced != null) {
            clonedAdvanced.displayConfig();
        } else {
            System.out.println("Cloned Advanced Configuration is null");
        }
    }
    }

