package company;

public class App{
    public static void main(String[] args) {
        company company1 = new company();
        company1.working();
        company1.workingtime(8);
        company1.workingtime(7,4);
        company1.workingtime(8,2," Burnnings sim bu rum ");
        company1.eatlunch();

        webProgrammer programmer = new webProgrammer();
        programmer.working();
        programmer.working();
        programmer.working();
        programmer.workingtime(10);
        programmer.eatlunch();
        programmer.programming();
        int i = programmer.workingtime;
        System.out.println("The web developer works 2 hours over time");

        webDesigner designer = new webDesigner();
        designer.working();
        designer.workingtime(9);
        designer.eatlunch();
        designer.designing();
        designer.programming();

        System.out.println("The web designer works 1 hours over time");
        seniorWebDesigner swd = new seniorWebDesigner();
        swd.eatlunch();
        swd.workingtime(1);
        swd.workingtime(5, 5, "assistant");
    }

}