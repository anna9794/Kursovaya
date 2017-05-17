package hello;
import hello.model.TipIgrushek;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Анютка on 17.05.2017.
 */
@Entity
public class Igrushka {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer n_igrushki;
    private int n_tipa;
    private String nazvanie;
    private float tsena;
    private int n_zavoda;
    private Date data_izgotovleniya;
    private int n_postupleniya;
    private int n_sklada;
    @ManyToOne
    private TipIgrushek id ;

    public Integer getN_igrushki() {
        return n_igrushki;
    }

    public void setId(Integer n_igrushki) {
        this.n_igrushki = n_igrushki;
    }

    public int getN_tipa() {
        return n_tipa;
    }

    public void setN_tipa(int n_tipa) {
        this.n_tipa = n_tipa;
    }

    public String getNazvanie() {
        return nazvanie;
    }

    public void setNazvanie(String nazvanie) {
        this.nazvanie = nazvanie;
    }

    public float getTsena() {
        return tsena;
    }

    public void setTsena(int tsena) {
        this.tsena = tsena;
    }

    public int getN_zavoda() {
        return n_zavoda;
    }

    public void setN_zavoda(int n_zavoda) {
        this.n_zavoda = n_zavoda;
    }

    public Date getData_izgotovleniya() {
        return data_izgotovleniya;
    }

    public void setData_izgotovleniya(Date data_izgotovleniya) {
        this.data_izgotovleniya = data_izgotovleniya;
    }

    public int getN_postupleniya() {
        return n_postupleniya;
    }

    public void setN_postupleniya(int n_postupleniya) {
        this.n_postupleniya = n_postupleniya;
    }

    public int getN_sklada() {
        return n_sklada;
    }

    public void setN_sklada(int n_sklada) {
        this.n_sklada = n_sklada;
    }
}
