package firstInterface;

public class MyDemo implements MyInterface {

    public MyDemo(){

    }

    @Override
    public  void method1() {
        System.out.println("implementation of method 1");
    }

    @Override
    public String method2() {
        return "implementation of method 2";

    }


}
