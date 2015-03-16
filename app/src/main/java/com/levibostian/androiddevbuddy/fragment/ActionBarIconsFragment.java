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

        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_accept, "01_core_accept"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_call, "01_core_call"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_cancel, "01_core_cancel"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_copy, "01_core_copy"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_cut, "01_core_cut"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_discard, "01_core_discard"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_edit, "01_core_edit"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_new, "01_core_new"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_overflow, "01_core_overflow"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_paste, "01_core_paste"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_refresh, "01_core_refresh"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_remove, "01_core_remove"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_search, "01_core_search"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_select_all, "01_core_select_all"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_share, "01_core_share"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_undo, "01_core_undo"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_back, "02_navigation_back"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_collapse, "02_navigation_collapse"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_expand, "02_navigation_expand"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_forward, "02_navigation_forward"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_next_item, "02_navigation_next_item"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_previous_item, "02_navigation_previous_item"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_bad, "03_rating_bad"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_favorite, "03_rating_favorite"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_good, "03_rating_good"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_half_important, "03_rating_half_important"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_important, "03_rating_important"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_not_important, "03_rating_not_important"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_cloud, "04_collections_cloud"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_collection, "04_collections_collection"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_go_to_today, "04_collections_go_to_today"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_labels, "04_collections_labels"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_new_label, "04_collections_new_label"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_sort_by_size, "04_collections_sort_by_size"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_view_as_grid, "04_collections_view_as_grid"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_view_as_list, "04_collections_view_as_list"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_attachment, "05_content_attachment"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_backspace, "05_content_backspace"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_email, "05_content_email"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_event, "05_content_event"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_import_export, "05_content_import_export"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_merge, "05_content_merge"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_new_attachment, "05_content_new_attachment"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_new_email, "05_content_new_email"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_new_event, "05_content_new_event"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_new_picture, "05_content_new_picture"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_picture, "05_content_picture"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_read, "05_content_read"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_save, "05_content_save"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_split, "05_content_split"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_unread, "05_content_unread"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_add_group, "06_social_add_group"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_add_person, "06_social_add_person"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_cc_bcc, "06_social_cc_bcc"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_chat, "06_social_chat"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_forward, "06_social_forward"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_group, "06_social_group"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_person, "06_social_person"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_reply, "06_social_reply"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_reply_all, "06_social_reply_all"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_send_now, "06_social_send_now"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_directions, "07_location_directions"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_location_found, "07_location_location_found"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_location_off, "07_location_location_off"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_location_searching, "07_location_location_searching"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_map, "07_location_map"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_place, "07_location_place"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_web_site, "07_location_web_site"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_camera, "08_camera_camera"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_crop, "08_camera_crop"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_flash_automatic, "08_camera_flash_automatic"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_flash_off, "08_camera_flash_off"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_flash_on, "08_camera_flash_on"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_mic, "08_camera_mic"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_mic_muted, "08_camera_mic_muted"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_rotate_left, "08_camera_rotate_left"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_rotate_right, "08_camera_rotate_right"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_switch_camera, "08_camera_switch_camera"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_switch_video, "08_camera_switch_video"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_video, "08_camera_video"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_add_to_queue, "09_media_add_to_queue"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_cast, "09_media_cast"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_download, "09_media_download"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_fast_forward, "09_media_fast_forward"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_full_screen, "09_media_full_screen"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_make_available_offline, "09_media_make_available_offline"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_next, "09_media_next"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_pause, "09_media_pause"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_pause_over_video, "09_media_pause_over_video"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_play, "09_media_play"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_play_over_video, "09_media_play_over_video"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_previous, "09_media_previous"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_repeat, "09_media_repeat"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_replay, "09_media_replay"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_return_from_full_screen, "09_media_return_from_full_screen"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_rewind, "09_media_rewind"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_shuffle, "09_media_shuffle"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_slideshow, "09_media_slideshow"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_stop, "09_media_stop"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_upload, "09_media_upload"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_volume_muted, "09_media_volume_muted"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_volume_on, "09_media_volume_on"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_accounts, "10_device_access_accounts"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_add_alarm, "10_device_access_add_alarm"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_airplane_mode_off, "10_device_access_airplane_mode_off"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_airplane_mode_on, "10_device_access_airplane_mode_on"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_alarms, "10_device_access_alarms"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_battery, "10_device_access_battery"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_bightness_low, "10_device_access_bightness_low"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_bluetooth, "10_device_access_bluetooth"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_bluetooth_connected, "10_device_access_bluetooth_connected"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_bluetooth_searching, "10_device_access_bluetooth_searching"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_brightness_auto, "10_device_access_brightness_auto"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_brightness_high, "10_device_access_brightness_high"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_brightness_medium, "10_device_access_brightness_medium"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_data_usage, "10_device_access_data_usage"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_dial_pad, "10_device_access_dial_pad"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_end_call, "10_device_access_end_call"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_network_cell, "10_device_access_network_cell"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_network_wifi, "10_device_access_network_wifi"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_new_account, "10_device_access_new_account"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_not_secure, "10_device_access_not_secure"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_ring_volume, "10_device_access_ring_volume"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_screen_locked_to_landscape, "10_device_access_screen_locked_to_landscape"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_screen_locked_to_portrait, "10_device_access_screen_locked_to_portrait"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_screen_rotation, "10_device_access_screen_rotation"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_sd_storage, "10_device_access_sd_storage"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_secure, "10_device_access_secure"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_storage, "10_device_access_storage"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_time, "10_device_access_time"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_usb, "10_device_access_usb"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_computer, "11_hardware_computer"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_dock, "11_hardware_dock"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_gamepad, "11_hardware_gamepad"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_headphones, "11_hardware_headphones"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_headset, "11_hardware_headset"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_keyboard, "11_hardware_keyboard"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_mouse, "11_hardware_mouse"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_phone, "11_hardware_phone"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_error, "12_alerts_and_states_error"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_warning, "12_alerts_and_states_warning"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_about, "13_extra_actions_about"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_help, "13_extra_actions_help"));
        actionBarIcons.add(new ActionBarIconVo(R.mipmap.ic_action_settings, "13_extra_actions_settings"));

        return actionBarIcons;
    }
}