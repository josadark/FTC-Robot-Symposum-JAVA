import java.util.Scanner; //import the scanner class
public class lotsOfLoopsWithIF {

    public static void main(String[] args){

        Scanner scano = new Scanner(System.in);

        System.out.println("I remember everything you've said, start talking, type 'exit' to leave.");
        String response = "";
        boolean condition = true;
        String nextLine = "";
        while(condition) {
            nextLine = scano.nextLine();

            if(nextLine.equalsIgnoreCase("EXIT")){
                condition = false;
            }

            response = response + nextLine;

            System.out.println("Echo : " + response);
        }
    }

}




