package com.levibostian.androiddevbuddy.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.levibostian.androiddevbuddy.R;
import com.levibostian.androiddevbuddy.vo.ActionBarIconVo;

import java.util.ArrayList;
import java.util.List;

public class ActionBarIconsListAdapter extends ArrayAdapter<ActionBarIconVo> {

    private Context mContext;
    private ArrayList<ActionBarIconVo> mActionBarItems;

    public ActionBarIconsListAdapter(Context context, int resource, List<ActionBarIconVo> objects) {
        super(context, resource, objects);

        mContext = context;
        mActionBarItems = (ArrayList<ActionBarIconVo>) objects;
    }

    static class ViewHolder {
        public ImageView actionBarIconImage;
        public TextView actionBarIconName;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View rowView = convertView;

        if (rowView == null) {
            LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            rowView = inflater.inflate(R.layout.adapter_actionbar_icons_list, parent, false);

            ViewHolder viewHolder = new ViewHolder();
            viewHolder.actionBarIconImage = (ImageView) rowView.findViewById(R.id.action_bar_icon_imageview);
            viewHolder.actionBarIconName = (TextView) rowView.findViewById(R.id.action_bar_icon_textview);

            rowView.setTag(viewHolder);
        }

        ViewHolder viewHolder = (ViewHolder) rowView.getTag();

        final ActionBarIconVo actionBarIconItem = mActionBarItems.get(position);

        viewHolder.actionBarIconImage.setImageResource(actionBarIconItem.getActionBarIconRes());
        viewHolder.actionBarIconName.setText(actionBarIconItem.getActionBarIconName());

        return rowView;
    }
}
