/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bk.game.command;

import java.util.Scanner;

/**
 *
 * @author bikeshkawan
 *
 * is a container class for all the game command
 */
public class GameCommandFactory {

    /**
     *
     * @param cmd - command to be entered
     * @return GameCommand like RunCommand() and
     */
    public static GameCommand get(String cmd, Scanner input) {
//        if (cmd == null) {
//            return null;
////        }
//        if (cmd == "walk") {
//            return new WalkCommand();
//            //return "Walking";
//        }
        if (cmd.equalsIgnoreCase("Walk")) {
            return new WalkCommand(input);
        }else if (cmd.equalsIgnoreCase("drop")){
            return new DropCommand(input);
        }
        else if (cmd.equalsIgnoreCase("Run")){
            return new RunCommand(input);
        }
        else if (cmd.equalsIgnoreCase("pick")){
            return new PickCommand(input);
        }else if (cmd.equalsIgnoreCase("exit")){
            return new ExitCommand(input);
            
        }else if (cmd.equalsIgnoreCase("R")){
            return new RestartCommand(input);
        }
        return null;
    }

    public static String addCommand(String st) {
        //System.out.println("");
        return st;

    }
}
