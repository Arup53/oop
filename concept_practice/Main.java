public class Main {
    public static void main(String[] args) {
        A a= new A();
        B b= new B();
        C c= new C();

        Superclass sup = new Superclass();
        Subclass sub = new Subclass();

        System.out.println(sup);
        System.out.println(sub);

     
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
       return super.toString() + "\n  And let's add my own message to it!";
    }
}


// ------- Task-2 --------