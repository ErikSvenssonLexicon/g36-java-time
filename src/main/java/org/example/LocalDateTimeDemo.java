package org.example;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeDemo {
    public static void main(String[] args) {

        LocalDateTime meetingStart = LocalDateTime.of(2021, 4, 28, 11, 15);

        LocalDate date = meetingStart.toLocalDate();
        LocalTime time = meetingStart.toLocalTime();

        Duration myLifeInDetails = Duration.between(LocalDateTime.parse("1976-09-11T23:50"), meetingStart);

        LocalDateTime myBirthDateTime = LocalDateTime.parse("1976-09-11T23:50");

        LocalDateTime someOtherDateTime = myBirthDateTime.plus(myLifeInDetails);

        System.out.println(someOtherDateTime);




    }
}
