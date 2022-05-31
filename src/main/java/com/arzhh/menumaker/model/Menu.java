package com.arzhh.menumaker.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column
    private String content;
    @Column
    private String book;
    @Column
    private int page;
    @Column
    private boolean evening;
    @Column
    private boolean alreadySeen;

    public Menu(String content, String book, int page, boolean evening) {
        this.content = content;
        this.book = book;
        this.page = page;
        this.evening = evening;
        this.alreadySeen = false;
    }

    public Menu(String content, boolean evening) {
        this.content = content;
        this.evening = evening;
        this.alreadySeen = false;
    }

    public Menu() {
    }

    public void reset(){
        alreadySeen = false;
    }

}
