package com.rociojorge.parkingmanagerDemo.user;

import java.util.List;

public class UserRepository {


    public List<User> getAll(){

        //TODO : Eliminar este codigo
        ArrayList<User> users = new ArrayList<>();
        users.add(new User(nombre: "rocio", email: "prueba@gmail.com"));
        return users;

    }

}
