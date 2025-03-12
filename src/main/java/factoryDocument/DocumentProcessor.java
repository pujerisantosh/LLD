package factoryDocument;

public abstract class DocumentProcessor {

    protected String documentName;

    public DocumentProcessor(String documentName) {
        this.documentName = documentName;
    }

    public abstract DocumentType supportsType();
    public abstract void processDocument();
}
