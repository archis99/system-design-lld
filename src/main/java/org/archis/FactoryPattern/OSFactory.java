package org.archis.FactoryPattern;

public class OSFactory {
    public OS getInstance(String type) {
        if (type.equals("Android"))
            return new AndroidClass();
        else if (type.equals("IOS"))
            return new IOS();
        else
            return new AndroidClass();
    }
}
