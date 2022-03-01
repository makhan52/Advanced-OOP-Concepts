import java.util.*;

public class Bag<T> {
    public ArrayList<T> objects;
    public Bag() {
        this.objects = new ArrayList<>();
    }
    public void add(T obj) throws BagException {
        if (obj == null)    throw new BagException("Cannot add null to Bag");
        objects.add(obj);
    }

    public void add(T element, double prob) throws BagException {
        if (element == null)    throw new BagException("Cannot add null to Bag");
        if (prob < 0 || prob > 1)   throw new BagException("Probability should be between 0 and 1");
        int t = (int)Math.round(objects.size()*prob);
        for(int i=0; i < t; i++){
            objects.add(element);
        }
    }
    public T drawOne() {
        int index = new Random().nextInt(this.objects.size());
        return this.objects.get(index);
    }
    public ArrayList<T> drawMany(int howMany) {
        ArrayList<T> items = new ArrayList<>();
        for (int i = 0; i < howMany; i++) items.add(drawOne());
        return items;
    }
}
