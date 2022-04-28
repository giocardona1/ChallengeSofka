package repository;

import models.question;

/**
 *
 * @author Gio
 */
public class gameRepository {
    
    public question getQuestion(int level){
        question question = new question();
        
        switch(level){
            case 1:
                question.description.add("¿Qué jugardor ha ganado más mundiales?,Maradona,Messi,Platini,Pelé");
                question.description.add("¿Qué equipo ha ganada más Champions League?,Inter,Milan,Barca,Real Madrid");
                question.description.add("¿Hola Frailejón?,Maradona,Messi,Platini,Pelé");
                question.description.add("¿Ernersto Perez?,Maradona,Messi,Platini,Pelé");
                question.description.add("¿Futbol?,Maradona,Messi,Platini,Pelé");
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
        }
                
        return question;
    }
}
