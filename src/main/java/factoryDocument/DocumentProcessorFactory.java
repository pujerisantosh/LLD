package factoryDocument;

public class DocumentProcessorFactory {
    public static DocumentProcessor createDocumentProcessor(DocumentType type, String documentName) {
        switch (type) {
            case TEXT:
                return new TextDocumentProcessor(documentName);
            case SPREADSHEET:
                return new SpreadsheetDocumentProcessor(documentName);
            case PRESENTATION:
                return new PresentationDocumentProcessor(documentName);
            default:
                throw new IllegalArgumentException("Invalid document type");
        }
    }

}
