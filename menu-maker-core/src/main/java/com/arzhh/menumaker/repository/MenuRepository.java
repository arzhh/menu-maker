package com.arzhh.menumaker.repository;

import com.arzhh.menumaker.model.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MenuRepository extends JpaRepository<Menu, Long> {

    List<Menu> findByAlreadySeen(boolean value);
    List<Menu> findByEveningAndAlreadySeen(boolean eveningValue, boolean alreadySeenValue);
}
