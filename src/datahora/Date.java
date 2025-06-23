package datahora;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Date {
    public static void main(String[] args) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDate data1 = LocalDate.now();
        LocalDateTime data2 = LocalDateTime.now();
        Instant data3 = Instant.now();
        LocalDate data4 = LocalDate.parse("2025-05-20"); // Formato: AAAA-MM-DD
        LocalDateTime data5 = LocalDateTime.parse("2025-05-20T00:00:00");
        Instant data6 = Instant.parse("2025-05-20T10:15:30Z"); // Formato ISO 8601
        OffsetDateTime data7 = OffsetDateTime.parse("2025-05-20T10:15:30-03:00");
        LocalDate date8 = LocalDate.parse("20/02/2025", dtf); // Criação de data específica
        LocalDateTime date9 = LocalDateTime.parse("20/05/2025 01:30", dtf1);
        LocalDate date10 = LocalDate.of(2025, 5, 20);
        LocalDateTime date11 = LocalDateTime.of( 2025,05,30,7,20);

        System.out.println("Data atual: " + data1);
        System.out.println("Data e hora atual: " + data2);
        System.out.println("Instante atual: " + data3);
        System.out.println("Data formatada: " + data4);
        System.out.println("Data e hora do instante: " + data5);
        System.out.println("Instante formatado: " + data6);
        System.out.println("Instante com fuso horário: " + data7);
        System.out.println("Data específica: " + date8);
        System.out.println("Data com hora" + date9);
        System.out.println("Data com método of: " + date10);
        System.out.println("Data e hora com metodo of" + date11);

    }
}
