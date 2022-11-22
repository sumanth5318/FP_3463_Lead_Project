public class Main {
    public static void main(String[] args) {

        Motorbike mb1 = new Motorbike("Kawasaki", "Custom Plate", "Blue", "Race", false);
        Motorbike mb2 = new Motorbike("Honda", "Custom Plate", "Black", "Not For Race", true);
        Car vt1 = new Car("Lamborghini", "Custom Plate", "White", "Family", "Manual", "Sport");
        Car vt2 = new Car("BMW", "Custom Plate", "Black", "Family", "Automatic", "Sedan");
        Car vt3 = new Car("Renault Clio", "Custom Plate", "Blue", "Family", "Manual", "Hatchback");
        Car vt4 = new Car("Mazda", "Custom Plate", "White", "Family", "Automatic", "SUV");


        Manager m1 = new Manager("Serge", 1996, 60, 3000, 30, 4, vt1);
        Manager m2 = new Manager("Cindy", 1996, 60, 3000, 20, 6, vt2);
        Tester t = new Tester("Pierre", 1995, 60, 3000, 124, mb2);
        Programmer p1 = new Programmer("Paul", 1994, 60, 3000, 3, mb1);
        Programmer p2 = new Programmer("Matt", 1993, 60, 3000, 5, vt4);
        Programmer p3 = new Programmer("Sarah", 1992, 60, 3000, 3, vt3);
        System.out.println("Test1:");
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
        System.out.println(p3.description());
    }
}

//        Motorbike mb1 = new Motorbike("Kawasaki", "Custom Plate", "Blue", "Race", false);
//        Motorbike mb2 = new Motorbike("Honda", "Custom Plate", "Black", "Not For Race", true);
//        Car vt1 = new Car("Lamborghini", "Custom Plate", "White", "Family", "Manual", "Sport");
//        Car vt2 = new Car("BMW", "Custom Plate", "Black", "Family", "Automatic", "Sedan");
//        Car vt3 = new Car("Renault Clio", "Custom Plate", "Blue", "Family", "Manual", "Hatchback");
//        Car vt4 = new Car("Mazda", "Custom Plate", "White", "Family", "Automatic", "SUV");



       /* System.out.println(vt1.toString());
        System.out.println(vt2.toString());
        System.out.println(vt3.toString());
        System.out.println(vt4.toString());
        System.out.println(mb1.toString());
        System.out.println(mb2.toString());*/
       // Manager ma1 = new Manager("Serge", 1985, 30, 4,vt1);
        //Manager ma2 = new Manager( "Cindy", 1974, 20, 6,  80, employeeVehicle: vt2);
        //Programmer(name: "Paul", birthYear: 1993, nbProjects: 3, rate: 75, employeeVehicle: m1);
        //Tester(name: "Pierre", birthYear: 1987, nbBugs: 124, rate: 50, employeeVehicle: m2);
        //Programmer(name: "Matt", birthYear: 1981, nbProjects: 5, rate: 110, employeeVehicle: vt4);
        //Programmer(name: "Sarah", birthYear: 1986, nbProjects: 3, employeeVehicle: vt3);

  //  }
//}
