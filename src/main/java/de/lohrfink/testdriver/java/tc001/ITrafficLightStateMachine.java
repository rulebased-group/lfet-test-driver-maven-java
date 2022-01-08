package de.lohrfink.testdriver.java.tc001;

import de.lohrfink.testdriver.java.TrafficLightState;

import java.util.Set;

public interface ITrafficLightStateMachine {

    Set<TrafficLightState> execute(Set<TrafficLightState> input);

}
