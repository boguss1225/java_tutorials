package components;

//class never inside of class!! NEVER
//because extends can resolve that.

public class App{ 
    public static void main(String[] args) {
        computer a = new computer();
        computer.cpu cpuInstance = a.new cpu();
        cpuInstance.add(6, 8, 9);
        cpuInstance.add();
        cpuInstance.devide(7000, 2, 5);
        cpuInstance.multi(3000, 4, 299493);
        cpuInstance.minus(30, 8, 1);
        
        MacAir macair1 = new MacAir();
        macair1.tying(80, 8);
        macair1.click(70);
        ((MacPro) macair1).speed(300);
        ((MacPro) macair1).capacity();
        
        MacPro macpro1 = new MacPro();
        macpro1.tying(1000, 80);
        macpro1.click(3000);
        macpro1.speed(3000);
        macpro1.copy();
        macpro1.capacity();
        
    }
}
