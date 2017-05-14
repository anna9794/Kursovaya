package hello.model;

import javax.persistence.*;

/**
 * Created by Анютка on 03.05.2017.
 */
@Entity
@Table(name = "tip_igrushek")
public class TipIgrushek {
        @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    //@Column(name = "n_tipa")
    private int n_tipa;
    private int tip_igrushki;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getN_tipa() {
        return n_tipa;
    }

    public void setN_tipa(int n_tipa) {
        this.n_tipa = n_tipa;
    }

    public int getTip_igrushki() {
        return tip_igrushki;
    }

    public void setTip_igrushki(int tip_igrushki) {
        this.tip_igrushki = tip_igrushki;
    }
}