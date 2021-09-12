public class TestClasses {
    public static void main(String[] args) {
        System.out.println("Before object 1 creation");
        TestOne t = new TestOne();
        System.out.println("After object 1 creation");
        TestOne t2 = new TestOne();
        System.out.println("After object 2 creation");
        TestOne t3 = new TestOne();
        System.out.println("After object 3 creation");
    }
}

class TestOne{
    static {
        //Static initializer - called once per class is loaded
        //Can be used to initiate Static variables
        System.out.println("inside static initializer block");
    }
    public TestOne(String msg){
        System.out.println("inside constructor - msg=" + msg);
    }
    {
        System.out.println("Inside init block");//Init block will always be called before constructor
    }
}