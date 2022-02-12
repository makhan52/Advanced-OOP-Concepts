import java.util.ArrayList;

public class AdultPatient extends Person implements Diagnosable,Employable{
    double temperature;
    int systolic;
    int diastolic;
    ArrayList<String> previousjobs;

    @Override
    public double getTemperature() {

        return temperature;
    }
    @Override
    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public int getSystolic() {

        return systolic;
    }
    @Override
    public int getDiastolic() {

        return diastolic;
    }

    @Override
    public void setSystolic(int systolic) {

        this.systolic = systolic;
    }

    @Override
    public void setDiastolic(int diastolic) {

        this.diastolic = diastolic;
    }
    @Override
    public void addJob(String job) {
        if(this.previousjobs== null)
            this.previousjobs = new ArrayList<String>();
        this.previousjobs.add(job);
    }

    @Override
    public ArrayList<String> getPreviousJobs(){
        return this.previousjobs;
    }
}