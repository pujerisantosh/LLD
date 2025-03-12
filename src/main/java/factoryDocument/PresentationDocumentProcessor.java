package factoryDocument;

public class PresentationDocumentProcessor extends DocumentProcessor{
    public PresentationDocumentProcessor(String documentName) {
        super(documentName);
    }

    @Override
    public DocumentType supportsType() {
        return DocumentType.PRESENTATION;
    }

    @Override
    public void processDocument() {
        System.out.println("Processing presentation document: " + documentName);
    }
}
