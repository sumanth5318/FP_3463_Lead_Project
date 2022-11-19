public class Manager extends Employee {
    int no_travell_days;
    int no_of_clients;
    public void setNo_of_clients(int no_of_clients) {
        this.no_of_clients = no_of_clients;
    }

    public void setNo_travell_days(int no_travell_days) {
        this.no_travell_days = no_travell_days;
    }
    public int getNo_of_clients() { return no_of_clients; }
    public int getNo_travell_days() {return no_travell_days; }

    public static void main(String args[]){
        Employee emp = new Employee();
        emp.setName("sai");
        emp.setRate(100);
        System.out.println(emp.toString());
    }
}
