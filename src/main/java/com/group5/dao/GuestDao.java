package com.group5.dao;



import com.group5.model.Guest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuestDao {
    Map<Integer, Guest> guestDb = new HashMap<Integer, Guest>();
    //Crud manipulation
    // create
    public void addGuest(Guest guest){
        guestDb.put(genId(),guest);
    }
    //read
    public Guest getGuest(Integer id){
        return guestDb.get(id);
    }

    // read All
    public List<Guest> getAllGuest(){
        return (List<Guest>) guestDb.values();
    }
    //update
    public void updateGuest( Guest guest){
        guestDb.put(guest.getId(),guest);
        }
        // getById
    public Guest getGuestById(Integer id){
        return guestDb.get(id);
    }

    public Integer genId() {
        return guestDb.size()+1;
    }



}
