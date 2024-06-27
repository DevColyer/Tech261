package com.sparta.dc;

public class TrafficLightController {
    private TrafficLight currentLight;

    public TrafficLightController() {
        // Initialize the traffic light to RED
        currentLight = TrafficLight.RED;
    }

    public void changeLight() {
        switch (currentLight) {
            case RED:
                currentLight = TrafficLight.GREEN;
                break;
            case GREEN:
                currentLight = TrafficLight.YELLOW;
                break;
            case YELLOW:
                currentLight = TrafficLight.RED;
                break;
        }
    }

    public void displayCurrentLight() {
        System.out.println("The traffic light is " + currentLight + " for " + currentLight.getDuration() + " seconds.");
    }

    public static void main(String[] args) {
        TrafficLightController controller = new TrafficLightController();

        // Simulate traffic light changes
        for (int i = 0; i < 6; i++) {
            controller.displayCurrentLight();
            controller.changeLight();
        }

        // Modify the duration of the traffic lights
        TrafficLight.RED.setDuration(35);
        TrafficLight.YELLOW.setDuration(6);
        TrafficLight.GREEN.setDuration(20);

        // Display the modified durations
        System.out.println("\nModified durations:");
        for (int i = 0; i < 6; i++) {
            controller.displayCurrentLight();
            controller.changeLight();
        }

        System.out.println("\nNew Controller durations:");
        TrafficLightController newController = new TrafficLightController();

        // Simulate traffic light changes
        for (int i = 0; i < 6; i++) {
            newController.displayCurrentLight();
            newController.changeLight();
        }
    }
}