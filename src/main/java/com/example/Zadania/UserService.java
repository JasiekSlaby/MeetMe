package com.example.Zadania;

public class UserService {

    DatabaseConnection databaseConnection;

    public UserService(){
        this.databaseConnection = new DatabaseConnection("name", "pass");
    }
    public void newEvent() {
        databaseConnection.addPost("title");
    }
}


