package factoryDocument;

public class SpreadsheetDocumentProcessor extends DocumentProcessor{
    public SpreadsheetDocumentProcessor(String documentName) {
        super(documentName);
    }

    @Override
    public DocumentType supportsType() {
        return DocumentType.SPREADSHEET;
    }

    @Override
    public void processDocument() {
        System.out.println("Processing spreadsheet document: " + documentName);
    }
}
