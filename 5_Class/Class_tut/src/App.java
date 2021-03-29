// CLASS (붕어빵틀)= OBJECT = DATA TYPE = 틀 
// 인스턴스 (붕어빵).
// 1. 인스턴스를 만들기위해서는 반드시 class가 먼저 만들어져있어야한다.
//    (붕어빵 틀이 있어야 붕어빵을 만들수 있듯이)
// 2. 하나의 Class에서는 여러개의 인스턴스가 생성될수 있다.

//Micro wave
class Car{
    int speed = 0;
    String color = "red";
    //speed - temp
    public void setspeed(int i){
        speed = i;
    }
    //as it is
    public void setcolor(String a){
        color = a;
    }
    //heatup -> heatup ++ 4 = temp ++ 4
    public void excel(){
        System.out.println("gogo");
        speed++;
    }
    //cooling -> temp --1
    public void stop(){
        System.out.println("stop");
        speed= 0;
    }
    //stop = temp =0
    public void reverse(){
        System.out.println("back");
        speed--;
    }
}

public class App {
    public static void main(String[] args) throws Exception {

        Car myfirstcar = new Car();
        Car mysecondcar = new Car();
        Car o3rdcar = new Car();

        //1st car  //1st Microwave
        System.out.println("1st car");
        myfirstcar.setspeed(60);
        myfirstcar.excel();
        myfirstcar.excel();
        myfirstcar.excel();
        myfirstcar.excel();
        System.out.println(myfirstcar.speed);

        //2nd car
        System.out.println("2nd car");
        mysecondcar.setspeed(40);
        mysecondcar.excel();
        System.out.println(mysecondcar.speed);
        mysecondcar.excel();
        System.out.println(mysecondcar.speed);
        mysecondcar.stop();
        System.out.println(mysecondcar.speed);

        //3rd car
        o3rdcar.setspeed(30);
        System.out.println("3rd car");
        o3rdcar.excel();
        o3rdcar.reverse();
        o3rdcar.reverse();       
        System.out.println(o3rdcar.speed);

        //challange
        //1st micros heatup -> 여러개의 마이크로웨이브 번갈아가면서 랜덤하게 실행시키기
        //마지막에 최종 3개의 MW 온도 프린트하기

    }
}
