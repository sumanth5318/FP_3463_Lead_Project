import java.util.ArrayList;

public class Management {

    Motorbike mb1 = new Motorbike("Kawasaki", "Custom Plate", "Blue", "Race", false);
    Motorbike mb2 = new Motorbike("Honda", "Custom Plate", "Black", "Not For Race", true);
    Car vt1 = new Car("Lamborghini", "Custom Plate", "White", "Family", "Manual", "Sport");
    Car vt2 = new Car("BMW", "Custom Plate", "Black", "Family", "Automatic", "Sedan");
    Car vt3 = new Car("Renault Clio", "Custom Plate", "Blue", "Family", "Manual", "Hatchback");
    Car vt4 = new Car("Mazda", "Custom Plate", "White", "Family", "Automatic", "SUV");

    public void hire_test1() {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Manager("Serge", 1996, 100, 3000, 30, 4));
        employees.add(new Manager("Cindy", 1996, 80, 3000, 20, 6));
        employees.add(new Programmer("Paul", 1994, 60, 3000, 3));
        employees.add(new Tester("Pierre", 1995, 90, 3000, 124));
        employees.add(new Programmer("Matt", 1993, 50, 3000, 5));
        employees.add(new Programmer("Sarah", 1992, 60, 3000, 3));
    }

    public void hire_test2() {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Manager("Serge", 1996, 100, 3000, 30, 4, vt1));
        employees.add(new Manager("Cindy", 1996, 60, 3000, 20, 6, vt2));
        employees.add(new Programmer("Paul", 1994, 60, 3000, 3, mb1));
        employees.add(new Tester("Pierre", 1995, 90, 3000, 124, mb2));
        employees.add(new Programmer("Matt", 1993, 50, 3000, 5, vt4));
        employees.add(new Programmer("Sarah", 1992, 60, 3000, 3, vt3));
        for (Employee i : employees) {
            System.out.println("-------------------------");
            System.out.println(i);
            System.out.println("-------------------------");
        }

    }

    public void hire_test3() {
        ArrayList<Employee> employees = new ArrayList<>();
        Manager Serge = new Manager("Serge", 1996, 100, 3000, 30, 4, vt1);
        Manager Cindy = new Manager("Cindy", 1996, 60, 3000, 20, 6, vt2);
        Programmer Paul = new Programmer("Paul", 1994, 60, 3000, 3, mb1);
        Tester Pierre = new Tester("Pierre", 1995, 90, 3000, 124, mb2);
        Programmer Matt = new Programmer("Matt", 1993, 50, 3000, 5, vt4);
        Programmer Sarah = new Programmer("Sarah", 1992, 60, 3000, 3, vt3);
        Permanent p1 = new Permanent(2, true, 6000.00, 200, 17);
        Permanent p2 = new Permanent(3, false, 5000.00, 150, 19);
        Temporary t1 = new Temporary(60, 30);
        Temporary t2 = new Temporary(50, 60);
        Permanent p3 = new Permanent(1, true, 4000.00, 100, 20);
        Permanent p4 = new Permanent(4, true, 4500.00, 100, 19);
        Serge.signContract(p1);
        Cindy.signContract(p2);
        Paul.signContract(t1);
        Matt.signContract(t2);
        Pierre.signContract(p3);
        Sarah.signContract(p4);
        employees.add(Serge);
        employees.add(Cindy);
        employees.add(Paul);
        employees.add(Pierre);
        employees.add(Matt);
        employees.add(Sarah);
        for (Employee item : employees) {
            System.out.println("-------------------------");
            System.out.println(item);
            System.out.println("-------------------------");
        }
        System.out.println("-------------------------");
        System.out.println("Contracts: ");
        System.out.println("-------------------------");
        for (Employee item : employees) {
            Contract contract = item.getContract();
            System.out.println(item.contractInfo()+contract);
        }
        System.out.println("-------------------------");
        Permanent p5 = new Permanent(1, true, 5000, 200, 30);
        Matt.signContract(p5);
        System.out.println("-------------------------");
        System.out.println("Contracts: ");
        System.out.println("-------------------------");
        for (Employee item : employees) {
            Contract contract = item.getContract();
            System.out.println(item.contractInfo()+contract);
        }
        System.out.println("-------------------------");
    }
}


