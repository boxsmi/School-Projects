/*
Created by Aleksandr
                    Smirnov*/
package lesson17;

import Interfaces.MapKey;

import java.util.HashMap;
import java.util.Map;

public class MapKeyImpl implements MapKey {
    private String value;
    private HashMap<String, String> testValues = new HashMap<>();

    MapKeyImpl() {
    }

    MapKeyImpl(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return testValues.get(value);
    }
}
