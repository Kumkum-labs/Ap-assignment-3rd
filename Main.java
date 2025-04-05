class TrafficLight {
    // Attributes
    String color;
    int duration; // Duration in seconds

    // Constructor to initialize the color and duration
    public TrafficLight(String color, int duration) {
        this.color = color;
        this.duration = duration;
    }

    // Method to change the color of the traffic light
    public void changeColor(String newColor, int newDuration) {
        color = newColor;
        duration = newDuration;
        System.out.println("Traffic light color changed to " + color + " with duration " + duration + " seconds.");
    }

    // Method to check if the light is red
    public boolean isRed() {
        return color.equalsIgnoreCase("Red");
    }

    // Method to check if the light is green
    public boolean isGreen() {
        return color.equalsIgnoreCase("Green");
    }

    // Method to display current traffic light status
    public void displayStatus() {
        System.out.println("Current color: " + color + ", Duration: " + duration + " seconds");
    }

    public static void main(String[] args) {
        // Create a TrafficLight object with initial color and duration
        TrafficLight light = new TrafficLight("Red", 60);

        // Display the current status of the traffic light
        light.displayStatus();

        // Check if the light is red or green
        if (light.isRed()) {
            System.out.println("The light is Red. Stop.");
        } else if (light.isGreen()) {
            System.out.println("The light is Green. Go.");
        }

        // Change the color to Green with a duration of 45 seconds
        light.changeColor("Green", 45);

        // Display the updated status
        light.displayStatus();

        // Check if the light is red or green after changing the color
        if (light.isRed()) {
            System.out.println("The light is Red. Stop.");
        } else if (light.isGreen()) {
            System.out.println("The light is Green. Go.");
        }
    }
}


 