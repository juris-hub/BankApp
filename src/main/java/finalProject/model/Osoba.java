/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalProject.model;

import com.sun.istack.NotNull;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;

/**
 *
 * @author Zver
 */
@Entity
public class Osoba extends Entitet {
    
    private String ime;
    private String prezime;
    @NotNull
    @NotEmpty
    @Email(message = "Email nije ispravan")
    private String email;
    private String oib;
    private String brojTelefona;
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

    public String getBrojTelefona() {
        return brojTelefona;
    }

    public void setBrojTelefona(String brojTelefona) {
        this.brojTelefona = brojTelefona;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOib() {
        return oib;
    }

    public void setOib(String oib) {
        this.oib = oib;
    }
    
    
    
}
