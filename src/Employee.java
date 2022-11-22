public class Employee {

    private int age;
     private int birth_year;
     private int rate;
     private int monthly_salary;
     private String name;
    public Employee(String name,int birth_year,int rate,int monthly_salary) {
        this.name = name;
        this.birth_year = birth_year;
        this.rate= rate;
        this.monthly_salary = monthly_salary;
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

    @Override
    public String toString() {
        /*return "Employee details :\n" +
                "age=" + age +
                ", birth_year=" + birth_year +
                ", rate=" + rate +
                ", monthly_salary=" + monthly_salary +
                ", name= " + name + '.' ;*/
        return "We have a new employee :" + name;
    }
    public static int calculate_age(int Dob){
        int current_year = 2022;
        return current_year - Dob;
    }
}