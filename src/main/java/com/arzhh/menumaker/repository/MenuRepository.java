package com.arzhh.menumaker.repository;

import com.arzhh.menumaker.model.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuRepository extends JpaRepository<Menu, Long> {

}
