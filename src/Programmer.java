public class Programmer extends Employee{
    int no_of_projects;

    public Programmer(String name,int birth_year,int rate,int monthly_salary,int no_of_projects) {
        super(name,birth_year,rate,monthly_salary);
        this.no_of_projects  = no_of_projects;
    }
    @Override
    public String toString() {
        return "We have a new Employee :" + name+",Programmer";
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
        info += "Name:"+name+"\nAge:"+calculate_age(birth_year)+"\nSerge has an Occupation rate:"+rate+"%.";
        info += "He/She has completed "+no_of_projects +" projects.\n";
        info += "His/Her estimated annual income is "+ annualincome()+".";
        String userinfo = info;
        return userinfo;

    }
}
