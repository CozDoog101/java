package dependencyinjection;

public class Main {
    public static void main(String[] args) {
        Logger consoleLogger = new ConsoleLogger();
        OrderService consoleOrderService = new OrderService(consoleLogger);
        consoleOrderService.createOrder("Laptop");

        Logger fileLogger = new FileLogger();
        OrderService fileOrderService = new OrderService(fileLogger);
        fileOrderService.createOrder("Keyboard");
    }
}
