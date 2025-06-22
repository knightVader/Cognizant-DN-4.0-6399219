public class FactoryMethodDemo {
    public static void main(String[] args) {
        // Create documents using different factories
        DocumentFactory wordFactory = new WordDocumentFactory();
        DocumentFactory pdfFactory = new PdfDocumentFactory();
        DocumentFactory excelFactory = new ExcelDocumentFactory();

        // Create and use Word document
        Document wordDoc = wordFactory.getDocument();
        wordDoc.open();
        wordDoc.save();

        System.out.println("\n------------------------\n");

        // Create and use PDF document
        Document pdfDoc = pdfFactory.getDocument();
        pdfDoc.open();
        pdfDoc.save();

        System.out.println("\n------------------------\n");

        // Create and use Excel document
        Document excelDoc = excelFactory.getDocument();
        excelDoc.open();
        excelDoc.save();
    }
}
