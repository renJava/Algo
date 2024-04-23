package gof;

// Пример класса, объекты которого мы будем создавать с помощью паттерна строителя.
record Builder(String name, String description, double price) {
}

// Базовый интерфейс для строителя.
interface ProductBuilder {
    ProductBuilder setName(String name);
    ProductBuilder setDescription(String description);
    ProductBuilder setPrice(double price);
    Builder build();
}

// Конкретная реализация строителя.
class ConcreteProductBuilder implements ProductBuilder {
    private String name;
    private String description;
    private double price;

    @Override
    public ProductBuilder setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public ProductBuilder setDescription(String description) {
        this.description = description;
        return this;
    }

    @Override
    public ProductBuilder setPrice(double price) {
        this.price = price;
        return this;
    }

    @Override
    public Builder build() {
        return new Builder(name, description, price);
    }
}

// Пример использования паттерна строителя.
class BuilderExample {
    public static void main(String[] args) {
        // Создаем объект строителя
        ProductBuilder builder = new ConcreteProductBuilder();

        // Настраиваем объект с помощью строителя
        Builder product = builder
                .setName("Название товара")
                .setDescription("Описание товара")
                .setPrice(9.99)
                .build();

        // Используем созданный объект
        System.out.println(product.name());
        System.out.println(product.description());
        System.out.println(product.price());
    }
}