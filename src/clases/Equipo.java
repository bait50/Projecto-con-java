
package clases;

/**
 *
 * @author BIBPRESTAMOS# 21
 */
public class Equipo {
    private String marca,modelo,nserie,estado;
    int id;

    public Equipo(String marca, String modelo, String nserie, String estado,int id) {
        this.marca = marca;
        this.modelo = modelo;
        this.nserie = nserie;
        this.estado = estado;
        this.id=id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNserie() {
        return nserie;
    }

    public void setNserie(String nserie) {
        this.nserie = nserie;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Equipo{" + "marca=" + marca + ", modelo=" + modelo + ", nserie=" + nserie + ", estado=" + estado + ", id=" + id + '}';
    }
    
    
}
