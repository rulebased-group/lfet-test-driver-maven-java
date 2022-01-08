package de.lohrfink.testdriver.java.tc001;

import de.lohrfink.testdriver.java.TrafficLightState;

import java.util.Set;

class TrafficLightStateMachine implements ITrafficLightStateMachine, TrafficLightStateMachine_Iface<TrafficLightStateMachineModel> {


    private TrafficLightStateMachine_RulesEngine decisionTableLogic;

    TrafficLightStateMachine() {
        decisionTableLogic = new TrafficLightStateMachine_RulesEngine();
    }


    @Override
    public boolean isTrafficLightShowsYellow(TrafficLightStateMachineModel model) {
        return model.input.contains(TrafficLightState.YELLOW);
    }

    @Override
    public boolean isTrafficLightShowsRed(TrafficLightStateMachineModel model) {
        return model.input.contains(TrafficLightState.RED);
    }

    @Override
    public void doNewStateShowsGreen(TrafficLightStateMachineModel model) {
        model.output.add(TrafficLightState.GREEN);
    }

    @Override
    public void doNewStateShowsYellow(TrafficLightStateMachineModel model) {
        model.output.add(TrafficLightState.YELLOW);
    }

    @Override
    public void doNewStateShowsRed(TrafficLightStateMachineModel model) {
        model.output.add(TrafficLightState.RED);
    }

    @Override
    public void doTrace(String dtName, String version, int rules, int rule, TrafficLightStateMachineModel model) {

    }

    @Override
    public Set<TrafficLightState> execute(Set<TrafficLightState> inputState) {
        TrafficLightStateMachineModel model = new TrafficLightStateMachineModel(inputState);
        decisionTableLogic.execute(this, model);
        return model.output;
    }
}
