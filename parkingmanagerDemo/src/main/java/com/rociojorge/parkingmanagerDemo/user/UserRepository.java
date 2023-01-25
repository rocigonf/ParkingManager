package com.rociojorge.parkingmanagerDemo.user;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    private ArrayList<User> user;
    public UserRepository() {
        user = new ArrayList<>();
    }

    public List<User> getAll() {
        //TODO : Eliminar este codigo
        this.user.clear();
        this.user.add(new User("prueba@gmail.com", "Rocio"));
        this.user.add(new User("pruebaJorge@gmail.com", "Jorge"));
        return this.user;

    }

}
