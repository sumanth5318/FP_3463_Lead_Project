public class Main {
    public static void main(String[] args){
        Manager m1 = new Manager("Serge",1996,60,3000,30,4);
        Manager m2 = new Manager("Cindy",1996,60,3000,20,6);
        Tester t = new Tester("Pierre",1995,60,3000,124);
        Programmer p1 = new Programmer("Paul",1994,60,3000,3);
        Programmer p2 = new Programmer("Matt",1993,60,3000,5);
        Programmer p3 = new Programmer("Sarah",1992,60,3000,3);
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
