public class Tester extends Employee {
    private int no_of_bugs;
    Vehicle employeeVehicle;

   /* public void setNo_of_bugs(int no_of_bugs) {
        this.no_of_bugs = no_of_bugs;
    }*/

    public Tester(String name,int birth_year,int rate,int monthly_salary,int no_of_bugs) {
        super(name,birth_year,rate,monthly_salary,"Tester");
        this.no_of_bugs  = no_of_bugs;
    }
    public Tester(String name,int birth_year,int rate,int monthly_salary,int no_of_bugs,Vehicle employeeVehicle) {
        super(name,birth_year,rate,monthly_salary,"Tester",employeeVehicle);
        this.no_of_bugs  = no_of_bugs;
        this.employeeVehicle = employeeVehicle;
    }
    @Override
    public String toString() {

       return super.toString() +getName()+" has an occupation rate:"+getRate()+"%.He/She corrected "+no_of_bugs +" bugs "+
               "His/Her estimated annual income is $"+ annualincome();
    }

    public int getNo_of_bugs() {
        return no_of_bugs;
    }
    public int annualincome(){
        int GAIN_FACTOR_Error = 10;
        return GAIN_FACTOR_Error * getNo_of_bugs();
    }

}
