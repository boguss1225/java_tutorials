package components;

//this class is ~~~
class computer {
	int click;
	int typing;
	int delete;
	int capacity;
	int speed;
	
    public class cpu {
        public int add(int a, int b, int c){
            //plus function!
            int result = a + b + c;
            return result;
        }

        public int minus(int a, int b, int c){
            //minus function!
            int result = a - b - c;
            return result;
        }

        public int multi(int a, int b, int c){
            //multiply function!
            int result = a * b * c;
            return result;
        }

        public float devide(int a, int b, int c){
            //divide function!
            int result = a / b / c;
            return result;
        }

        public void add(){
            System.out.println("add result = 0");
        }	

        public void stop(){
            System.out.println("The system will be stop after 10 seconds");	
        }
    }

	public void click(int i) {
	    System.out.println("The one of default fuction of computer is click.");
	    System.out.println("The clicking your count: " + click);
	}

	public void tying(int i, int delete) {
	    System.out.println("The one of default fuction of computer is ctyping.");
	    System.out.println("Your typing words are: " + typing + " and Your deleting words are: " + delete);
	}	
}

class MacAir extends computer{
    public void copy() {
        System.out.println("You can copy the words using command + C");
        capacity--;
        speed--;
    }
}

class MacPro extends MacAir{
    public void capacity() {
        System.out.println("The Macbook Pro capacity better than Macbook Air");
        capacity++;
    }
    // add working
    public void speed(int i) {
        System.out.println("The Macbook Pro speed better than Macbook Air");
        speed++;
    }
}

class Windows extends computer{
    public void controlC() {
        System.out.println("You can copy the words using control + C");
    }
}
