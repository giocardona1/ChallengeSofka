package com.mycompany.chellengesofka.controller;

import models.question;
import repository.gameRepository;

/**
 *
 * @author Gio
 */
public class gameController {
    
    public question getQuestion(int level){
        gameRepository gameC =  new gameRepository();
        question question = new question();
        question = gameC.getQuestion(level);
        
        return question;
    }
}
