public class Employee {

    private int age;
     private int birth_year;
     private int rate;
     private int monthly_salary;
     private String name;
     private String role;
     Vehicle employeeVehicle;
     Contract contract;

    public Employee(String name, int birth_year, int rate, int monthly_salary, String role) {
        this.name = name;
        this.birth_year = birth_year;
        this.rate = rate;
        this.monthly_salary = monthly_salary;
        this.role = role;
        System.out.println("We have a new Employee: " + getName() + ", a " + getRole());
    }
    public Employee(String name,int birth_year,int rate,int monthly_salary,String role,Vehicle employeeVehicle) {
        this.name = name;
        this.birth_year = birth_year;
        this.rate= rate;
        this.monthly_salary = monthly_salary;
        this.employeeVehicle = employeeVehicle;
        this.role = role;
        System.out.println("We have a new Employee: " + getName() + ", a " + getRole());
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public int getBirth_year() {
        return birth_year;
    }

    public void setBirth_year(int birth_year) {
        this.birth_year = birth_year;
    }

    public int getMonthly_salary() {
        return monthly_salary;
    }

    public void setMonthly_salary(int monthly_salary) {
        this.monthly_salary = monthly_salary;
    }

    public String getRole() {
        return role;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String signcontract(Contract contract){
        return "";
    }

    @Override
    public String toString() {
        return "\nName: " + getName() + ", a " + getRole() + "\nAge: " + calculate_age(getBirth_year()) + employeeVehicle;
    }
    public static int calculate_age(int Dob){
        int current_year = 2022;
        return current_year - Dob;
    }
}