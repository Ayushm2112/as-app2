package com.example.workoutsadvisor;

import java.util.ArrayList;
import java.util.List;

public class WorkoutExpert {
    List<String> getWorkouts(String workouttypes){
        List<String> workout = new ArrayList<>();
        if (workouttypes.equals("Chest")) {
            workout.add("Bench Press");
        }
        else if (workouttypes.equals("Bicep")){
            workout.add("Bicep Curls");
        }
        else if (workouttypes.equals("Triceps")){
            workout.add("Tricep Ext");
        }
        else if (workouttypes.equals("Shoulder")){
            workout.add("Shoulder Press");
        }
        return workout;

    }
}
