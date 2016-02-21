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
public class DropCommand extends GameCommand {

    public DropCommand(Scanner input) {
        super(input);
    }

    @Override

    public void execute(Player player, String[] param) {
        if (param.length == 1) {
            System.out.println(player.getName() + " has dropped " );
        } else if (param.length>=1){
                        System.out.println(player.getName() + " has dropped " + param[1]);

        }
    }

    @Override
    public void pause(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
