package org.example;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;

public class LocalTimeDemo {

    public static void main(String[] args) {

        Duration untilNextMeeting = Duration.between(LocalTime.now(), LocalTime.of(11, 15));

        System.out.println(LocalTime.parse("20:05"));


    }

}
