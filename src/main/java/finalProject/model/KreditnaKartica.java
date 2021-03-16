/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalProject.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Entity;

/**
 *
 * @author Zver
 */
@Entity
public class KreditnaKartica extends Entitet {
    
    private Date vrijediOdDo;
    private BigDecimal limit;
    private String broj;
    private String vrsta;
    private String kontrolniBroj;

    public Date getVrijediOdDo() {
        return vrijediOdDo;
    }

    public void setVrijediOdDo(Date vrijediOdDo) {
        this.vrijediOdDo = vrijediOdDo;
    }

    public BigDecimal getLimit() {
        return limit;
    }

    public void setLimit(BigDecimal limit) {
        this.limit = limit;
    }

    public String getBroj() {
        return broj;
    }

    public void setBroj(String broj) {
        this.broj = broj;
    }

    public String getVrsta() {
        return vrsta;
    }

    public void setVrsta(String vrsta) {
        this.vrsta = vrsta;
    }

    public String getKontrolniBroj() {
        return kontrolniBroj;
    }

    public void setKontrolniBroj(String kontrolniBroj) {
        this.kontrolniBroj = kontrolniBroj;
    }
    
    
    
}
