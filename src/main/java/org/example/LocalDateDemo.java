package org.example;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/**
 * Hello world!
 *
 */
public class LocalDateDemo
{
    public static void main( String[] args )
    {
        LocalDate today = getToday();
        LocalDate dateOfBirth = LocalDate.of(1976,9,11);

        Period myLifeSpanSoFar = Period.between(dateOfBirth, today);

        LocalDate doubleMyLife = LocalDate.now().plus(myLifeSpanSoFar);
        System.out.println(doubleMyLife.minus(myLifeSpanSoFar));

    }


    public static LocalDate getToday(){
        return LocalDate.now();
    }

}
