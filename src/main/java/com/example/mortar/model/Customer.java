package com.example.mortar.model;

/**
 * Created by home on 14/6/14.
 */
public class Customer {
    public String accountNo;
    public String companyName;
    public String contactPerson;
    public String designation;
    public String mobile;
    public String phone;
    public String email;
    public String webSite;
    public String address;

    public Customer(
            String accountNo,
            String companyName,
            String contactPerson,
            String designation,
            String mobile,
            String phone,
            String email,
            String webSite,
            String address
    ) {
        this.accountNo = accountNo;
        this.companyName = companyName;
        this.contactPerson = contactPerson;
        this.designation = designation;
        this.mobile = mobile;
        this.phone = phone;
        this.email = email;
        this.webSite = webSite;
        this.address = address;
    }
}
