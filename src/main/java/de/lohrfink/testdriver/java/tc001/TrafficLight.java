package de.lohrfink.testdriver.java.tc001;

import de.lohrfink.testdriver.java.TrafficLightState;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TrafficLight {

    private final TrafficLightStateMachine stateMachine;
    private final Set<TrafficLightState> state;

    TrafficLight() {
        this.state = new HashSet<>(List.of(TrafficLightState.RED));
        this.stateMachine = new TrafficLightStateMachine();
    }

    public void execute() {
        Set<TrafficLightState> newState = stateMachine.execute(state);
        this.state.clear();
        this.state.addAll(newState);
    }

    boolean isShownLight(TrafficLightState state) {
        return this.state.contains(state);
    }

}

