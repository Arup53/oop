import java.util.ArrayList;

public class Main {

    public static void printPersons(ArrayList<Person> persons){
        for(Person person:persons){
            System.out.println(person);
        }
    }


    public static void main(String[] args) {


        Person ada= new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN",1200);
        Person esko= new Teacher("Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki",5600);

        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200));
        persons.add(new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028"));

        printPersons(persons);
    }
}

// ------- Task-1 --------

class A {
    public void a(){
        System.out.println("A");
    }
}

class B extends A {
    public void b(){
        System.out.println("B");
    }
}

class C extends B {
    public void c(){
        System.out.println("C");
    }
}

class Superclass {

    private String objectVariable;

    public Superclass() {
        this("Example");
    }

    public Superclass(String value) {
        this.objectVariable = value;
    }

    public String toString() {
        return this.objectVariable;
    }
}

class Subclass extends Superclass {

    public Subclass() {
        super("Subclass");
    }

    @Override
    public String toString() {
       return  "\n  And let's add my own message to it!";
    }
}


// ------- Task-2 --------
class Person{
    private String name;
    private String address;

    public Person(String name, String address){
        this.name=name ;
        this.address= address;
    }

    public String toString(){
        return this.name+"\n"+" "+this.address ;
    }
}

class Student extends Person{
    private int creditScore;

    // in super method this.name, this.address  will not work as the object is not created then how will its address be found
    public Student(String name, String address){
        super(name, address);
        this.creditScore=0;
    }

    public int credit(){
        return this.creditScore ;
    }

    public void study(){
        this.creditScore++ ;
    }

    @Override
    public String toString(){
        return super.toString()+"\n"+"Study credits"+" "+this.creditScore;
    }
}


class Teacher extends Person{
    private int salary;

    public Teacher(String name,String address, int salary){
        super(name,address);
        this.salary=salary;
    }

    @Override
    public String toString(){
        return super.toString()+"\n"+"Salary"+" "+this.salary+" "+"euro/month" ;
    }
}

// ------- Task-3 ------
// actual type of an object means kon class er object

// main concept behind polymorphism(object) that one type of variable er moddhe arek type er value store kora which is reference(memory address)
// Objects are polymorphic- object er bohu rupi achoron hote pare
// Objects can be treated as instances of their own class, their superclass(es), or any interface(s) they implement.
// 🔍 In simple words:
// An object of a subclass can take many forms — it can behave like:
// its own class
// a parent class
// an interface it implements
// This ability to be used in different ways depending on context is what we call polymorphism.