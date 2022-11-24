public class Programmer extends Employee{
    private int no_of_projects;
    Vehicle employeeVehicle;
    String name;


    public Programmer(String name,int birth_year,int rate,int monthly_salary,int no_of_projects) {
        super(name,birth_year,rate,monthly_salary,"Programmer");
        this.no_of_projects  = no_of_projects;
    }
    public Programmer(String name,int birth_year,int rate,int monthly_salary,int no_of_projects,Vehicle employeeVehicle) {
        super(name,birth_year,rate,monthly_salary,"Programmer",employeeVehicle);
        this.no_of_projects  = no_of_projects;
        this.employeeVehicle = employeeVehicle;
    }
    @Override
    public String toString() {

        return super.toString() +getName()+" has an occupation rate:"+getRate()+"%.He/She completed "+ no_of_projects +" projects."+
        "His/Her estimated annual income is $"+ annualincome();
    }

    public void setNo_of_projects(int no_of_projects) {
        this.no_of_projects = no_of_projects;
    }

    public int getNo_of_projects() {
        return no_of_projects;
    }
    public int annualincome(){
        int GAIN_FACTOR_PROJECTS = 200;
        return GAIN_FACTOR_PROJECTS * no_of_projects;
    }

}
