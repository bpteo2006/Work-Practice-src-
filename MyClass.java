public class MyClass {
    public static void main(String[] args) {

        Person newObj = new Person(); // create new object
        newObj.setName("Bob"); // assign value to name
        newObj.setAge(24);
        System.out.println("Name is "+newObj.getName() + " Age "+ newObj.getAge()) ; // display name
        
        Person myObj = new Person();
        myObj.setName("James");
        myObj.setAge(15);
        System.out.println(myObj.getName() + " "+ myObj.getAge());

        Thing thing = new Thing();
        //thing.num = 5;
        thing.setNum(5);
        thing.word = "Bob";
        int numb = thing.getNum();

        Thing thing2 = new Thing();
        //thing2.num = 3;
        thing2.setNum(3);
        thing2.word = "Alice";

        //System.out.println(thing.num + thing2.num + " " + thing.word + " " + thing2.word);
        System.out.println(numb + " " + thing.word + " " + thing2.word);

        thing.foo();
        thing2.foo();

        Animal animal = new Animal();
        animal.setName("Cat");
        animal.setFur(true);
        animal.setSkin("fur");

        animal.setCall(true);
        animal.setNoise("meows");

        /*System.out.println("It is a "+animal.getName() +
         ". It " + (animal.hasFur()? " has fur." : "does not have fur.") +
          " It " + (animal.getCall()? "can call," : "cannot call,") + 
          (animal.getCall()? "It "+animal.getNoise() : " "));*/

          System.out.println("It is a "+animal.getName() + "." +
          (" It has " + animal.getSkin()) + "." +
          (animal.getCall()? " It "+animal.getNoise() : " It cannot call."));
 
        Animal animal2 = new Animal();
        animal2.setName("Fish");
        animal2.setFur(false);
        animal2.setSkin("scale");
        animal2.setCall(false);
        animal2.setNoise(" ");

        /*System.out.println("It is a "+animal2.getName() + 
        ". It " + (animal2.hasFur()? " has fur" : "does not have fur"));*/

        /*System.out.println("It is a "+animal2.getName() +
        ". It " + (animal2.hasFur()? " " : (" It has "+ animal2.getSkin() +".")) +
         (animal2.getCall()? " It "+animal2.getNoise() : " It cannot call."));*/

         /* System.out.println("It is a "+animal2.getName() +
         (animal2.hasFur()? (" It has " + animal2.getSkin()) : " ") +
          (animal2.getCall()? " It "+animal2.getNoise() : " It cannot call.")); */

        /* System.out.println("It is a "+animal2.getName() +
          (animal2.hasFur()? (" It has " + animal2.getSkin()) : " ") +
           (animal2.getCall()? " It "+animal2.getNoise() : " It cannot call.")); */

        System.out.println("It is a "+animal2.getName() + "." +
        (" It has " + animal2.getSkin()) + "." +
        (animal2.getCall()? " It "+animal2.getNoise() : " It cannot call."));

        Animal animal3 = new Animal();
        animal3.setName("dog");
        animal3.setSkin("fur");
        animal3.setCall(true);
        animal3.setNoise("barks");

        System.out.println("It is a "+animal3.getName() + "." +
        (" It has " + animal3.getSkin()) + "." +
        (animal3.getCall()? " It "+animal3.getNoise() : " It cannot call."));

        Animal animal4 = new Animal();
        animal4.setName("snake");
        animal4.setSkin("scale");
        animal4.setCall(false);
        animal4.setNoise("hiss");

        System.out.println("It is a "+animal4.getName() + "." +
        (" It has " + animal4.getSkin()) + "." +
        (animal4.getCall()? " It "+animal4.getNoise() : " It cannot call.") +
        (animal4.getNoise() != " " && animal4.getCall() ? "A" : " ")); // not working
        
    }
}
