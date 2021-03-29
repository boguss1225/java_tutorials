package company;

public class webProgrammer extends company {
    //int workingtime = 8;

    // add working
    public void working() {
        System.out.println("The employee do their own work.");
        workingtime--;
        workingtime--;
        workingtime--;
    }

    // overriding is used to implement specifically for the class
    // to ensure class sepecific implementation 
    public void programming() {
        System.out.println("The WEB PROGRAMMER works programming");
    }
}
