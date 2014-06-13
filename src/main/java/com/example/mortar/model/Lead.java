package com.example.mortar.model;

/**
 * Created by Ganesan_Gurumurthy on 6/13/2014.
 */
public class Lead {
    private String id;
    private String name;
    private String telNo;
    private String address;

    public Lead(
            String id,
            String name,
            String telNo,
            String address
    ) {
        this.id = id;
        this.name = name;
        this.telNo = telNo;
        this.address = address;
    }

    @Override public String toString() {
        return "ID: " + id + "\n"
                + "Name: " + name + "\n"
                + "Tel No: " + telNo + "\n"
                + "Address : " + address;
    }
}
