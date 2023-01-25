package com.rociojorge.parkingmanagerDemo.user;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    private ArrayList<User> usuarios;
    public UserRepository() {
        usuarios = new ArrayList<>();
    }

    public List<User> getAll() {
        //TODO : Eliminar este codigo
        this.usuarios.clear();
        this.usuarios.add(new User("prueba@gmail.com", "Rocio"));
        this.usuarios.add(new User("pruebaJorge@gmail.com", "Jorge"));
        return usuarios;

    }

}
