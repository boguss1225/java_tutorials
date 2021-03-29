package company;

public class company {
    int workingtime=8;
    String working;

    // add working
    public void working() {
        System.out.println("The employee do their own work.");
        workingtime--;
    }

    //overloading is used when we need to cover all different user case.
    // print working time
    public void workingtime(int i) {
        System.out.println("The employee working "+i+" hours");
        System.out.println("Current WT: "+workingtime+" hours");
    }

    // print working time
    public void workingtime(int i, int extra) {
        System.out.println("[extra]The employee working "+i+" hours"+" plus+"+extra);
    }

    // print working time
    public void workingtime(int i, int extra, String reason) {
        System.out.println("[extra]The employee working "+i+" hours"+" plus+"+extra);
        System.out.println("[Reason] : "+reason);
    }
    // display lunch time
    public void eatlunch() {
        System.out.println("The employee lunch time is 1hour between 12:00 to 13:00");
    }

    public void programming() {
        System.out.println("The programmer works programming");
    }
}


class webDesigner extends company {
    //int workingtime = 8;

    // add working
    public void working() {
        System.out.println("The employee do their own work.");
        workingtime--;
        workingtime--;
    }

    // overriding is used to implement specifically for the class
    // to ensure class sepecific implementation 
    public void designing() {
        System.out.println("The WEB DESIGNER works designing");
    }
}

class seniorWebDesigner extends webDesigner{
    public void proskill(){

    }

}

