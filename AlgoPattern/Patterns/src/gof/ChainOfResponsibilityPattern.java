package gof;
//Шаг 1) Определение базового класса AbstractLogger:
abstract class AbstractLogger {
    public static final int INFO = 1;
    public static final int WARNING = 2;
    public static final int ERROR = 3;

    protected int level;
    protected AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void logMessage(int level, String message) {
        if (this.level <= level) {
            writeMessage(message);
        }
        if (nextLogger != null) {
            nextLogger.logMessage(level, message);
        }
    }

    protected abstract void writeMessage(String message);
}

//Шаг 2) Создание конкретных классов, расширяющих AbstractLogger:
class InfoLogger extends AbstractLogger {
    public InfoLogger() {
        this.level = INFO;
    }

    protected void writeMessage(String message) {
        System.out.println("Info Logger: " + message);
    }
}

class WarningLogger extends AbstractLogger {
    public WarningLogger() {
        this.level = WARNING;
    }

    protected void writeMessage(String message) {
        System.out.println("Warning Logger: " + message);
    }
}

class ErrorLogger extends AbstractLogger {
    public ErrorLogger() {
        this.level = ERROR;
    }

    protected void writeMessage(String message) {
        System.out.println("Error Logger: " + message);
    }
}

//Шаг 3) Использование паттерна Цепочка обязанностей main:
public class ChainOfResponsibilityPattern {
    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLoggers();

        loggerChain.logMessage(AbstractLogger.INFO, "This is an information.");
        System.out.println();

        loggerChain.logMessage(AbstractLogger.WARNING, "This is a warning.");
        System.out.println();

        loggerChain.logMessage(AbstractLogger.ERROR, "This is an error.");
    }

    static AbstractLogger getChainOfLoggers() {
        AbstractLogger infoLogger = new InfoLogger();
        AbstractLogger warningLogger = new WarningLogger();
        AbstractLogger errorLogger = new ErrorLogger();

        infoLogger.setNextLogger(warningLogger);
        warningLogger.setNextLogger(errorLogger);

        return infoLogger;
    }
}
