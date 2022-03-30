package com.example.horseRaceEmulatorAnnotationAndBeanXML.service;

import com.example.horseRaceEmulatorAnnotationAndBeanXML.beans.Horse;

import java.util.List;
import java.util.Random;

public class EmulatorServiceImpl implements EmulatorService{
    Random random  = new Random();

    @Override
    public Horse getWinner(List<Horse> horse) {
        int low = 1;
        int high = 6;
        int res = random.nextInt(high - low) + low;
        for (Horse horse1 : horse) {
            if (res == horse1.getRaceNumber()) {
//                horses.add(horse1);
                return horse1;
            }
        }
        return null;
    }
}
