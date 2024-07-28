package reservavel;

import java.time.LocalDate;
import usuarios.Locatario;

public interface Reservavel {
    void reservar(LocalDate data, Locatario locatario);
}