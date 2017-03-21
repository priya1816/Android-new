package com.priya.fragment2;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;


public class DashFragment extends Fragment {

    public static DashFragment fragment(){
        return new DashFragment();
    }


    public DashFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.fragment_dash, container, false);
        ((ListView)rootView.findViewById(R.id.listCourses)).setOnItemClickListener(this::onItemClick);

        return rootView;
    }

    private void onItemClick(AdapterView<?> adapterView, View view, int pos, long id) {
        String course = (String) adapterView.getAdapter().getItem(pos);

                 ((MainActivity)getActivity()).loadFragment(DesFragment.fragment());

    }

}
