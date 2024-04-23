package gof;
// Шаг 1: Определение базового интерфейса для разработчика
interface Developer {
    void writeCode();
}

// Шаг 2: Создание базового класса разработчика
class BaseDeveloper implements Developer {
    public void writeCode() {
        System.out.println("Developer is writing code...");
    }
}

// Шаг 3: Создание декоратора для сеньора разработчика
class SeniorDeveloperDecorator implements Developer {
    private final Developer developer;

    public SeniorDeveloperDecorator(Developer developer) {
        this.developer = developer;
    }

    public void writeCode() {
        developer.writeCode();
        System.out.println("Senior developer is reviewing code...");
    }
}

// Шаг 4: Создание декоратора для тимлида
class TeamLeadDecorator implements Developer {
    private final Developer developer;

    public TeamLeadDecorator(Developer developer) {
        this.developer = developer;
    }

    public void writeCode() {
        developer.writeCode();
        System.out.println("Team lead is providing guidance and support...");
    }
}

// Шаг 5: Использование декораторов
class DecoratorDev {
    public static void main(String[] args) {
        Developer developer = new BaseDeveloper();
        developer.writeCode();

        Developer seniorDeveloper = new SeniorDeveloperDecorator(new BaseDeveloper());
        seniorDeveloper.writeCode();

        Developer teamLead = new TeamLeadDecorator(new SeniorDeveloperDecorator(new BaseDeveloper()));
        teamLead.writeCode();
    }
}

