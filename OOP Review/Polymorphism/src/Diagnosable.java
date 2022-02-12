public interface Diagnosable {
    double getTemperature();

    default boolean hasFever(){
        if(this.getTemperature() > 100.4 )
            return true;
        else
            return false;
    }
    int getSystolic();
    int getDiastolic();
    void setTemperature(double temperature);

    public void setSystolic(int systolic);
    public void setDiastolic(int diastolic);

}