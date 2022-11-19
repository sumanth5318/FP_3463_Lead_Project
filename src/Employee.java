public class Employee {

    int age;
    int birth_year;
    int rate;
    int monthly_salary;
    String name;

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
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setBirth_year(1999);
        emp.age = calculate_age(emp.birth_year);
        System.out.println(emp.age);
    }
    public static int calculate_age(int Dob){
        int current_year = 2022;
        return current_year - Dob;
    }
}