/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bk.game.command;

import com.bk.game.entity.Player;
import java.util.Scanner;

/**
 *
 * @author bikeshkawan
 * to design all the game command
 */
public abstract class GameCommand {
    
    
    protected Scanner input;
    public GameCommand(Scanner input){
        this.input = input;
    }
    
    /**
     * 
     * @param player need player to execute but don't know what to execute
     * @param param store a collection of commands and works accordingly 
     * something picking or dropped  or walk left right
     * need to execute all the game command but don't know so will create sub-commands like walk, run etc
     */
    
    public abstract void execute(Player player, String[] param);
    public abstract void pause(String string);
    
}