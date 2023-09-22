package domain.Persona;

import domain.Contactable;
import domain.Converters.ConverterMedioComunicacion;
import domain.Direccion;
import domain.MedioDeComunicacion.MedioDeComunicacion;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Table(name = "persona")
@DiscriminatorColumn(name = "TipoPersona")
public abstract class Persona implements Contactable {

    @Id
    @GeneratedValue
    private Long id_persona;
    @Column
    private String cuitCuil;
    @OneToOne(mappedBy = "persona", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Direccion direccion;
    @Convert(converter = ConverterMedioComunicacion.class)
    private MedioDeComunicacion medioPreferido;

}
