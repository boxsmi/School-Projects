/* Created by Aleksandr 
                       Smirnov
                                */
package lesson19;

import Interfaces.MultiMap;

import java.util.*;

public class MiltiMapImpl<K, V> implements MultiMap<K, V> {
    private HashMap<K, List<V>> multiMap = new HashMap<>();


    @Override
    public int countValues(K key) {
        if (multiMap.containsKey(key)) {
            List<V> values = multiMap.get(key);
            return values.size();
        } else {
            return 0;
        }
    }

    @Override
    public int size() {
        return multiMap.size();
    }

    @Override
    public boolean isEmpty() {
        return multiMap.isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        Set<K> keys = multiMap.keySet();
        for (K temp : keys) {
            if (keys.contains(key))
                return true;
        }
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        ArrayList<V> allValues = new ArrayList<>();
        Set<K> keys = multiMap.keySet();
        for (K key : keys) {
            List<V> values = multiMap.get(key);
            allValues.addAll(values);
            if (allValues.contains(value))
                return true;
        }
        return false;
    }

    @Override
    public V get(Object key) {
        return null;
    }

    @Override
    public V put(K key, V value) {
        if (multiMap.containsKey(key)) {
            List<V> values = multiMap.get(key);
            values.add(value);
            multiMap.put(key, values);
        } else {
            ArrayList<V> values = new ArrayList<>();
            values.add(value);
            multiMap.put(key, values);
        }
        return value;
    }

    @Override
    public Iterator<V> valuesIterator(K key) {
        if (multiMap.containsKey(key)) {
            List<V> values = multiMap.get(key);
            return values.iterator();
        } else {
            ArrayList<V> values = new ArrayList<>();
            return values.iterator();
        }

    }

    @Override
    public V remove(Object key) {
        return null;
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> m) {
        for (K key : m.keySet()) {
            if (multiMap.containsKey(key)) {
                List<V> values = multiMap.get(key);
                values.add(m.get(key));
                multiMap.put(key, values);
            } else {
                ArrayList<V> values = new ArrayList<>();
                values.add(m.get(key));
                multiMap.put(key, values);
            }
        }
    }

    @Override
    public void clear() {

    }

    @Override
    public Set<K> keySet() {
        return multiMap.keySet();
    }

    @Override
    public Collection<V> values() {
        ArrayList<V> allValues = new ArrayList<>();
        Set<K> keys = multiMap.keySet();
        for (K key : keys) {
            List<V> values = multiMap.get(key);
            allValues.addAll(values);
        }
        return allValues;
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        return null;
    }
}
