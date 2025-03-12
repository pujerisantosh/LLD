package factoryDocument;

public class DocumentProcessorTest  {

    public static void main(String[] args) {
        DocumentProcessor textProcessor = DocumentProcessorFactory.createDocumentProcessor(DocumentType.TEXT, "MyTextFile.txt");
        textProcessor.processDocument();

        DocumentProcessor spreadsheetProcessor = DocumentProcessorFactory.createDocumentProcessor(DocumentType.SPREADSHEET, "MySheet.xls");
        spreadsheetProcessor.processDocument();

        DocumentProcessor presentationProcessor = DocumentProcessorFactory.createDocumentProcessor(DocumentType.PRESENTATION, "MyPresentation.ppt");
        presentationProcessor.processDocument();
    }

}
