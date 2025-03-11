package singleToneDesignpattern;

import java.util.Properties;

public  abstract  class FileBasedConfigurationManagerImpl {

    protected final Properties properties;

    protected FileBasedConfigurationManagerImpl(Properties properties) {
        this.properties = properties;
    }


}
