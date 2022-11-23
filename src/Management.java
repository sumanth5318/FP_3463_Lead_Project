import java.util.ArrayList;
import java.util.List;

public class Management {

        Motorbike mb1 = new Motorbike("Kawasaki", "Custom Plate", "Blue", "Race", false);
        Motorbike mb2 = new Motorbike("Honda", "Custom Plate", "Black", "Not For Race", true);
        Car vt1 = new Car("Lamborghini", "Custom Plate", "White", "Family", "Manual", "Sport");
        Car vt2 = new Car("BMW", "Custom Plate", "Black", "Family", "Automatic", "Sedan");
        Car vt3 = new Car("Renault Clio", "Custom Plate", "Blue", "Family", "Manual", "Hatchback");
        Car vt4 = new Car("Mazda", "Custom Plate", "White", "Family", "Automatic", "SUV");
       /* System.out.println("Test1:");
        System.out.println(m1.toString());
        System.out.println(m2.toString());
        System.out.println(t.toString());
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println("Test 2 ");
        System.out.println(m1.description());
        System.out.println(m2.description());
        System.out.println(t.description());
        System.out.println(p1.description());
        System.out.println(p2.description());
        System.out.println(p3.description());*/
        public void hire_test1(){
            ArrayList<Employee> employees = new ArrayList<>();
            employees.add(new Manager("Serge", 1996, 100, 3000, 30, 4));
            employees.add(new Manager("Cindy", 1996, 60, 3000, 20, 6));
            employees.add(new Tester("Pierre", 1995, 90, 3000, 124));
            employees.add(new Programmer("Paul", 1994, 60, 3000, 3));
            employees.add(new Programmer("Matt", 1993, 50, 3000, 5));
            employees.add(new Programmer("Sarah", 1992, 60, 3000, 3));

        }

}


