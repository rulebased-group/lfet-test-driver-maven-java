package de.lohrfink.testdriver.java.tc001;

import de.lohrfink.testdriver.java.TrafficLightState;

import java.util.HashSet;
import java.util.Set;

public class TrafficLightStateMachineModel {

    final Set<TrafficLightState> input;
    final Set<TrafficLightState> output;

    TrafficLightStateMachineModel(Set<TrafficLightState> inputState) {
        this.input = inputState;
        this.output = new HashSet<>();
    }

}
