import java.io.Serializable;
import java.util.*;

public class MultiMap<K, V> extends HashMap<K, V> implements Cloneable, Serializable {
    static final long serialVersionUID = 123456789L;
    private HashMap<K, List<V>> map;
    private int repeatCount;

    public MultiMap(int repeatCount) {
        this.repeatCount = repeatCount;
        map = new HashMap<>();
    }

    @Override
    public int size() {
    }

    @Override
    public V put(K key, V value) {
    }

    @Override
    public V remove(Object key) {
    }

    @Override
    public Set<K> keySet() {
    }

    @Override
    public Collection<V> values() {
    }

    @Override
    public boolean containsKey(Object key) {
    }

    @Override
    public boolean containsValue(Object value) {
    }

    @Override
    public String toString() {
    }
}