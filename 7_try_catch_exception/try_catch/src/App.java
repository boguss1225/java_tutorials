import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("Hello, World!");
        Scanner sc = new Scanner(System.in);
        while(true){
            try{
                //can possibly fail code
                sc.nextInt();
                System.out.println("You got the right input!");
                //seat input here AA1AA
                //seat input here AA1AA
                //seat input here AA1AA
                //seat input here AA1AA   
            }catch(Exception e){
                System.out.println(e);
                System.out.println("please insert Int!!");
                break;
            }
        }
    }
}
