import java.util.Scanner;

public class App {
    static boolean [][] seat = new boolean [8][10];
    //    A  B  C  D   E  F  G  H 
    // 1  [] [] [] []  [] [] [] []
    // 2  [] [] [] []  [] [] [] []
    // 3  [] [] [] []  [] [] [] []
    // 4  [] [] [] []  [] [] [] []
    // 5  [] [] [] []  [] [] [] []
    // 6  [] [] [] []  [] [] [] []
    // 7  [] [] [] []  [] [] [] []
    // 8  [] [] [] []  [] [] [] []
    // 9  [] [] [] []  [] [] [] []
    // 10 [] [] [] []  [] [] [] []
 
    public static void main(String[] args) throws Exception {

        for(int i = 0 ; i < 8 ; i++){
            for(int j = 0 ; j<10 ; j++){
                seat[i][j] = true;
            }
        }
        
        System.out.println("    A  B  C  D   E  F  G  H ");
        for(int i = 0 ; i < 10 ; i++){
            System.out.print(i+1+" ");
            for(int j = 0 ; j<8 ; j++){
                if(seat[j][i]){
                    System.out.print("[o] ");                    
                }else{
                    System.out.print("[x] ");                    
                }
            }
            System.out.println();
        }
        
        System.out.println();

        Scanner sc = new Scanner(System.in);
        System.out.println("please enter seat colunm A~H :");
        String colunm = sc.nextLine();
        int colunmint=0;
        System.out.println("please enter seat row 1~10 :");
        int row1 = sc.nextInt();

        System.out.println("your selection is "+ colunm+row1);
        sc.close();
        String colunms = sc.nextLine();
        char column = colunms.charAt(0);//get the first char of the string
        
        switch (column) {
            case 'A', 'a' : colunmint = 0;
                break;
                
        }
            
            if(seat[colunmint][row1-1] == true){
                System.out.println("reservation completed!");
                seat[colunmint][row1-1] = false;
            }else{
                System.out.println("Please try to select other seat.");
            }

        if(seat[colunmint][row1-1] == true){
            System.out.println("reservation completed!");
            seat[colunmint][row1-1] = false;
        }else{
            //
        }

    }

    // public void mySeatNum() {
    //     for (int i = 0; i < 7; i++) {
    //         for (int j = 0; j < 9; j++) {
    //             seat[i][j] = "___";
    //             {
    //                 System.out.println("————— My seat number is —————");
    //             }

    //         }
    //     }

    // }
}
