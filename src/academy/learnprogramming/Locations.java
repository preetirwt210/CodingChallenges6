package academy.learnprogramming;

import javax.print.DocFlavor;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Locations implements Map<Integer, Location> {

    private static Map<Integer,Location> locations= new HashMap<Integer, Location>();

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

   byte b= Byte.MAX_VALUE;
   int i= Integer.MAX_VALUE;
   short s=Short.MAX_VALUE;
    @Override
    public boolean containsKey(Object key) {
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        return false;
    }

    @Override
    public Location get(Object key) {
        return null;
    }

    @Override
    public Location put(Integer key, Location value) {
        return null;
    }

    @Override
    public Location remove(Object key) {
        return null;
    }

    @Override
    public void putAll(Map<? extends Integer, ? extends Location> m) {

    }

    @Override
    public void clear() {

    }

    @Override
    public Set<Integer> keySet() {
        return null;
    }

    @Override
    public Collection<Location> values() {
        return null;
    }

    @Override
    public Set<Entry<Integer, Location>> entrySet() {
        return null;
    }
}
