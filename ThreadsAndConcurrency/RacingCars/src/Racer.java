public class Racer implements Runnable /* TODO Add something here so that you can pass this Racer to the constructor of Thread*/
{
    Car c;
    int distance = 1000; // this is a racer that is going to run 1000 miles.
    public Racer(Car obj) {
        this.c = obj;
    }
    @Override
    public void run()   {
        try {
            while (distance > c.odometer)
            {
                System.out.println("In the while loop: " + c.toString());

                if(c.miles == 0) {
                    System.out.println(c.name + " is charging");

                    Thread.sleep((long)c.maxMiles);
                    c.charge();

                }
                c.move(1);
            }
            System.out.println(c.name + " finished");
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }
}
