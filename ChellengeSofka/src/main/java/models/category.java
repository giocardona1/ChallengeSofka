/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import models.enums.level;

/**
 *
 * @author Gio
 */
public class category {
    
    public int id;
    public level level;
    public int valor;

    public category(int id, level level, int valor) {
        this.id = id;
        this.level = level;
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public level getLevel() {
        return level;
    }

    public void setLevel(level level) {
        this.level = level;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
     
}
