package com.emedinaa.examples;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ExpandableListView;

import com.emedinaa.examples.model.entity.GroupEntity;
import com.emedinaa.examples.model.entity.ItemEntity;
import com.emedinaa.examples.view.adapters.MyAdapter;

import java.util.ArrayList;
import java.util.List;


public class HomeActivity extends ActionBarActivity
{
    private ExpandableListView exListView;
    private List<GroupEntity> groups;
    private List<List<ItemEntity>> items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        exListView= (ExpandableListView)findViewById(R.id.exListView);
        populateData();
        MyAdapter adapter = new MyAdapter(this, groups,items);
        exListView.setAdapter(adapter);

    }

    private void populateData() {
            groups= new ArrayList<GroupEntity>();
            items= new ArrayList<List<ItemEntity>>();

            groups.add(new GroupEntity("Grupo Android"));
            groups.add(new GroupEntity("Grupo IOS"));
            groups.add(new GroupEntity("Grupo Firefox OS"));
            groups.add(new GroupEntity("Grupo Otros"));

            //group 1
            List<ItemEntity> item1= new ArrayList<ItemEntity>();
            item1.add(new ItemEntity("Grupo 1 Android"));
            item1.add(new ItemEntity("Grupo 1 IOS"));
            item1.add(new ItemEntity("Grupo 1 Firefox OS"));
            item1.add(new ItemEntity("Grupo 1 Otros"));
            items.add(item1);

            //group 2
            List<ItemEntity> item2= new ArrayList<ItemEntity>();
            item2.add(new ItemEntity("Grupo 2 Android"));
            item2.add(new ItemEntity("Grupo 2 IOS"));
            item2.add(new ItemEntity("Grupo 2 Firefox OS"));
            item2.add(new ItemEntity("Grupo 2 Otros"));
            items.add(item2);
            //group 3

            List<ItemEntity> item3= new ArrayList<ItemEntity>();
            item3.add(new ItemEntity("Grupo 3 Android"));
            item3.add(new ItemEntity("Grupo 3 IOS"));
            item3.add(new ItemEntity("Grupo 3 Firefox OS"));
            item3.add(new ItemEntity("Grupo 3 Otros"));
            items.add(item3);

            //group 4
            List<ItemEntity> item4= new ArrayList<ItemEntity>();
            item4.add(new ItemEntity("Grupo 4 Android"));
            item4.add(new ItemEntity("Grupo 4 IOS"));
            item4.add(new ItemEntity("Grupo 4 Firefox OS"));
            item4.add(new ItemEntity("Grupo 4 Otros"));
            items.add(item3);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
