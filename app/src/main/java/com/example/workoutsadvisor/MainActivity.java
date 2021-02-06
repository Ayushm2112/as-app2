package com.example.workoutsadvisor;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;


public class MainActivity extends Activity {

    private WorkoutExpert expert=new WorkoutExpert();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void onClickMainActivity(View view){
        TextView workouts=(TextView)  findViewById(R.id.workout);
        Spinner workouttype=(Spinner) findViewById(R.id.workouttype);
        String workout=String.valueOf(workouttype.getSelectedItem());
        List<String> workoutList= expert.getWorkouts(workout);
        StringBuilder workoutFormatted=new StringBuilder();
        for (String work: workoutList){
            workoutFormatted.append(work).append('\n');
        }
        workouts.setText(workoutFormatted);
        //workouts.setText(workout);
    }
    public void buttononeclick(View view){
        Intent intent = new Intent(this,activitytwo.class);
        startActivity(intent);
    }

}
