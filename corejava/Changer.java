public class Changer {

    public static final int INSTANCES = 5;

    private static int myClones;

    Changer(){
        myClones+=1;
        System.out.println("Class created");
    }

    public void getClones() {
        System.out.println(myClones);
    }

    public void changeMe(String source){
        //source = source + " changed";
        source.concat(" changed");

    }

}