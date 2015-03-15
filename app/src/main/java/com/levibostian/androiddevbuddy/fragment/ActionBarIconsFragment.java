package com.levibostian.androiddevbuddy.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.levibostian.androiddevbuddy.R;
import com.levibostian.androiddevbuddy.adapter.ActionBarIconsListAdapter;
import com.levibostian.androiddevbuddy.vo.ActionBarIconVo;

import java.util.ArrayList;

public class ActionBarIconsFragment extends Fragment {

    private ListView mActionBarIconsList;

    public static ActionBarIconsFragment newInstance() {
        ActionBarIconsFragment fragment = new ActionBarIconsFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_action_bar_icons, container, false);

        mActionBarIconsList = (ListView) view.findViewById(R.id.icons_listview);
        setupViews();

        return view;
    }

    private void setupViews() {
        ArrayList<ActionBarIconVo> actionBarIcons = getActionBarIcons();

        ActionBarIconsListAdapter adapter = new ActionBarIconsListAdapter(getActivity(),
                                                                          R.layout.adapter_actionbar_icons_list,
                                                                          actionBarIcons);

        mActionBarIconsList.setAdapter(adapter);
    }

    public ArrayList<ActionBarIconVo> getActionBarIcons() {
        ArrayList<ActionBarIconVo> actionBarIcons = new ArrayList<ActionBarIconVo>();

        return actionBarIcons;
    }
}