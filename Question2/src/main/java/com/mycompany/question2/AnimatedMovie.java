/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.question2;


public class AnimatedMovie extends Movies {
 private String studio;   

    public AnimatedMovie(String title, int year, String studio) {
        super(title, year);
        this.studio = studio;
    }

    public String getStudio() {
        return studio;
    }
 @Override
 public String getDetails(){
     return (super.getDetails() + ", Studio: " + studio);
 }
}
