/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gio
 */
public class question {
    
    public int id;
    public int idCategory;
    public List<String> description;
    public String question;

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public question(int id, int idCategory, List<String> description) {
        this.id = id;
        this.idCategory = idCategory;
        this.description = description;
    }

    public question() {
        this.description = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(int idCategory) {
        this.idCategory = idCategory;
    }

    public List getDescription() {
        return description;
    }

    public void setDescription(List<String> description) {
        this.description = description;
    }
}
