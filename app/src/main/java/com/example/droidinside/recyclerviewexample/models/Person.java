package com.example.droidinside.recyclerviewexample.models;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.example.droidinside.recyclerviewexample.BR;

/**
 * Created by Droidinside on 2/23/2017.
 */

public class Person extends BaseObservable {

    @Bindable

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(String name) {
        this.name = name;
        setName(name);
        notifyPropertyChanged(BR.name);
    }

    private String name;
}
