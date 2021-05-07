/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalProject.model;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author Zver
 */
public class Klijent_KreditnaKartica extends Entitet{
    @ManyToOne()
    @JoinColumn(name = "klijent")
    private Klijent klijent;
    @ManyToOne()
    @JoinColumn(name = "kartica")
    private KreditnaKartica kreditnaKartica;

    public Klijent getKlijent() {
        return klijent;
    }

    public void setKlijent(Klijent klijent) {
        this.klijent = klijent;
    }

    public KreditnaKartica getKreditnaKartica() {
        return kreditnaKartica;
    }

    public void setKreditnaKartica(KreditnaKartica kreditnaKartica) {
        this.kreditnaKartica = kreditnaKartica;
    }
    
    
    
}
