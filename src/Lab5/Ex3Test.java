package Lab5;

class A { public int a =100; } // End of class A
class B extends A { public int a =80; } // End of class B
class C extends B { public int a =60; } // End of class C
class D extends C { public int a =40; } // End of class D

class E extends D{
    public int a =10;
    public void show(){
// Write Java statements to display the values of all a’s used in this file on System.out
        int a =0;
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(super.a);
        System.out.println(((C)this).a);
        System.out.println(((B)this).a);
        System.out.println(((A)this).a);
    }
}// End of class E

public class Ex3Test {
    public static void main(String[] args){
        new E().show(); // This is an example of anonymous object
        C a1 = new D();
        E d1 = (E) a1; // what’s wrong with this statement?
        d1.a = 20;
        System.out.println(d1.getClass().getName());
        System.out.println(d1.a);
    }// End of main()
}
