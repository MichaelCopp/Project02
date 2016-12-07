package com.example.mbcoppol.project02;

/**
 * Created by mbcoppol on 12/7/2016.
 */

public class Workout {
    private String name;
    private String description;
    private String length;

    public static final Workout[] workouts = {
            new Workout ("Warmup Activity",
                    "10 Deep Breaths\n2 sets Arm Extensions\n2 set Leg Extension",
                    "10 minutes"),
            new Workout ("Core Agony",
                    "100 pull-ups\n100 push-ups\n100 squats","25 Minutes"),
            new Workout ("Yoga Routine",
                    "Downward Dog\nSun Salutation\nChair\nWarrior", "20 Minutes"),
            new Workout ("High Impact",
                    "500 meter run\n21 x 1.5 pood kettleball swing\n21 x pull-ups", "30 minutes"),
            new Workout ("Winter Special", "1000 Rising Steps\n100 Hula Hoop Swings", "30 Minutes"),
            new Workout ("Standing Workout", "30 Lunges\n100 Jumping Jacks\nTouch Your Toes", "20 Minutes")

    };

    private Workout(String name, String description, String length) {
        this.name = name;
        this.description = description;
        this.length = length;
    }

    public String getLength(){
        return length;
    }
    public String getDescription(){
        return description;
    }
    public String getName(){
        return name;
    }
    public String toString(){
        return this.name;
    }
}
