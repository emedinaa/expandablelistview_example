package com.emedinaa.examples.view.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import com.emedinaa.examples.R;
import com.emedinaa.examples.model.entity.GroupEntity;
import com.emedinaa.examples.model.entity.ItemEntity;

import java.util.List;
import java.util.zip.Inflater;

/**
 * Created by emedinaa on 19/03/15.
 */
public class MyAdapter extends BaseExpandableListAdapter
{

    private Context context;
    private LayoutInflater inflater;
    private List<List<ItemEntity>> childItems;
    private List<GroupEntity> parentItems;


    public MyAdapter(Context context,List<GroupEntity> parents, List<List<ItemEntity>> children)
    {
        this.parentItems = parents;
        this.childItems = children;
        this.context= context;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public View getChildView(int group, int child, boolean b, View convertView, ViewGroup viewGroup)
    {

        List<ItemEntity> aux= childItems.get(group);

        if (convertView == null) {
            convertView = inflater.inflate(R.layout.row_item, null);
        }
        TextView tviItem= (TextView) convertView.findViewById(R.id.tviItem);
        tviItem.setText("Item "+child+" "+ aux.get(child).getName());

        return convertView;
    }

    @Override
    public View getGroupView(int i, boolean b, View convertView, ViewGroup viewGroup) {
        if(convertView==null)
        {
            convertView= inflater.inflate(R.layout.row_group,null);
        }
        TextView tviGroup= (TextView)convertView.findViewById(R.id.tviGroup);
        //tviGroup.setText(parentItems.get(i).getName());
        tviGroup.setText("Group "+i+" "+ parentItems.get(i).getName());

        return convertView;
    }

    @Override
    public long getChildId(int i, int i2) {
        return 0;
    }


    @Override
    public int getChildrenCount(int i) {
        return ((List<ItemEntity>)(childItems.get(i))).size();
    }


    @Override
    public Object getGroup(int i) {
        return null;
    }

    @Override
    public int getGroupCount() {
        return parentItems.size();
    }



    @Override
    public Object getChild(int i, int i2) {
        return null;
    }


    @Override
    public long getGroupId(int i) {
        return 0;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public boolean isChildSelectable(int i, int i2) {
        return false;
    }
}
