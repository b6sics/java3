/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teglalapdemo;

/**
 *
 * @author t1
 */
public class Teglalap {

    private int a, b;

    public Teglalap(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Teglalap(int a) {
        this(a, a);
    }

    public void beallit(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void beallit(int a) {
        this.a = a;
        this.b = a;
    }

    public int terulet() {
        return a * b;
    }

    public String adatok() {
        return a + ", " + b + ": " + terulet();
    }

    public int nagyobbmint(Teglalap masik) {
        if (terulet() < masik.terulet()) {
            return -1;
        } else if (terulet() == masik.terulet()) {
            return 0;
        } else {
            return 1;
        }
    }

    public boolean egyenlo(Teglalap masik) {
        return a == masik.a && b == masik.b;
    }
}
