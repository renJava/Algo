package fundamental.interface_simple;

// Определение интерфейса
interface Printable {
    void print();
}

// Класс, реализующий интерфейс
class Document implements Printable {
    private final String content;

    public Document(String content) {
        this.content = content;
    }

    @Override
    public void print() {
        System.out.println(content);
    }
}

// Класс, использующий интерфейс
class Interface4Print {
    public void printDocument(Printable document) {
        document.print();
    }
}

// Главный класс
class Main {
    public static void main(String[] args) {
        Document document = new Document("This is a document.");

        Interface4Print printer = new Interface4Print();
        printer.printDocument(document);
    }
}