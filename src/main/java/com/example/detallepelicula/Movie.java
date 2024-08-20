package com.example.detallepelicula;

public class Movie {
    private int id;
    private String title;
    private int year;
    private String director;
    private String gender;
    private String synopsis;

    public Movie(int id, String title, int year, String director, String gender, String synopsis){
        this.id = id;
        this.title = title;
        this.year = year;
        this.director = director;
        this.gender = gender;
        this.synopsis = synopsis;
    }

    public int getId(){
        return id;
    }

    public String getTitle(){
        return title;
    }

    public int getYear(){
        return year;
    }

    public String getDirector(){
        return director;
    }

    public String getGender(){
        return gender;
    }

    public String getSynopsis(){
        return synopsis;
    }
}
