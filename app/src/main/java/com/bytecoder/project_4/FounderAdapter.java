package com.bytecoder.project_4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class FounderAdapter extends BaseAdapter {

    Context context;
    List<Founder> founderList;

    public FounderAdapter(Context context, List<Founder> founderList) {
        this.context = context;
        this.founderList = founderList;
    }

    @Override
    public int getCount() {
        return founderList.size();
    }

    @Override
    public Object getItem(int position) {
        return founderList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Founder founder = founderList.get(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.grid_item, parent, false);
        }

        ImageView imageView = convertView.findViewById(R.id.founderImage);
        TextView nameView = convertView.findViewById(R.id.founderName);

        imageView.setImageResource(founder.imageResId);
        nameView.setText(founder.name);

        return convertView;
    }
}
