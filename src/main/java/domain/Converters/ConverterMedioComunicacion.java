package domain.Converters;

import domain.MedioDeComunicacion.Email;
import domain.MedioDeComunicacion.MedioDeComunicacion;
import domain.MedioDeComunicacion.Telegram;
import domain.MedioDeComunicacion.WhatsApp;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class ConverterMedioComunicacion implements AttributeConverter<MedioDeComunicacion, String> {

    @Override
    public String convertToDatabaseColumn(MedioDeComunicacion medioDeComunicacion) {
        return medioDeComunicacion.getClass().getName();
    }

    @Override
    public MedioDeComunicacion convertToEntityAttribute(String medio) {
        return switch (medio) {
            case "Telegram" -> new Telegram();
            case "WhatsApp" -> new WhatsApp();
            case "Email" -> new Email();
            default -> null;
        };
    }
}
