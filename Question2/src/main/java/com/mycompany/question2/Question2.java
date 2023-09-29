/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.question2;

/**
 *
 * @author lab_services_student
 */
public class Question2 {

    public static void main(String[] args) {
        Movies[] movies = new Movies[3];
        movies[0] = new ActionMovie("Doctor Strange And The Multiverse of Madness", 2022,"Sam Raimi");
        movies[1] = new AnimatedMovie("Entergalactic",2023,"DNEG Animation");
        movies[2] = new ActionMovie("El Camino",2019, "Vince Gilligan");
        movies[3] = new AnimatedMovie("Injustice", 2021,"Warner Bros. Animation");
        
        generateMovieReport(movies);
    }
    
    public static void generateMovieReport(Movies[] movies){
        System.out.println("Movies Report");
        System.out.println("--------------");

        for (Movies movie : movies){
            System.out.println("Title: " +movie.getTitle());
            System.out.println("Year: " + movie.getYear());
            
            if(movie instanceof ActionMovie){
                ActionMovie actionmovie = (ActionMovie) movie;
                System.out.println("Director: " + actionmovie.getDirector());
            }else if(movie instanceof AnimatedMovie){
                AnimatedMovie animatedmovie =(AnimatedMovie) movie;
                System.out.println("Studio: " + animatedmovie.getStudio());
            }
            System.out.println();
        }
        }
        
    }

