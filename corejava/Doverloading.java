public class Doverloading {
    public static void main(String[] args) {
        sayMyName();
        sayMyName(5);
        sayMyName("Deepak");
    }

    public static void sayMyName(){
        System.out.println("Heisenberg");
    }
    public static void sayMyName(String name){
        System.out.println(name);
    }
    public static void sayMyName(int name){
        System.out.println(name);
    }
    public static void sayMyName(long name){
        System.out.println(name);
    }
}
