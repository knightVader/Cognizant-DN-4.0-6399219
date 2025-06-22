public class WordDocument implements Document {
    @Override
    public void create() {
        System.out.println("Creating Word Document");
    }

    @Override
    public void open() {
        System.out.println("Opening Word Document");
    }

    @Override
    public void save() {
        System.out.println("Saving Word Document");
    }
}
