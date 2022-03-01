import java.util.HashMap;
import java.util.Set;

import java.util.*;
public class Counter<E> {
    private HashMap<E, Integer> counts;

    public Counter(E[] things) {
        this.counts = new HashMap<>();

        for (int i = 0; i < things.length; i++) {
            int count = this.counts.getOrDefault(things[i], 0);
            this.counts.put(things[i], count + 1);
        }
    }
    public Integer getCount(E element) {
        return this.counts.getOrDefault(element, 0);
    }
    public int getSize() {
        return this.counts.size();
    }
    public E mostFrequent() {
        E frequentItem = null;
        Integer frequency = 0;
        for (Map.Entry<E, Integer> entry : this.counts.entrySet()) {
            E key = entry.getKey();
            Integer value = entry.getValue();
            if (value > frequency) {
                frequency = value;
                frequentItem = key;
            }
        }
        return frequentItem;
    }
}