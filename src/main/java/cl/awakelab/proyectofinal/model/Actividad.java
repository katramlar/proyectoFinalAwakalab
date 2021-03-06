package cl.awakelab.proyectofinal.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.ForeignKey;

@Entity
@Table(name="actividad")
public class Actividad {
    
    @Id
	private int idActividad;
	
	@Column(name = "fecha", nullable = true)
	private Timestamp fechaActividad;

	@Column(name = "descripcion", nullable = true)
    private String descripcion;
    
    @ManyToOne
    @JoinColumn(name="cliente", nullable=false, foreignKey = @ForeignKey(name="FK_actividad_cliente"))
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name="profesional", nullable=false, foreignKey = @ForeignKey(name="FK_actividad_profesional"))
    private Profesional profesional;

    public int getIdActividad() {
        return idActividad;
    }

    public void setIdActividad(int idActividad) {
        this.idActividad = idActividad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Profesional getProfesional() {
        return profesional;
    }

    public void setProfesional(Profesional profesional) {
        this.profesional = profesional;
    }

    public Timestamp getFechaActividad() {
        return fechaActividad;
    }

    public void setFechaActividad(Timestamp fechaActividad) {
        this.fechaActividad = fechaActividad;
    }

}