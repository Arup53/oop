public class Main {
    public static void main(String[] args) {
        A a= new A();
        B b= new B();
        C c= new C();

        a.a();
        b.b();
        b.a();
        c.c();
        c.a();
        c.b();
    }
}

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