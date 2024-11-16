import java.util.Scanner; //import the scanner class
public class lotsOfLoops {

    public static void main(String[] args){

        Scanner scano = new Scanner(System.in);

        System.out.println("I remember everything you've said, start talking");
        String response = "";
        while(true) {
            response = response + scano.nextLine();
            System.out.println("Echo : " + response);
        }
    }

}




