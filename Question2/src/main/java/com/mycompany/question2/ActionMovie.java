/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.question2;

//child class
public class ActionMovie extends Movies{
   private String director;

    public ActionMovie(String title, int year, String director) {
        super(title, year);
        this.director = director;
    }

    public String getDirector() {
        return director;
    }
    
 
   @Override
    public String getDetails(){
   return (super.getDetails() +  ", Director: " + director);


    }
}
