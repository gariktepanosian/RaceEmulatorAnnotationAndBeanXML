package com.example.horseRaceEmulatorAnnotationAndBeanXML.spring;

import com.example.horseRaceEmulatorAnnotationAndBeanXML.beans.Horse;
import com.example.horseRaceEmulatorAnnotationAndBeanXML.beans.Race;
import com.example.horseRaceEmulatorAnnotationAndBeanXML.service.EmulatorServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Race race = context.getBean("Race", Race.class);
        System.out.println(race);
        List<Horse> horses = race.getHorse();
        EmulatorServiceImpl emulatorService = new EmulatorServiceImpl();
        Horse horse = emulatorService.getWinner(horses);
        System.out.println("Winner is " + horse.getRider() + " by the " + horse.getBreed() + " horse " + "with the race number " + horse.getRaceNumber());
    }
}
