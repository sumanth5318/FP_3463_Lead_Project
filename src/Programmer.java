public class Programmer extends Employee{
    int no_of_projects;
    Vehicle employeeVehicle;
    String name;

    public Programmer(String name,int birth_year,int rate,int monthly_salary,int no_of_projects,Vehicle employeeVehicle) {
        super(name,birth_year,rate,monthly_salary,employeeVehicle);
        this.no_of_projects  = no_of_projects;
        this.employeeVehicle = employeeVehicle;


    }
    @Override
    public String toString() {
        return "We have a new Employee :" + getName()+",Programmer";
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
    public String description(){
        String info = new String();

        info += "\nName:"+getName()+"\nAge:"+calculate_age(getBirth_year())+"\nEmployee has a Motorbike";
        /*if(getName() == "Paul"){
            info += "\nEmployee has a motorbike";
        }
        else {
            info += "\nEmployee has a car";
        }*/
        info += employeeVehicle.toString();

        info +="\n"+getName()+" has an Occupation rate:"
                +getRate()+"%.";
        info += "He/She has completed "+no_of_projects +" projects.\n";
        info += "His/Her estimated annual income is "+ annualincome()+".";
        String userinfo = info;
        return userinfo;

    }
}
