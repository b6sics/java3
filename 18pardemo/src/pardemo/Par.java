/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pardemo;

/**
 *
 * @author t1
 */
public class Par<T, S> {

    private T bal;
    private S jobb;

    public T getBal() {
        return bal;
    }

    public void setBal(T bal) {
        this.bal = bal;
    }

    public S getJobb() {
        return jobb;
    }

    public void setJobb(S jobb) {
        this.jobb = jobb;
    }

    public Par(T bal, S jobb) {
        this.bal = bal;
        this.jobb = jobb;
    }

    @Override
    public String toString() {
        return "(" + bal + ", " + jobb + ')';
    }
}
