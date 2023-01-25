package com.rociojorge.parkingmanagerDemo.user;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    private ArrayList<User> user;
    public UserRepository() {
        user = new ArrayList<>();
    }

    public List<User> getAll() {
        
        this.user.clear();
        this.user.add(new User(null, null, null, null));
        this.user.add(new User(null, null, null, null));
        this.user.add(new User(null, null, null, null));
        return this.user;

    }
    
}
