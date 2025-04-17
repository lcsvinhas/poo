package org.serratec.exemplos;

import java.util.Calendar;
import java.util.Date;

public class ExemploDate {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("Data de hoje: " + date);
        System.out.println(date.getHours());

        Calendar dataHoje = Calendar.getInstance();
        System.out.println(dataHoje);
        System.out.println(dataHoje.get(Calendar.MONTH));
    }
}
