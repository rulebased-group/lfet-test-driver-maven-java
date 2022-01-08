package de.lohrfink.testdriver.java.tc001;

import de.lohrfink.testdriver.java.TrafficLightState;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrafficLightTest {

    protected TrafficLight createUnderTest() {
        return new TrafficLight();
    }

    @Test
    void execute() {
        TrafficLight trafficLight = createUnderTest();
        Assertions.assertTrue(trafficLight.isShownLight(TrafficLightState.RED));
        Assertions.assertFalse(trafficLight.isShownLight(TrafficLightState.YELLOW));
        Assertions.assertFalse(trafficLight.isShownLight(TrafficLightState.GREEN));

        trafficLight.execute();

        Assertions.assertTrue(trafficLight.isShownLight(TrafficLightState.RED));
        Assertions.assertTrue(trafficLight.isShownLight(TrafficLightState.YELLOW));
        Assertions.assertFalse(trafficLight.isShownLight(TrafficLightState.GREEN));

        trafficLight.execute();

        Assertions.assertFalse(trafficLight.isShownLight(TrafficLightState.RED));
        Assertions.assertFalse(trafficLight.isShownLight(TrafficLightState.YELLOW));
        Assertions.assertTrue(trafficLight.isShownLight(TrafficLightState.GREEN));

        trafficLight.execute();

        Assertions.assertFalse(trafficLight.isShownLight(TrafficLightState.RED));
        Assertions.assertTrue(trafficLight.isShownLight(TrafficLightState.YELLOW));
        Assertions.assertFalse(trafficLight.isShownLight(TrafficLightState.GREEN));

        trafficLight.execute();

        Assertions.assertTrue(trafficLight.isShownLight(TrafficLightState.RED));
        Assertions.assertFalse(trafficLight.isShownLight(TrafficLightState.YELLOW));
        Assertions.assertFalse(trafficLight.isShownLight(TrafficLightState.GREEN));


    }
}