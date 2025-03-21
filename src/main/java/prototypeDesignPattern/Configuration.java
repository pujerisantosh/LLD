package prototypeDesignPattern;

public class Configuration  implements ClonableObject<Configuration>{

    private String themeColor;
    private Boolean autoSave;
    private String language;
    private Boolean darkMode;
    private Integer fontSize;
    private String fontFamily;
    private ConfigurationType type;

    public Configuration(String themeColor, Boolean autoSave, String language, Boolean darkMode, Integer fontSize, String fontFamily, ConfigurationType type) {
        this.themeColor = themeColor;
        this.autoSave = autoSave;
        this.language = language;
        this.darkMode = darkMode;
        this.fontSize = fontSize;
        this.fontFamily = fontFamily;
        this.type = type;
    }


    public String getThemeColor() {
        return themeColor;
    }

    public Boolean getAutoSave() {
        return autoSave;
    }

    public String getLanguage() {
        return language;
    }

    public Boolean getDarkMode() {
        return darkMode;
    }

    public Integer getFontSize() {
        return fontSize;
    }

    public String getFontFamily() {
        return fontFamily;
    }

    public ConfigurationType getType() {
        return type;
    }

    public void addPrototype(String string, Configuration configuration) {
    }

    @Override
    public Configuration cloneObject() {
        return null;
    }

    public void displayConfig() {
        System.out.println("Configuration [" + "Type: " + type + ", Theme: " + themeColor +
                ", AutoSave: " + autoSave + ", Language: " + language +
                ", Dark Mode: " + darkMode + ", FontSize: " + fontSize +
                ", FontFamily: " + fontFamily + "]");
    }
}
