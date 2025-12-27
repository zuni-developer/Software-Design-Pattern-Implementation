public class ClientApp {
    public static void main(String[] args) {
        DotMatrixPrinter oldPrinter = new DotMatrixPrinter();
        Printer printer = new DotMatrixAdapter(oldPrinter);
        printer.print("Hello, this is an adapter pattern demo!");
    }
}
