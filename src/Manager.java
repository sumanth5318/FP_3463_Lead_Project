public class Manager extends Employee {
    int no_of_travel_days;
    int no_of_clients;
    public Manager(String name,int birth_year,int rate,int monthly_salary,int no_of_clients,int no_of_travell_days) {
        super(name,birth_year,rate,monthly_salary);
        this.no_of_travel_days =no_of_travell_days;
        this.no_of_clients=  no_of_clients;
    }

    @Override
    public String toString() {
        return "We have a new Employee :" + name+",Manager";
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
        return (GAIN_FACTOR_CLIENT*no_of_clients)+(GAIN_FACTOR_TRAVEL* no_of_travel_days);
    }
    public String description(){
        String info = new String();
        info += "Name:"+name+"\nAge:"+calculate_age(birth_year)+"\nSerge has an Occupation rate:"+rate+"%.";
        info += "He/She travelled "+no_of_travel_days +" days and has brought "+no_of_clients+" new clients.\n";
        info += "His/Her estimated annual income is "+ annualincome()+".";
        String userinfo = info;
        return userinfo;

    }
}
