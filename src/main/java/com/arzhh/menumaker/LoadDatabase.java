package com.arzhh.menumaker;

import com.arzhh.menumaker.model.Menu;
import com.arzhh.menumaker.repository.MenuRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(MenuRepository repository) {

        return args -> {
            log.info("Preloading " + repository.save(new Menu("Haricot verts", true)));
            log.info("Preloading " + repository.save(new Menu("Samusa", "Reset 1", 3, false)));
        };
    }
}