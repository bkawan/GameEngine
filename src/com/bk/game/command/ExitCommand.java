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
public class ExitCommand extends GameCommand {

    public ExitCommand(Scanner input) {
        super(input);
    }

    @Override
    public void execute(Player player, String[] param) {
        System.out.println("Do you really want to quit[Y/N]?");
        if (input.next().equalsIgnoreCase("Y")) {

            System.out.println("Closing Game Application Please Wait....");
            System.out.println("Application Closed");
            System.out.println("Quit from system, Press: Q");
            System.out.println("Restart the Game Press:R");
            if (input.next().equalsIgnoreCase("q")) {
                System.out.println("You have exit the system");
                System.exit(0);
                
            }
            

        }

    }

    @Override
    public void pause(String string) {
    }

}
