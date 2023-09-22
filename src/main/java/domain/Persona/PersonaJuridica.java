package domain.Persona;

import domain.Converters.LocalDateConverter;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
@Setter @Getter
@Entity
@DiscriminatorValue("Juridica")
public class PersonaJuridica extends Persona {

    @ElementCollection
    private List<String> emailsDeContacto;

    @Convert(converter = LocalDateConverter.class)
    private LocalDate fechaConstitucion;
    @Column
    private String razonSocial;
    @ElementCollection
    private List<String> telefonosDeContacto;

}
