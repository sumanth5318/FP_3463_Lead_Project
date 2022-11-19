public class Tester extends Employee {
    int no_of_bugs;

   /* public void setNo_of_bugs(int no_of_bugs) {
        this.no_of_bugs = no_of_bugs;
    }*/
   public Tester(String name,int birth_year,int rate,int monthly_salary,int no_of_bugs) {
       super(name,birth_year,rate,monthly_salary);
       this.no_of_bugs  = no_of_bugs;
   }
    @Override
    public String toString() {
        return "We have a new Employee :" + name+",Tester";
    }

    public int getNo_of_bugs() {
        return no_of_bugs;
    }
    public int annualincome(){
        int GAIN_FACTOR_Error = 10;
        return GAIN_FACTOR_Error * no_of_bugs;
    }
    public String description(){
        String info = new String();
        info += "Name:"+name+"\nAge:"+calculate_age(birth_year)+"\nSerge has an Occupation rate:"+rate+"%.";
        info += "He/She corrected "+no_of_bugs +" bugs\n";
        info += "His/Her estimated annual income is "+ annualincome()+".";
        String userinfo = info;
        return userinfo;

    }
}
