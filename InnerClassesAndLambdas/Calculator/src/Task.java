import java.util.ArrayList;
import java.util.List;

public class Task {
    public static class Triplet<X,Y,Z> {
        public X x;
        public Y y;
        public Z z;
        public Triplet(X x, Y y, Z z) {
            this.x = x;
            this.y = y;
            this.z =z;
        }
    }

    public static String result="";
    public static void main(String[] args){
        Calculator c = new Calculator();
        List<Triplet<Double,Double,String>> t = new ArrayList<>();
        t.add(new Triplet<>(3.4,5.2,"+"));
        t.add(new Triplet<>(2.3,1.23,"-"));
        t.add(new Triplet<>(4.5,5.4,"*"));
        t.add(new Triplet<>(10.0,0.0,"/"));
        t.add(new Triplet<>(56.0,28.0,"/"));

        t.forEach(tmp ->result += "\n" + c.compute(tmp.x,tmp.y,tmp.z));

        System.out.println(result);
    }
}