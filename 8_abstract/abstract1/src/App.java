//abstract class 또는 method 는 상속을 강제한다.

abstract class mammalia {
    abstract void breath();
    abstract void baby();
}

class cow extends mammalia{
    void breath(){
        System.out.println("cow breath");
    }

    void baby() {
        System.out.println("cow breath");
    }
}

class dolphin extends mammalia{
    @Override
    void breath() {
        // TODO Auto-generated method stub
        System.out.println("dolphin breath");
    }

    @Override
    void baby() {
        // TODO Auto-generated method stub
        System.out.println("dolphin baby");
    }   
}


public class App {
    public static void main(String[] args) throws Exception {
        //mammalia a = new mammalia();
        System.out.println("Hello, World!");
        cow cow1 = new cow();
        cow1.baby();
        cow1.breath();
    }
}
