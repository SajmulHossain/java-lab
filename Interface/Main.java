package Interface;

interface Printable {
    void print();

    default void displayDetails() {
        System.out.println("No specific details to display.");
    }

    static void printTimestamp() {
        System.out.println("Printed at: " + java.time.LocalDateTime.now());
    }
}

class Document implements Printable {
    private String title;
    private String content;

    public Document(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public void print() {
        System.out.println("--- Document ---");
        System.out.println("Title: " + title);
        System.out.println("Content: " + content);
    }

    public void displayDetails() {
        System.out.println("Document Title: " + title);
        System.out.println("Number of characters: " + content.length());
    }
}

class Image implements Printable {
    private String filename;
    private int width;
    private int height;

    public Image(String filename, int width, int height) {
        this.filename = filename;
        this.width = width;
        this.height = height;
    }

    public void print() {
        System.out.println("--- Image ---");
        System.out.println("Filename: " + filename);
        System.out.println("Dimensions: " + width + "x" + height);
    }
}

public class Main {
    public static void main(String[] args) {
        Document myDocument = new Document("My Report", "This is the content of my report.");
        Image myImage = new Image("photo.jpg", 800, 600);

        Printable printableDocument = myDocument;
        Printable printableImage = myImage;
        System.out.println("--- Printing Printable Objects ---");
        printableDocument.print();
        printableImage.print();
        System.out.println("\n--- Calling default methods ---");
        printableDocument.displayDetails();
        printableImage.displayDetails();
        System.out.println("\n--- Calling static method of the interface ---");
        Printable.printTimestamp();
    }
}
