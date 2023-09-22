package domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Setter@Getter
@Entity
public class Direccion {
    @Id
    @GeneratedValue
    private Long id_direccion;
    @Column
    private int altura;
    @Column
    private String calle;
    @Column
    private String localidadBarrio;
    @Column
    private String municipioComuna;
    @Column
    private String provincia;

}
