package com.mycompany.chellengesofka.controller;

import models.question;
import repository.configureGameRepository;

/**
 *
 * @author Gio
 */
public class configureGameController {
    
    public boolean saveConfigureGame(question question){
        configureGameRepository config = new configureGameRepository();
        return true;
    }
    
}
