package domain.Persona;

import domain.Persona.Persona;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
@Setter @Getter
@Entity
@DiscriminatorValue("Fisica")
public class PersonaFisica extends Persona {

    @Column
    private String apellido;
    @Column
    private String email;
    @Column(name = "fecha_nacimiento")
    private String fechaNacimiento;
    @Column
    private String nombre;
    @Column
    private String telefono;

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
