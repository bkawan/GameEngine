/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bk.game;

import com.bk.game.command.ExitCommand;
import com.bk.game.command.GameCommand;
import com.bk.game.command.GameCommandFactory;
import com.bk.game.command.RestartCommand;
import com.bk.game.command.RunCommand;
import com.bk.game.command.WalkCommand;
import com.bk.game.entity.Player;
import java.util.Scanner;

/**
 *
 * @author bikeshkawan
 */
public class Engine {

    public Engine(){
        
        String[] args = new String[0];
        main(args);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
//        GameCommandFactory g = new GameCommandFactory();
//        g.get("walk").pause(" paused");
//        
//       //String s = g.get("walk");
//        //System.out.println(s);
//        g.get("walk").execute("ds");
        
        System.out.println("===============================================");
        System.out.println("   || Welcome to Text Based Game Engine || ");
        System.out.println("===============================================");
        
        Scanner input = new Scanner(System.in);
        
        //need player
        Player player = new Player();
        System.out.print("Enter the Name of Character: ");
        player.setName(input.next());
        
        System.out.println("Your Character " + player.getName()+ " is ready.....");
        
        // will run until player exit
        while(true){
            System.out.println("Enter Command :>");
            
            /**
             *  input.nextline() will  stored all the words  in single line with space
             * like : walk run play etc it is a single string 
             * we can break by putting in collection by splitting each word with space 
             * and put them in collection as below
             * like String[] command = command.split(" ");
             * now all each word  behave as single string
             * String[] command = {"walk", "play", "run"}
             */
            String params = input.nextLine();
            String[] commands = params.split(" ");
            /**
             * Accessing get() method into GameCommandFactory 
             * to get command which is GameCommand Type and 
             * store that command in gameCommand variable
             * will return the type of game command eg  if command is walk
             * type WalkCommand is returned.
             */
            GameCommand gameCommand = GameCommandFactory.get(commands[0], input);
           // GameCommand gc1 = new WalkCommand();
           
//           String[] params = command.split(" ");
           
           //GameCommand gameCommand1 = GameCommandFactory.addCommand("play");
           if(gameCommand == null){
               System.out.println("Invalid Command");
           }else {
               
            
               gameCommand.execute(player, commands);
               
           }
           
        }
    }
    
 
}
