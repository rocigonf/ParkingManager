package com.rociojorge.parkingmanagerDemo.user;
public class User {
    
    //private long id;
    private String email;
    private String nombre;

    public User(String email, String nombre) {
        this.email = email;
        this.nombre = nombre;
    }

    public String getEmail() {
        return this.email;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
