/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bk.game.command;

import com.bk.game.Engine;
import com.bk.game.entity.Player;
import java.util.Scanner;

/**
 *
 * @author bikeshkawan
 */
public class RestartCommand extends GameCommand{

    public RestartCommand(Scanner input) {
        super(input);
    }

    @Override
    public void execute(Player player, String[] param) {
        
        if(input.next().equalsIgnoreCase("R")){
            System.out.println("Game has been restarted");
             Engine e = new Engine();
        }
       
        
    }

    @Override
    public void pause(String string) {
    }
    
}
