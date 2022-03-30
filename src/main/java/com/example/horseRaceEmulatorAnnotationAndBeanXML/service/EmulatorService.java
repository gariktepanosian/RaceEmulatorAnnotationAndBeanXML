package com.example.horseRaceEmulatorAnnotationAndBeanXML.service;

import com.example.horseRaceEmulatorAnnotationAndBeanXML.beans.Horse;

import java.util.List;

public interface EmulatorService {
    Horse getWinner(List<Horse> horse);
}
