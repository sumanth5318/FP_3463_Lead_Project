public class Temporary extends Contract{
    private double hourlySalary = 0;
    private int accumulatedHours= 0;
    private double accumulatedsalary;
    public Temporary(double hourlySalary,int accumulatedHours){
        this.hourlySalary = hourlySalary;
        this.accumulatedHours =accumulatedHours;
    }

    public double getHourlySalary() {
        return hourlySalary;
    }

    public int getAccumulatedHours() {
        return accumulatedHours;
    }

    public double getAccumulatedsalary() {
        return accumulatedsalary;
    }

    public void setAccumulatedsalary(double accumulatedsalary) {
        this.accumulatedsalary = accumulatedsalary;
    }

    @Override
    public String toString() {
        return  "he is a temporary employee with "+getHourlySalary()+" hourly salary and he has worked for "+getAccumulatedHours()+" hours.";
    }
    public double accumulatedsalary(){
        accumulatedsalary = getHourlySalary()*getAccumulatedHours()*12;
        return accumulatedsalary;
    }
}
