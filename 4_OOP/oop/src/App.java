
import java.util.Scanner;

import jdk.internal.org.jline.terminal.MouseEvent;

public class App {
	
	public static void main(String[] args) throws Exception {
		
		System.out.println("This is calculator program");

        //input receiver code.
        Scanner sc = new Scanner(System.in);
        System.out.println("please insert the first input:");
        int input1 = sc.nextInt(); //enter
        System.out.println("please insert the second input:");
        int input2 = sc.nextInt();
        System.out.println("please insert the third input:");
        int input3 = sc.nextInt();
        
        //Let's calculation!
        int result = add(input1, input2, input3);
        System.out.println("The add result is: " + result);
        int result1 = minus(input1, input2, input3);
        System.out.println("The minus result is: " + result1);
        int result2 = multi(input1, input2, input3);
        System.out.println("The multi result is: " + result2);
        float result3 = devide(input1, input2, input3);
        float result4 = devide(input1,input2);
        System.out.println("The devide result is: " + result3);
        
        sc.close();
    }



    public static int add(int a, int b, int c){
        //plus function!
        int result = a + b + c;
        return result;
    }
    public static int add(int a, int b){
        //plus function!
        int result = a + b;
        return result;
    }

    public static int minus(int a, int b, int c){
        //minus function!
        int result = a - b - c;
        return result;
        
    }
    public static int minus(int a, int b){
        //minus function!
        int result = a - b;
        return result;
        
    }

    public static int multi(int a, int b, int c){
        //multiply function!
        int result = a * b * c;
        return result;
   
    }
    public static int multi(int a, int b){
        //multiply function!
        int result = a * b;
        return result;
   
    }

    public static float devide(int a, int b, int c){
        //divide function!
        int result = a / b / c;
        return result;
     
    }
    public static int devide(int a, int b){
        //divide function!
        int result = a / b;
        return result;
     
    }

    public static void add(){
        //plus function!
        System.out.println("add result = 0");
    }	
		
}