/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 *
 * @author edwin
 */
@NamedQuery(name = "getByLevel",
        query = "SELECT c FROM Cliente c WHERE c.id >= :level")
@Entity
@Table(name = "cliente")
public class Cliente extends Persona implements Serializable {

    @Column(name = "fecha_Nacimiento")
    @Temporal(TemporalType.DATE)
    private Date fechaNacimiento;

    public Cliente() {
    }

    public Cliente(Date fechaNacimiento, String identificador, String nombre, String apellido, String correo, String direccion, String telefono, boolean editable) {
        super( identificador, nombre, apellido, correo, direccion, telefono, editable);
        this.fechaNacimiento = fechaNacimiento;
    }

}
