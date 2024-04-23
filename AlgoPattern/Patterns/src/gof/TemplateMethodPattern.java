package gof;
//Шаг 1) Определение базового абстрактного класса Game и абстрактных методов:
abstract class Game {
    public final void play() {
        initialize();
        startGame();
        endGame();
    }

    protected abstract void initialize();

    protected abstract void startGame();

    protected abstract void endGame();
}

//Шаг 2) Создание конкретного класса Football, расширяющего базовый класс:
class Football extends Game {
    protected void initialize() {
        System.out.println("Initializing football game...");
    }

    protected void startGame() {
        System.out.println("Starting football game...");
    }

    protected void endGame() {
        System.out.println("Ending football game...");
    }
}

//Шаг 3) Создание конкретного класса Cricket, расширяющего базовый класс:
class Cricket extends Game {
    protected void initialize() {
        System.out.println("Initializing cricket game...");
    }

    protected void startGame() {
        System.out.println("Starting cricket game...");
    }

    protected void endGame() {
        System.out.println("Ending cricket game...");
    }
}

//Шаг 4) Использование паттерна Шаблонный метод:
public class TemplateMethodPattern {
    public static void main(String[] args) {
        Game footballGame = new Football();
        footballGame.play();

        System.out.println();

        Game cricketGame = new Cricket();
        cricketGame.play();
    }
}
