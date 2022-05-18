package com.example.Zadania;

public class DatabaseConnection {
    private String username;
    private String password;

    public DatabaseConnection(String username, String password){
        this.username = username;
        this.password = password;
    }

    public void addPost(String title){
        System.out.println("Done! Your event: "+ title);
    }
}
