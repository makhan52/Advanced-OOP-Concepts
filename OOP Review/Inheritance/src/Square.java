/* TODO : Complete the Square class.
 Add variables if you need.
 Remember to use the @Override to override methods.
intelliJ will be helpful if you do).*/

public class Square extends Shape {
    double lengthSide;

    public Square(double lengthSide, String name) {
        super(name);
        this.lengthSide = lengthSide;
    }

    @Override
    public double getArea() {
        double area = this.lengthSide * this.lengthSide;
        return area;
    }

    @Override
    public double getPerimeter() {
        double perimeter = this.lengthSide * 4;
        return perimeter;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj.getClass() == this.getClass()) {
            Square s = (Square) obj;
            return this.name.equals(s.name) && this.lengthSide == (s.lengthSide);
        }
        return false;
    }

    @Override
    public String toString(){
        String str = this.name + ":" + this.lengthSide;
        return str;
    }
}