public class Manager extends Employee {
    private int no_of_travel_days;
    private int no_of_clients;
    Vehicle employeeVehicle;

    public Manager(String name, int birth_year, int rate, int monthly_salary, int no_of_clients, int no_of_travell_days) {
        super(name, birth_year, rate, monthly_salary, "Manager");
        this.no_of_travel_days = no_of_travell_days;
        this.no_of_clients = no_of_clients;
    }

    public Manager(String name, int birth_year, int rate, int monthly_salary, int no_of_clients, int no_of_travell_days, Vehicle employeeVehicle) {
        super(name, birth_year, rate, monthly_salary, "Manager", employeeVehicle);
        this.no_of_travel_days = no_of_travell_days;
        this.no_of_clients = no_of_clients;
        this.employeeVehicle = employeeVehicle;
    }

    @Override
    public String toString() {
        return super.toString() + getName() + " has an occupation rate:" + getRate() + "%." + "He/She travelled " +
                no_of_travel_days + " days and has brought " + no_of_clients + " new clients." +
                "His/Her estimated annual income is $" + annualincome();
    }

    public int getNo_of_clients() {
        return no_of_clients;
    }

    public int getNo_travell_days() {
        return no_of_travel_days;
    }

    public double annualincome() {
        int GAIN_FACTOR_CLIENT = 500;
        int GAIN_FACTOR_TRAVEL = 100;
        return (GAIN_FACTOR_CLIENT * getNo_of_clients()) + (GAIN_FACTOR_TRAVEL * getNo_travell_days()) + (getMonthly_salary() * 12);
    }

}
