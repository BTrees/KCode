package com.kforce.kcode.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import java.sql.Timestamp;


/**
 *
 * @author Bill Woods
 * @date 07-26-20
 *
 * CustomerTrans domain entity for the MonthlyRewards application.
 * Ideally the customer information and transaction would be
 * separated into their own entities and tables. This is just
 * a simplified demonstration entity in this example
 *
 */

@Entity
public class CustomerTrans {

@Id
@GeneratedValue(strategy = GenerationType.AUTO )
private long id;
private String firstName, lastName;
private String midInitial = "";
private Timestamp transactionDate;
private double transactionAmount;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
     public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMidInitial () {
        return midInitial;
    }

    public void setMidInitial ( String midInitial ) {
        this.midInitial = midInitial;
    }

    public Timestamp getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Timestamp transactionDate) {
        this.transactionDate = transactionDate;
    }

    public double getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(double transactionAmount) {
        this.transactionAmount = transactionAmount;
    }


    public CustomerTrans () {}

    public CustomerTrans ( String firstName, String midInitial, String lastName,
                           Timestamp transactionDate, double transactionAmount) {

    this.firstName = firstName;
    this.midInitial = midInitial;
    this.lastName = lastName;
    this.transactionDate = transactionDate;
    this.transactionAmount = transactionAmount;
    }


}
