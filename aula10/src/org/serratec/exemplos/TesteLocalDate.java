package org.serratec.exemplos;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class TesteLocalDate {
    public static void main(String[] args) {
        LocalDate dataHoje = LocalDate.now();
        LocalDate dataManual = LocalDate.of(2025, 4, 15);
        Locale locale = new Locale("pt", "BR");

        System.out.println(dataHoje.getDayOfWeek().getDisplayName(TextStyle.SHORT, locale));
        System.out.println(dataHoje.isLeapYear() ? "Sim" : "Não");

        LocalTime hora = LocalTime.now();
        System.out.println(hora.plusHours(2));

        LocalDate dataNascimento = LocalDate.of(1999, 02, 20);

        Period periodo = Period.between(dataNascimento, dataHoje);
        System.out.println("Você tem " + periodo.getYears() + " ano(s) "
                + periodo.getMonths() + " mes(es) e " + periodo.getDays() + " dia(s)");

        System.out.println(ChronoUnit.DAYS.between(dataNascimento, dataHoje));

        LocalDateTime horaLocal = LocalDateTime.now();
        System.out.println(horaLocal);

        ZoneId fuso = ZoneId.systemDefault();
        System.out.println(fuso);

        for (String s : ZoneId.getAvailableZoneIds()) {
            System.out.println(s);
        }

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(dataHoje.format(formatter));
    }
}
