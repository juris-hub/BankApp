/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalProject.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.ManyToMany;

/**
 *
 * @author Zver
 */
public class PoslovnicaBanke {
    
    private String adresa;
    private String oibPoslovnice;
    
    @ManyToMany
    private List<Racun> racuni = new ArrayList<>();
    @ManyToMany
    private List<KreditnaKartica> kreditneKartice = new ArrayList<>();

    public List<Racun> getRacuni() {
        return racuni;
    }

    public void setRacuni(List<Racun> racuni) {
        this.racuni = racuni;
    }

    public List<KreditnaKartica> getKreditneKartice() {
        return kreditneKartice;
    }

    public void setKreditneKartice(List<KreditnaKartica> kreditneKartice) {
        this.kreditneKartice = kreditneKartice;
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
