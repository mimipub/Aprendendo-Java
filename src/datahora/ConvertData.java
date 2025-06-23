package datahora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

import static java.time.LocalDate.parse;

public class ConvertData {
    public static void main(String[] args) {
        LocalDate data1 = parse("2025-05-20"); // Formato: AAAA-MM-DD
        LocalDateTime data2 = LocalDateTime.parse("2025-05-20T01:30");
        Instant data3 = Instant.parse("2025-05-20T01:30:26Z"); //  Formato ISO 8601 no Instant

        System.out.println("Antes da conversão:");
        System.out.println("Data LocalDate: " + data1);
        System.out.println("Data LocalDateTime: " + data2);
        System.out.println("Data Instant: " + data3);

        System.out.println("Após a conversão:");
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); /* todo  dentro do método ofPattern colocar o formato desejado*/
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy 'horas:' HH:mm");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());


        System.out.println("Primeira data formatada:" + data1.format(fmt1));
        System.out.println("Segunda data formatada: " + data2.format(fmt2));
        System.out.println("Conversão de Instant para LocalDateTime: " + fmt3.format(data3));
    }
}
