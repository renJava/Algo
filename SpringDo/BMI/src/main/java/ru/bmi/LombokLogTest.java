package ru.bmi;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class LombokLogTest implements CommandLineRunner {
    @Override
    public void run(String... args) {
        log.info("✅ Lombok logging is working!");
    }
}