package classes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author t1
 */
public class Alkalmazott {

    private int fizetes;
    private String nev;

    public int getFizetes() {
        return fizetes;
    }

    public String getNev() {
        return nev;
    }

//    public void setNev(String nev) {
//        this.nev = nev;
//    }
//
//    public void setFizetes(int fizetes) {
//        this.fizetes = fizetes;
//    }
//
    public Alkalmazott(String nev, int fizetes) {
        this.fizetes = fizetes;
        this.nev = nev;
    }

    public void novel(int nov) {
        fizetes += nov;
    }

    public String adatok() {
        return nev + ": " + fizetes;
    }
}
