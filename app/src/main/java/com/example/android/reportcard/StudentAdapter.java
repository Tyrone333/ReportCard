package com.example.android.reportcard;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by tyrone3 on 02.11.16.
 */

public class StudentAdapter extends ArrayAdapter<Student> {


        StudentAdapter(Context context, ArrayList<Student> students) {
            super(context, 0, students);

        }

        @Override
        public View getView(final int position, View convertView, ViewGroup parent) {
            // Check if the existing view is being reused, otherwise inflate the view
            View listItemView = convertView;
            if (listItemView == null) {
                listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
            }
            Student currentStudent = getItem(position);

            TextView studentNameTextView = (TextView) listItemView.findViewById(R.id.name_text_view);
            assert currentStudent != null;
            studentNameTextView.setText(currentStudent.getName());

            return listItemView;
        }
    }

