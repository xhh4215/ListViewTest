package com.example.xhh.listviewtest;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by xhh on 2017/11/24.
 */

public class MyArrayAdapter extends ArrayAdapter<Fruit> {
    //    加载的布局资源的id
    private int resourceId;

    // 构造器
    public MyArrayAdapter(@NonNull Context context, int resource, @NonNull List<Fruit> objects) {
        super(context, resource, objects);
        resourceId = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Fruit fruit = getItem(position);
        View view;
        ViewHolder viewHolder;
        if (convertView == null) {
            view = LayoutInflater.from(getContext()).inflate(resourceId, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.name = (TextView) view.findViewById(R.id.text1);
            viewHolder.text = (TextView) view.findViewById(R.id.text2);
            view.setTag(viewHolder);

        } else {
            view = convertView;
            viewHolder = (ViewHolder) view.getTag();
        }

        viewHolder.name.setText(fruit.getName());
        viewHolder.text.setText(fruit.getText());
        return view;

    }

    class ViewHolder {
        public TextView name;
        public TextView text;
    }
}
