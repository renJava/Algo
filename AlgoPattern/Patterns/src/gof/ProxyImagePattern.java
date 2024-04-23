package gof;

interface Image {
    void display();
}


//Шаг 2) Создание класса RealImage, реализующего интерфейс Image:
class RealImage implements Image {
    private final String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.println("Loading image: " + filename);
    }

    public void display() {
        System.out.println("Displaying image: " + filename);
    }
}

//Шаг 3) Создание класса ProxyImage, реализующего интерфейс Image:
class ProxyImage implements Image {
    private final String filename;
    private RealImage realImage;

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    // Загрузка (создание) только после проверки (ленивая)
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(filename);
        }
        realImage.display();
    }
}

//Шаг 4) Использование паттерна прокси:
class MainProxy {
    public static void main(String[] args) {
        Image image = new ProxyImage("image.jpg");

        // При первом вызове метода display() объект RealImage создается и загружается с диска
        image.display();

        // При последующих вызовах метода display() объект RealImage уже создан и загружен,
        // поэтому он будет использоваться повторно без загрузки с диска
        image.display();
    }
}
