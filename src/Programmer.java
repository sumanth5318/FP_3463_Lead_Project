public class Programmer extends Employee{
    int no_of_projects;

    public void setNo_of_projects(int no_of_projects) {
        this.no_of_projects = no_of_projects;
    }

    public int getNo_of_projects() {
        return no_of_projects;
    }
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setName(" Paul");
        System.out.println(emp.toString());

    }
}
