//package Java_tutorials_2;

import java.util.Scanner;

class Animal{
    int legs;
    String name;

    public void breath(){
        System.out.println("hek hek");
    }

    public void walk(int i){
        System.out.println("walk walk");
    }
}

class Cat extends Animal {
    int beard = 6; 

    public void jump(int i){
        System.out.println("jump jump");
    }
}

class Bird extends Animal{
    int feather = 100000;
    //overriding
    //same name same parameter -> implementation diff
    // (c.f. overloading - > same method name diff parameter -> implemt diff) 
    public void walk(){ //priority to be executed!
        System.out.println("chong chong");
    }

    public void fly(){
        System.out.println("fly fly");        
    }
}

class bear extends Animal{
    public void jump(){
        System.out.println("jump jump");
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        // parant
        Animal animal1 = new Animal();
        animal1.walk(111);
        animal1.breath();
        
        // child
        Cat cat1 = new Cat();
        cat1.walk(11);
        cat1.breath();
        cat1.jump(11);
        int i = cat1.beard;
        System.out.println("the number of beard for the cat is : "+i);
        //cat1.fly();

        // child2
        Bird bird1 = new Bird();
        bird1.walk();
        bird1.walk(1);
        bird1.breath();
        bird1.fly();
        //bird1.jump();
    }
}

