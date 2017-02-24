package com.example.droidinside.recyclerviewexample.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

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

    }


    @Override
    public PersonViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(context).inflate(R.layout.row_person, parent, false);
        PersonViewHolder personViewHolder = new PersonViewHolder(itemView);
        return personViewHolder;
    }

    @Override
    public void onBindViewHolder(PersonViewHolder holder, int position) {
        holder.name.setText(personList.get(position).getName() + position);

    }

    @Override
    public int getItemCount() {
        return personList.size();
    }

    public class PersonViewHolder extends RecyclerView.ViewHolder {
        TextView name;

        public PersonViewHolder(View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.name);
        }
    }

}
