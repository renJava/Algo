package gof;

// Интерфейс для работы с аудиофайлами в формате MP3
interface Mp3Audio {
    void playMp3();
}

/*
// Класс, реализующий работу с аудиофайлами в формате MP3
class Mp3AudioPlayer implements Mp3Audio {
    @Override
    public void playMp3() {
        System.out.println("Playing MP3 audio до конвертации...");
    }
}
*/

// Класс, предоставляющий интерфейс для работы с аудиофайлами в формате WAV
class WavAudioPlayer {
    void playWav() {
        System.out.println("Playing WAV audio до конвертации...");
    }
}

// Адаптер для преобразования аудиофайлов в формате WAV в MP3
class WavToMp3Adapter implements Mp3Audio {
    private final WavAudioPlayer wavAudioPlayer;

    public WavToMp3Adapter(WavAudioPlayer wavAudioPlayer) {
        wavAudioPlayer.playWav();
        this.wavAudioPlayer = wavAudioPlayer;
        System.out.println("Converting WAV audio to MP3...");
//        System.out.println("Playing MP3 audio после конвертации...");
    }

    @Override
    public void playMp3() {
        // Внутри адаптера вызываем методы класса WavAudioPlayer
        wavAudioPlayer.playWav();
        System.out.println("Playing MP3 audio после конвертации...");
    }
}

class AdapterExample {
    public static void main(String[] args) {
        // Создаем экземпляр аудиоплеера в формате WAV
        WavAudioPlayer wavAudioPlayer = new WavAudioPlayer();

        // Создаем адаптер, преобразующий WAV в MP3
        Mp3Audio mp3AudioPlayer = new WavToMp3Adapter(wavAudioPlayer);
//        wavAudioPlayer.playWav();

        // Воспроизводим аудиофайл в формате MP3
        mp3AudioPlayer.playMp3();
    }
}
