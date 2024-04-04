
class BaseClass{
    protected void foo(){
        System.out.println("base foo()");
    }
}

class DerivedClass extends BaseClass{
    /*public*/ //void foo(){ //child method should have the same access modifier or general than parent
        System.out.println("Derived foo()");
    }
}

public class Q2 {
    public static void main(String[] args) {
        DerivedClass d = new DerivedClass();
        d.foo();
    }
}


