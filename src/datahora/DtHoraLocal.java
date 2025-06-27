package datahora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class DtHoraLocal {
    public static void main(String[] args) {
        LocalDate data4 = LocalDate.parse("2025-05-20"); // Formato: AAAA-MM-DD
        LocalDateTime data5 = LocalDateTime.parse("2025-05-20T00:00:00");
        Instant data6 = Instant.parse("2025-05-20T10:15:30Z"); // Formato ISO 8601

        LocalDate dt4 = LocalDate.ofInstant(data6, ZoneId.systemDefault());
        LocalDate dt5 = LocalDate.ofInstant(data6, ZoneId.of("America/Sao_Paulo"));
        LocalDate dt6 = LocalDate.ofInstant(data6, ZoneId.systemDefault());
        LocalDateTime dt7 = LocalDateTime.ofInstant(data6, ZoneId.of("Portugal"));

        System.out.println("Data LocalDate: " + dt4);
        System.out.println("Data LocalDateTime com fuso em SP: " + dt5);
        System.out.println("Data LocalDateTime com fuso padrão: " + dt6);
        System.out.println("Data LocalDateTime com fuso em Portugal: " + dt7);
    }
}
