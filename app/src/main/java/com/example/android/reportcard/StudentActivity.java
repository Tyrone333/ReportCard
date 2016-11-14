package com.example.android.reportcard;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by tyrone3 on 02.11.16.
 */

public class StudentActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String math = intent.getStringExtra("math");
        String english = intent.getStringExtra("english");
        String german = intent.getStringExtra("german");
        String physics = intent.getStringExtra("physics");
        String geographie = intent.getStringExtra("geographie");
        String gymnastics = intent.getStringExtra("gymnastics");

        TextView nameView = (TextView) findViewById(R.id.name);
        nameView.setText(name);

        TextView mathView = (TextView) findViewById(R.id.mathe);
        mathView.setText(math);

        TextView englishView = (TextView) findViewById(R.id.english);
        englishView.setText(english);

        TextView germanView = (TextView) findViewById(R.id.german);
        germanView.setText(german);

        TextView physicsView = (TextView) findViewById(R.id.physics);
        physicsView.setText(physics);

        TextView geographieView = (TextView) findViewById(R.id.geographie);
        geographieView.setText(geographie);

        TextView gymnasticsView = (TextView) findViewById(R.id.gymnastics);
        gymnasticsView.setText(gymnastics);

    }
}
