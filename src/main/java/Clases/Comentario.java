package Clases;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

/**
 * Created by jrdis on 10/6/2017.
 */
@Entity
public class Comentario implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long id;
    private String comment;
    @ManyToOne
    private Usuario Usuario;
    @ManyToOne
    private Articulo articulo;

    public Comentario() {
    }

    public Comentario(long id, String comment, Clases.Usuario usuario, Articulo articulo) {
        this.id = id;
        this.comment = comment;
        Usuario = usuario;
        this.articulo = articulo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Clases.Usuario getUsuario() {
        return Usuario;
    }

    public void setUsuario(Clases.Usuario usuario) {
        Usuario = usuario;
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }
}
