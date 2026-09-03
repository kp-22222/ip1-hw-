public class noventa_y_nueve_99 {
    interface Serializable {}  // empty marker interface

    static class Document implements Serializable {
        String content = "Some document content";
    }

    public static void main(String[] args) {
        Document d = new Document();
        if (d instanceof Serializable) {
            System.out.println("Document can be serialized (marked by Serializable interface)");
        }
    }
}
