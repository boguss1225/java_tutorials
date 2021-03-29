//Microwave



class microwaves{
    int temp = 0;

    //speed - temp
    public void settemp(int i){
        this.temp = i;
    }
    
    //heatup -> heatup ++ 4 = temp ++ 4
    public void heatUp(){
        System.out.println("heat the food in the microwave");
        this.temp++;
    }
    //cooling -> temp --1
    public void cooling(){
        System.out.println("Cooling the microwave");
        this.temp--;
    }

    //stop = temp =0 
    public void stop(){
        System.out.println("Finished your meal heating");
        this.temp = 0;
    }

}

public class App {
    public static void main(String[] args) {

        microwaves whitemicrowave = new microwaves();
        microwaves blackmicrowave = new microwaves();
        microwaves redmicrowave = new microwaves();
        
        // white Microwave
        System.out.println("white microwave");
        whitemicrowave.heatUp();
        whitemicrowave.heatUp();
        whitemicrowave.heatUp();
        whitemicrowave.heatUp();
        System.out.println(whitemicrowave.temp);

        // black microwave
        System.out.println("2nd car");
        blackmicrowave.cooling();
        System.out.println(blackmicrowave.temp);

        // red microwave
        redmicrowave.stop();
        System.out.println(redmicrowave.temp);

        // challenge
        // 1st micros heatup -> 여러개의 마이크로웨이브 번갈아가면서 랜덤하게 실행시키기
        whitemicrowave.heatUp();
        blackmicrowave.cooling();
        redmicrowave.stop();
        whitemicrowave.heatUp();
        redmicrowave.heatUp();
        whitemicrowave.cooling();
        redmicrowave.heatUp();
        System.out.println("The withe microwave temperature is:");
        System.out.println(whitemicrowave.temp);
        System.out.println("The black microwave temperature is:");
        System.out.println(blackmicrowave.temp);
        System.out.println("The red microwave temperature is:");
        System.out.println(redmicrowave.temp);
        // 마지막에 최종 3개의 MW 온도 프린트하기

    }

}