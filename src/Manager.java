public class Manager extends Employee {
    private int no_of_travel_days;
    private int no_of_clients;
    public Manager(String name,int birth_year,int rate,int monthly_salary,int no_of_clients,int no_of_travell_days) {
        super(name,birth_year,rate,monthly_salary);
        this.no_of_travel_days =no_of_travell_days;
        this.no_of_clients=  no_of_clients;
    }

    @Override
    public String toString() {
        return "We have a new Employee :" +getName()+",Manager";
    }

   /* public void setNo_of_clients(int no_of_clients) {
        this.no_of_clients = no_of_clients;
    }*/

    /*public void setNo_travel_days(int no_travel_days) {
        this.no_of_travel_days = no_travel_days;
    }*/
    public int getNo_of_clients() { return no_of_clients; }
    public int getNo_travell_days() {return no_of_travel_days; }
    public int annualincome(){
        int GAIN_FACTOR_CLIENT = 500;
        int GAIN_FACTOR_TRAVEL = 100;
        return (GAIN_FACTOR_CLIENT*getNo_of_clients())+(GAIN_FACTOR_TRAVEL*getNo_travell_days());
    }
    public  String description(){
        String info = new String();
       // Vehicle v = new Vehicle();
        info += "\nName:"+getName()+"\nAge:"+calculate_age(getBirth_year())+"\nEmployee has a Car:";
       // info += "\t -make:";
        info += "\nSerge has an Occupation rate:"+getRate()+"%.";
        info += "He/She travelled "+no_of_travel_days +" days and has brought "+no_of_clients+" new clients.\n";
        info += "His/Her estimated annual income is "+ annualincome()+".";
        String userinfo = info;
        return userinfo;

    }
}
