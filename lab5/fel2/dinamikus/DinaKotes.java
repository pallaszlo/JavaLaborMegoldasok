package lab5.fel2.dinamikus;

class C1 {
    void m1() { m2(); }
    void m2() {
        System.out.println("C1.m2-ben vagyok!");
    }
}

class C2 extends C1 {
    void m2() {
        System.out.println("C2.m2-ben vagyok!");
    }
}

public class DinaKotes {
    public static void main (String args[]) {
        C1 obj1 = new C1();
        C2 obj2 = new C2();
        obj1.m2();   // -> C1.m2-ben vagyok!
        obj2.m2();   // -> C2.m2-ben vagyok!
        obj1.m1();   // -> C1.m2-ben vagyok!
        obj2.m1();   // -> C2.m2-ben vagyok!
        C1 c = new C2();
        c.m1();
    } // main
}

