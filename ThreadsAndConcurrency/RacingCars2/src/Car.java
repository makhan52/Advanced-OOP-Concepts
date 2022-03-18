public class Car {
    public double miles;
    public double odometer;
    public String name;
    public double maxMiles;

    public Car(String name,double miles){
        odometer = 0;
        this.name = name;
        this.miles = miles;
        this.maxMiles = miles;
    }

    public void move(double miles){
        if(0 < this.miles) {
            odometer = odometer + miles;
            this.miles = this.miles - miles;
        }
    }

    public void charge(){
        this.miles = maxMiles;
    }

    public String toString(){
        return name+": odo:"+odometer+" - miles left:"+miles;
    }
}
