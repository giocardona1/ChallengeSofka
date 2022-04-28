/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author Gio
 */
public class answer {
    
    public int id;
    public question idQuestion;
    public String description;
    public boolean isTrue;

    public answer(int id, question idQuestion, String description, boolean isTrue) {
        this.id = id;
        this.idQuestion = idQuestion;
        this.description = description;
        this.isTrue = isTrue;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public question getIdQuestion() {
        return idQuestion;
    }

    public void setIdQuestion(question idQuestion) {
        this.idQuestion = idQuestion;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isIsTrue() {
        return isTrue;
    }

    public void setIsTrue(boolean isTrue) {
        this.isTrue = isTrue;
    }
    
    
    
}
