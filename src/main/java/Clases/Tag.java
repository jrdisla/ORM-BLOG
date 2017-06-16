package Clases;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by jrdis on 10/6/2017.
 */
@Entity
public class Tag implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String tag;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEtiqueta() {
        return tag;
    }

    public void setEtiqueta(String etiqueta) {
        this.tag = etiqueta;
    }

    public Tag(long id, String etiqueta) {

        this.id = id;
        this.tag = etiqueta;
    }

    public Tag() {

    }

}
