public class Tester extends Employee {
    private int no_of_bugs;
    Vehicle employeeVehicle;

   /* public void setNo_of_bugs(int no_of_bugs) {
        this.no_of_bugs = no_of_bugs;
    }*/
   public Tester(String name,int birth_year,int rate,int monthly_salary,int no_of_bugs,Vehicle employeeVehicle) {
       super(name,birth_year,rate,monthly_salary,employeeVehicle);
       this.no_of_bugs  = no_of_bugs;
       this.employeeVehicle = employeeVehicle;
   }
    @Override
    public String toString() {
        return "We have a new Employee :" + getName()+",Tester";
    }

    public int getNo_of_bugs() {
        return no_of_bugs;
    }
    public int annualincome(){
        int GAIN_FACTOR_Error = 10;
        return GAIN_FACTOR_Error * getNo_of_bugs();
    }
    public String description(){
        String info = new String();
        info += "Name:"+getName()+"\nAge:"+calculate_age(getBirth_year())+"\nEmployee has a motorcyle";
        info += employeeVehicle;
        info +="\n"+getName()+" has an Occupation rate:"+getRate()+"%.";
        info += "He/She corrected "+getNo_of_bugs() +" bugs\n";
        info += "His/Her estimated annual income is "+ annualincome()+".";
        String userinfo = info;
        return userinfo;

    }
}
