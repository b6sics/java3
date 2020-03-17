/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konyvek;

import java.util.Objects;

/**
 *
 * @author t1
 */
public class Konyv {

    private String szerzo;
    private String cim;

    public String getSzerzo() {
        return szerzo;
    }

    public void setSzerzo(String szerzo) {
        this.szerzo = szerzo;
    }

    public String getCim() {
        return cim;
    }

    public void setCim(String cim) {
        this.cim = cim;
    }

    public Konyv(String szerzo, String cim) {
        this.szerzo = szerzo;
        this.cim = cim;
    }

    @Override
    public String toString() {
        return "Konyv{" + "szerzo=" + szerzo + ", cim=" + cim + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 43 * hash + Objects.hashCode(this.szerzo);
        hash = 43 * hash + Objects.hashCode(this.cim);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Konyv other = (Konyv) obj;
        if (!Objects.equals(this.szerzo, other.szerzo)) {
            return false;
        }
        if (!Objects.equals(this.cim, other.cim)) {
            return false;
        }
        return true;
    }
}
