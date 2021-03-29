final class solarsystem{
    final int solor_temp = 1000;
    int solor_temp2 = 1000;
    final String [] menus = {"1.Explore","2.Mag","3.branch","4.bug","5.app","6.research","7","8","9","10"};

    void moon_moving(int a){
        //can not change final variable
        //solor_temp=a;
        System.out.println(menus[1]);
    }
    
}

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
