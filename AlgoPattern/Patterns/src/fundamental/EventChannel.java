package fundamental;

import java.util.Observable;
import java.util.Observer;

// Класс, который отправляет события
class EventSource extends Observable {
    public void fireEvent(String event) {
        setChanged();
        notifyObservers(event);
    }
}

// Класс, который принимает и обрабатывает события
class EventReceiver implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof String) {
            String event = (String) arg;
            System.out.println("Received event: " + event);
            // Обработка события
        }
    }
}

public class EventChannel {
    public static void main(String[] args) {
        EventSource eventSource = new EventSource();
        EventReceiver eventReceiver = new EventReceiver();

        eventSource.addObserver(eventReceiver);

        eventSource.fireEvent("Event 1");
        eventSource.fireEvent("Event 2");
    }
}