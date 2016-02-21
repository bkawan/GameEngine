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
 */
public class WalkCommand extends GameCommand {

    public WalkCommand(Scanner input) {
        super(input);
    }

    @Override
    public void execute(Player player, String[] param) {
        if(param.length == 1){
            System.out.println(player.getName() + " is simply walking.");
        }else if (param.length >=1)
        System.out.println(player.getName()+ " is Walking " + param[1]);
    }
    
    
    @Override
    public void pause(String string) {
        System.out.println("Game is" + string);
    }
}
