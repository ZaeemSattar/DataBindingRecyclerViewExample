package com.example.droidinside.recyclerviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.droidinside.recyclerviewexample.adapters.PersonAdapter;
import com.example.droidinside.recyclerviewexample.models.Person;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView personRecyclerView;

    PersonAdapter personAdapter;

    List<Person> personList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        findViews();

        initializeVaribales();

        populateDataList();


    }

    private void populateDataList() {

        for (int i = 0; i < 20; i++)
            personList.add(new Person("Person " + i));


        personAdapter.notifyDataSetChanged();


    }

    private void initializeVaribales() {

        personList = new ArrayList<Person>();

        personAdapter = new PersonAdapter(this, personList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);

        personRecyclerView.setLayoutManager(layoutManager);

        personRecyclerView.setItemAnimator(new DefaultItemAnimator());

        personRecyclerView.setAdapter(personAdapter);

    }

    private void findViews() {

        personRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);

    }
}
