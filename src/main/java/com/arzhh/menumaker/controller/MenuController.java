package com.arzhh.menumaker.controller;


import com.arzhh.menumaker.model.Menu;
import com.arzhh.menumaker.repository.MenuRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;

@RestController
@Slf4j
public class MenuController {

    private final MenuRepository menuRepository;

    public MenuController(MenuRepository menuRepository) {
        this.menuRepository = menuRepository;
    }

    @GetMapping("/all")
    List<Menu> all() {
        return menuRepository.findAll();
    }

    @GetMapping("/pick")
    Menu oneOfAll() {
        long count = menuRepository.count();
        Random random = new Random();
        long randNumber = random.nextLong(count)+1l;
        Menu menu = menuRepository.findById(randNumber).get();
        log.debug(menu.toString());
        menu.setAlreadySeen(true);
        menuRepository.flush();
        return menu;
    }

    @PostMapping("/reset")
    void reset() {
        List<Menu> all = menuRepository.findAll();
        all.forEach(Menu::reset);
        menuRepository.flush();
    }

    @PostMapping("/menu")
    Menu newEmployee(@RequestBody Menu newMenu) {
        return menuRepository.save(newMenu);
    }
}
