package com.example.droidinside.recyclerviewexample.adapters;

import android.content.Context;
import android.database.DatabaseUtils;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.droidinside.recyclerviewexample.BR;
import com.example.droidinside.recyclerviewexample.R;
import com.example.droidinside.recyclerviewexample.models.Person;

import java.util.List;

/**
 * Created by Droidinside on 2/23/2017.
 */

public class PersonAdapter extends RecyclerView.Adapter<PersonAdapter.PersonViewHolder> {
    List<Person> personList;

    Context context;

    public PersonAdapter(Context context, List<Person> personList) {
        this.context = context;
        this.personList = personList;
        Log.d("adapter", "constructor called");

    }


    @Override
    public PersonViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        ViewDataBinding viewDataBinding = DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.row_person, parent, false);

        Log.d("adapter", "onCreateViewHolder");

        return new PersonViewHolder(viewDataBinding);
    }

    @Override
    public void onBindViewHolder(PersonViewHolder holder, int position) {

        ViewDataBinding viewDataBinding = holder.getViewDataBinding();

        viewDataBinding.setVariable(BR.person, personList.get(position));

        Log.d("adapter", "onBindViewHolder");


    }

    @Override
    public int getItemCount() {
        Log.d("adapter", "getItemCount");

        return (personList != null ? personList.size() : 0);

    }

    public class PersonViewHolder extends RecyclerView.ViewHolder {

        ViewDataBinding viewDataBinding;

        public PersonViewHolder(ViewDataBinding viewDataBinding) {

            super(viewDataBinding.getRoot());

            this.viewDataBinding = viewDataBinding;

            viewDataBinding.executePendingBindings();

            Log.d("adapter", "PersonViewHolder");

        }

        ViewDataBinding getViewDataBinding() {
            return viewDataBinding;
        }
    }

}
