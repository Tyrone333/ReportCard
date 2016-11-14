package com.example.android.reportcard;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    StudentAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.student_list);

        final ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Lukas", "A", "B", "C", "D", "C", "B"));
        students.add(new Student("Emma", "A+", "A+", "A+", "A+", "A+", "A+"));
        students.add(new Student("Silli", "F", "F", "F", "F", "F", "F"));
        students.add(new Student("Sebi", "A", "D", "B", "C", "A", "F"));
        students.add(new Student("Markus", "F", "B", "D", "E", "D", "A"));
        students.add(new Student("Max", "F", "C", "A", "C", "A", "B"));
        students.add(new Student("Paolo", "A", "B", "C", "D", "E", "F"));

        //Setup the Listview for the Songs
        adapter = new StudentAdapter(this, students);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(MainActivity.this, students.get(position).toString(), Toast.LENGTH_SHORT).show();
                return false;
            }
        });
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Intent intent = new Intent(MainActivity.this, StudentActivity.class);
                String name = students.get(position).getName();
                String math = students.get(position).getMath();
                String english = students.get(position).getEnglish();
                String german = students.get(position).getGerman();
                String physics = students.get(position).getPhysics();
                String geographie = students.get(position).getGeographie();
                String gymnastics = students.get(position).getGymnastics();

                intent.putExtra("name", name);
                intent.putExtra("math", math);
                intent.putExtra("english", english);
                intent.putExtra("german", german);
                intent.putExtra("physics", physics);
                intent.putExtra("geographie", geographie);
                intent.putExtra("gymnastics", gymnastics);

                startActivity(intent);
            }
        });
    }
}
