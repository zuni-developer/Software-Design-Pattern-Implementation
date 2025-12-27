public class DotMatrixAdapter implements Printer {

    private DotMatrixPrinter legacyPrinter;
    public DotMatrixAdapter(DotMatrixPrinter legacyPrinter) {
        this.legacyPrinter = legacyPrinter;
    }
    @Override
    public void print(String text) {
        legacyPrinter.oldPrint(text);
    }
}
