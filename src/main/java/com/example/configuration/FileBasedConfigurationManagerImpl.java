package com.example.configuration;

import java.util.Properties;

public class FileBasedConfigurationManagerImpl extends FileBasedConfigurationManager{
    private static FileBasedConfigurationManagerImpl instance;
    private FileBasedConfigurationManagerImpl(){
    }

    @Override
    public String getConfiguration(String key) {
        return properties.getProperty(key);
    }

    @Override
    public <T> T getConfiguration(String key, Class<T> type) {
        String val=properties.getProperty(key);
        return convert(val,type);
    }


    @Override
    public void setConfiguration(String key, String value) {
        properties.setProperty(key,value);
    }
    @Override
    public <T> void setConfiguration(String key, T value) {
        properties.setProperty(key, String.valueOf(value));
    }

    @Override
    public void removeConfiguration(String key) {
        properties.remove(key);
    }

    @Override
    public void clear() {
        properties.clear();
    }
    public static FileBasedConfigurationManager getInstance() {
        if(instance==null){
            synchronized (FileBasedConfigurationManagerImpl.class){
                instance=new FileBasedConfigurationManagerImpl();
            }
        }
        return instance;
    }

    public static void resetInstance() {
        instance=null;
    }
}
