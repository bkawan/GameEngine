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
public class RunCommand extends GameCommand {

    public RunCommand(Scanner input) {
        super(input);
    }

    @Override
    public void execute(Player player, String param[]) {
        System.out.println(player.getName()+ " is Running");
    }

    @Override
    public void pause(String string) {
    }
    
}
