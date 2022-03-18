public class Racer implements Runnable
{
    Car c;
    int distance = 1000;
    public Racer(Car obj) {
        this.c = obj;
    }
    @Override
    public void run()   {
        try {
            System.out.println("Before the while loop: " +c.toString());

            while (distance > c.odometer)
            {

                if(0 == c.miles) {
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
