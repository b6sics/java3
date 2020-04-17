/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg09nobel;

/**
 *
 * @author b6dmin
 */
public class Noble {

    private int year;
    private String type;
    private String firstname;
    private String lastname;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Noble(int year, String type, String firstname, String lastname) {
        this.year = year;
        this.type = type;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return year + ": " + firstname + " " + lastname;
    }
}
