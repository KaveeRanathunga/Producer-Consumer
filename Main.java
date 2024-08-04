//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        SharedQueue sharedQueue = new SharedQueue();

        Thread computer1 = new Computer(sharedQueue);
        computer1.setName("Computer-1");
        Thread computer2 = new Computer(sharedQueue);
        computer2.setName("Computer-2");
        Thread computer3 = new Computer(sharedQueue);
        computer3.setName("Computer-3");
        Thread computer4 = new Computer(sharedQueue);
        computer4.setName("Computer-4");
        Thread computer5 = new Computer(sharedQueue);
        computer5.setName("Computer-5");

        Thread printer1 = new Printer(sharedQueue);
        printer1.setName("Printer-1");
        Thread printer2 = new Printer(sharedQueue);
        printer2.setName("Printer-2");

        computer1.start();
        computer2.start();
        computer3.start();
        computer4.start();
        computer5.start();

        printer1.start();
        printer2.start();

    }
}