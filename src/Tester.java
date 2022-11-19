public class Tester extends Employee {
    int no_of_bugs;

    public void setNo_of_bugs(int no_of_bugs) {
        this.no_of_bugs = no_of_bugs;
    }

    public int getNo_of_bugs() {
        return no_of_bugs;
    }
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setName("Cindy");
        System.out.println(emp.toString());

    }
}
