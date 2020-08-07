package com.kforce.kcode.domain;

import javax.persistence.*;

@Entity
public class MonthlyReward {

    public String getiD () {
        return iD;
    }


    public void setiD ( String iD ) {
        this.iD = iD;
    }

    @Id
    //Using an Identity GeneratedType will create a transitory ID, not permanent.
    //@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "id")
    //@SequenceGenerator(name = "id", sequenceName = "id")
    @Column(name = "ID")
    private String iD;

    @Column(name = "Date")
    private String yearMo;

    @Column(name = "Name")
    private String name;

    @Column(name = "Points")
    private double points;


    public String getName () {
        return name;
    }

    public void setName ( String name ) {
        this.name = name;
    }

    public String getYearMo () {
        return yearMo;
    }

    public void setYearMo ( String yearMo ) {
        this.yearMo = yearMo;
    }

    public double getPoints () {
        return points;
    }

    public void setPoints ( double points ) {
        this.points = points;
    }

}
