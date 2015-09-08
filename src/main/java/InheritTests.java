import java.util.Arrays;

/**
 * Created by Jarek on 2015-08-21.
 */
public class InheritTests {

    public class A {
        void print (){System.out.println("a:1");};
    };
    public class B extends A {

        @Override
        void print() {System.out.println("b:1");};

        void print (B b ){System.out.println("b:2");};

    };

    InheritTests(){

        A a = (A)new B();

        A b = new B();

        ((A)b).print();


    };
}
