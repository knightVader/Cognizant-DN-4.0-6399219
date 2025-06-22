public abstract class DocumentFactory {
    public abstract Document createDocument();

    // Template method that uses the factory method
    public final Document getDocument() {
        Document document = createDocument();
        document.create();
        return document;
    }
}
