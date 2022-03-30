package com.example.horseRaceEmulatorAnnotationAndBeanXML.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;


@Component("Race")
@PropertySource("classpath:application.properties")
public class Race {
    @Qualifier("raceService")
    private List<Horse> horse;
    @Value("${length}")
    private long length;
    @Value("#{T(java.time.LocalDate).parse('${date}')}")
    private LocalDate localDate;

    public Race(List<Horse> horse, long length, LocalDate localDate) {
        this.horse = horse;
        this.length = length;
        this.localDate = localDate;
    }

    public Race() {
    }

    @Autowired
    public Race(List<Horse> horse) {
        this.horse = horse;
    }

    public List<Horse> getHorse() {
        return horse;
    }

    @Override
    public String toString() {
        return "Race " +
                " horse= " + horse +
                " length= " + length +
                " localDate= " + localDate + '\n';
    }

}
