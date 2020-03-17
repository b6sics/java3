/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package szines;

import javafx.scene.paint.Color;

/**
 *
 * @author t1
 */
public class SzinesPont extends Pont implements Szinezheto {

    private Color szin;

    public SzinesPont(Color szin, int x, int y) {
        super(x, y);
        this.szin = szin;
    }

    @Override
    public Color getszin() {
        return szin;
    }

    @Override
    public void setSzin(Color szin) {
        this.szin = szin;
    }

    public void sajatSzin(int r, int g, int b) {
        szin = Color.rgb(r, g, b);
    }

    @Override
    public String toString() {
        return super.toString() + ", " + szin;
    }
}
