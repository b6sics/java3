/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package szines;

import java.awt.Color;

/**
 *
 * @author t1
 */
public interface Szinezheto {

    public abstract Color getszin();

    public abstract void setSzin(Color szin);

    public static final Color ALAPSZIN = Color.GREEN;
}
