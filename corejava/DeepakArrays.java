import java.util.Arrays;

public class DeepakArrays {
    public static void main(String[] args) {
        String [] names = {"Deepak", "Anchal","Abha"};
        System.out.println("Original array\n");
        for (String s : names) {
            System.out.println(s);
        }
        String [] tmpVar = new String [2*names.length];
        System.arraycopy(names, 0, tmpVar, 0, names.length); //Copies elements from source array to target array
        
        System.out.println("System.arraycopy Copied array\n");
        
        for (String s : tmpVar) {
            System.out.print(s+"-");
        }
        
        byte [] bar = {1,2,3,4,5,6};
        
        byte[] barcopy = Arrays.copyOf(bar, bar.length*2);
        System.out.println("\n\nbar Array");
        for (byte s : bar) {
            System.out.print(s);
        }
        System.out.println("\n\nbarcopy Array");
        for (byte s : barcopy) {
            System.out.print(s);
        }
        
        byte[] barcopy2 = Arrays.copyOfRange(bar, 2, 5);//copy from 3rd element to 5th element, 5 is exclusive that is upto 5 is copied not 5
        
        System.out.println("\n\nbarcopy2 Array");
        for (byte s : barcopy2) {
            System.out.print(s);
        }

        byte[][] chessboard = new byte[8][8];
        byte onebyte = 1;
        for(int i=0; i<8;i++){
            for(int j=0;j<8;j++,onebyte++){
                chessboard[i][j]=onebyte;//store 1 to 8 in each row


            }
        }
        for (byte[] bs : chessboard) {
            for (byte bs2 : bs) {
                
                System.out.print(bs2);System.out.print("->");
            }
            System.out.println("\nchessboard[row]");
        }


    }
}
