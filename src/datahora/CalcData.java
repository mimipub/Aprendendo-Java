package datahora;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class CalcData {
    public static void main(String[] args) {
        LocalDate data4 = LocalDate.parse("2025-05-20"); // Formato: AAAA-MM-DD
        LocalDateTime data5 = LocalDateTime.parse("2025-05-20T00:00:00");
        Instant data6 = Instant.parse("2025-05-20T10:15:30Z"); // Formato ISO 8601

        LocalDate Weekday = data4.minusDays(7);
        LocalDate WeekdayTime = data4.plusDays(10);

        LocalDateTime Weekday2 = data5.minusDays(7);
        LocalDateTime WeekdayTime2  = data5.plusDays(5);

        Instant Weekday3 = data6.minus(7, ChronoUnit.DAYS); // subtrai 7 dias em segundos
        Instant WeekdayTime3 = data6.plus(7, ChronoUnit.DAYS); // soma 10 dias em segundos

        System.out.println("subtraindo 7 dias de uma data LocalDate: " + Weekday);
        System.out.println("somando 10 dias de uma data LocalDateTime: " + WeekdayTime);
        System.out.println( );
        System.out.println("subtraindo 7 dias de uma data LocalDateTime: " + Weekday2);
        System.out.println("somando 5 dias de uma data LocalDateTime: " + WeekdayTime2);
        System.out.println();
        System.out.println("subtraindo 7 dias de uma data Instant: " + Weekday3);
        System.out.println("somando 10 dias de uma data Instant: " + WeekdayTime3);

        System.out.println();

        Duration t1 = Duration.between(Weekday.atStartOfDay(), data4.atStartOfDay()); // Calcula a diferença entre LocalDateTime e Instant
        Duration t2 = Duration.between(Weekday2, data5); // Calcula a diferença entre LocalDateTime e Instant
        Duration t3 = Duration.between(data6, Weekday3 ); // Calcula a diferença entre Instant e LocalDateTime
        Duration t4 = Duration.between(WeekdayTime3, data6); // Calcula a diferença entre Instant e LocalDateTime
        Duration t5 = Duration.between(data5.toInstant(ZoneOffset.UTC), WeekdayTime3); // Calcula a diferença entre LocalDateTime e Instant
        System.out.println("Diferença de dias = " + t1.toDays());
        System.out.println("Diferença de dias = " + t2.toDays());
        System.out.println("Diferença de dias = " + t3.toDays());
        System.out.println("Diferença de dias = " + t4.toDays());
        System.out.println("Diferença de dias = " + t5.toDays());
    }
}
