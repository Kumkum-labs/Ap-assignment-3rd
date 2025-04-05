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

//output
PS C:\Users\kumku\OneDrive\Desktop\git\ap assignment>  & 'C:\Program Files\Java\jre1.8.0_441\bin\java.exe' '-cp' 'C:\Users\kumku\AppData\Roaming\Code\User\workspaceStorage\c7396c4d866a242fe6158ae5b38823d0\redhat.java\jdt_ws\ap assignment_20a13684\bin' 'TrafficLight' 
Current color: Red, Duration: 60 seconds
The light is Red. Stop.
Traffic light color changed to Green with duration 45 seconds.
Current color: Green, Duration: 45 seconds
The light is Green. Go.
PS C:\Users\kumku\OneDrive\Desktop\git\ap assignment> 

 
