/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalProject.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

/**
 *
 * @author Zver
 */
public class PoslovnicaBanke extends Entitet {
    
    private String adresa;
    private String oibPoslovnice;
    @ManyToOne
    private KreditnaKartica kreditnaKartica;
    private Racun racun;

    public KreditnaKartica getKreditnaKartica() {
        return kreditnaKartica;
    }

    public void setKreditnaKartica(KreditnaKartica kreditnaKartica) {
        this.kreditnaKartica = kreditnaKartica;
    }
    
    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public String getOibPoslovnice() {
        return oibPoslovnice;
    }

    public void setOibPoslovnice(String oibPoslovnice) {
        this.oibPoslovnice = oibPoslovnice;
    }
    
}
