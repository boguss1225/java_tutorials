import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        System.out.println("1. Sanpellegrine");
        System.out.println("2. Minute Maid");
        System.out.println("3. Trevi");
        System.out.println("4. Sprite");
        System.out.println("5. Fanta");
        System.out.println("6. Dr pepper");
        System.out.println("7. Welch's");
        System.out.println("8. Perrier");
        System.out.println("9. Sunkist");
        System.out.println("10. Coke");
        System.out.println("--------------------------");

        String[] favDrink = { "Sanpellegrine", "Minute Maid", "Trevi", "Sprite", "Fanta", "Dr pepper", "Welch's",
                "Perrier", "Sunkist", "Coke" };

        System.out.print("Which drink numb would you like?");
        Scanner sc = new Scanner(System.in);
        int chosenDrink = sc.nextInt();
        sc.close();
        
        System.out.println("---------- Here is your drink ----------");
        
        if (chosenDrink > 11) {
            System.out.println("this is out of bound");
        } else {
            System.out.println(favDrink[chosenDrink-1]);
            
        //         int drink = i;

        //         switch (i) {
        //             case 1:
        //                 System.out.println(favDrink);
        //                 break;

        //             case 2:
        //                 System.out.println("Minute Maid");
        //                 break;

        //             case 3:
        //                 System.out.println("Trevi");
        //                 break;

        //             case 4:
        //                 System.out.println("Sprite");
        //                 break;

        //             case 5:
        //                 System.out.println("Fanta");
        //                 break;

        //             case 6:
        //                 System.out.println("Dr pepper");
        //                 break;

        //             case 7:
        //                 System.out.println("Welch's");
        //                 break;

        //             case 8:
        //                 System.out.println("Perrier");
        //                 break;

        //             case 9:
        //                 System.out.println("Sunkist");
        //                 break;

        //             case 10:
        //                 System.out.println("Coke");
        //                 break;

        //             default :
        //                 System.out.println("Out of Boundary");
        //                 break;
        //         }

        //     }
        }

    }
}