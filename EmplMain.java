public class EmplMain {

    public static void main(String[] args) {
        Employee emp = new Employee();
        Employee emp2 = new Employee();
        Employee emp3 = new Employee();


        emp.name = "Jeff";
        emp.age = 28;
        emp.jobTitle = "Construction worker";

        emp2.name = "Sarah";
        emp2.age = 32;
        emp2.jobTitle = "Waitress";

        emp3.name = "Bob Dillion";
        emp3.age = 65;
        emp3.jobTitle = "Programmer";

        bar(emp);
        bar(emp2);
        bar(emp3);

    }

    static void bar(Employee e) {
    System.out.println(e.name + " is " + e.age + " of age and is working as " + e.jobTitle);
    }
}
