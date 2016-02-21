/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bk.game.entity;

/**
 *
 * @author bikeshkawan
 */
public class Player {
    private String name;
    
    /**
     * Default Constructor
     */
    public Player(){
        
    
}
    /**
     * 
     * @param name 
     */
    public Player(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
}