package gof;
/*
Шаг 1) Определение компонентов системы:
Сначала определим компоненты, с которыми мы будем работать в нашей системе управления домашним кинотеатром:
        •	DVD-плеер
•	Проектор
•	Звуковая система
•	Экран
*/
//Шаг 2) Создание классов компонентов:
//Создадим классы для каждого компонента и определим их основные функции:
class DVDPlayer {
    public void on() {
        System.out.println("DVD Player включен");
    }

    public void playMovie(String movie) {
        System.out.println("Воспроизведение фильма: " + movie);
    }

    public void stop() {
        System.out.println("Остановка воспроизведения");
    }

    public void off() {
        System.out.println("DVD Player выключен");
    }
}

class Projector {
    public void on() {
        System.out.println("Проектор включен");
    }

    public void setInput() {
        System.out.println("Установка входного устройства: DVD Player");
    }

    public void setWideScreenMode() {
        System.out.println("Установка широкоэкранного режима");
    }

    public void off() {
        System.out.println("Проектор выключен");
    }
}

class SoundSystem {
    public void on() {
        System.out.println("Звуковая система включена");
    }

    public void setVolume(int volume) {
        System.out.println("Установка громкости: " + volume);
    }

    public void surroundSoundMode() {
        System.out.println("Установка режима объемного звука");
    }

    public void off() {
        System.out.println("Звуковая система выключена");
    }
}

class Screen {
    public void up() {
        System.out.println("Экран поднят");
    }

    public void down() {
        System.out.println("Экран опущен");
    }
}
//Шаг 3) Создание класса Фасада:
//Теперь создадим класс Фасада, который будет выступать в качестве унифицированного интерфейса для управления всеми компонентами:
class HomeTheaterFacade {
    private final DVDPlayer dvdPlayer;
    private final Projector projector;
    private final SoundSystem soundSystem;
    private final Screen screen;

    public HomeTheaterFacade(DVDPlayer dvdPlayer, Projector projector, SoundSystem soundSystem, Screen screen) {
        this.dvdPlayer = dvdPlayer;
        this.projector = projector;
        this.soundSystem = soundSystem;
        this.screen = screen;
    }

    public void watchMovie(String movie) {
        System.out.println("Подготовка к просмотру фильма...");
        screen.down();
        projector.on();
        projector.setInput();
        projector.setWideScreenMode();
        soundSystem.on();
        soundSystem.setVolume(10);
        soundSystem.surroundSoundMode();
        dvdPlayer.on();
        dvdPlayer.playMovie(movie);
    }

    public void endMovie() {
        System.out.println("Завершение просмотра фильма...");
        dvdPlayer.stop();
        dvdPlayer.off();
        soundSystem.off();
        projector.off();
        screen.up();
    }
}
//Шаг 4) Использование Фасада:
//Теперь клиентский код может использовать Фасад для управления системой домашнего кинотеатра:
public class FacadeMediaPlayer {
    public static void main(String[] args) {
        DVDPlayer dvdPlayer = new DVDPlayer();
        Projector projector = new Projector();
        SoundSystem soundSystem = new SoundSystem();
        Screen screen = new Screen();

        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(dvdPlayer, projector, soundSystem, screen);

        homeTheaterFacade.watchMovie("The Avengers");
        // Подготовка к просмотру фильма...
        // Экран опущен
        // Проектор включен
        // Установка входного устройства: DVD Player
        // Установка широкоэкранного режима
        // Звуковая система включена
        // Установка громкости: 10
        // Установка режима объемного звука
        // DVD Player включен
        // Воспроизведение фильма: The Avengers

        homeTheaterFacade.endMovie();
        // Завершение просмотра фильма...
        // Остановка воспроизведения
        // DVD Player выключен
        // Звуковая система выключена
        // Проектор выключен
        // Экран поднят
    }
}
