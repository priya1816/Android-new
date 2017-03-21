package com.priya.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;



public class MenuFragment extends Fragment {
    public static final String TAG = MenuFragment.class.getCanonicalName();


    public MenuFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.fragment_menu, container, false);

        final ListView listView = ((ListView) rootView.findViewById(R.id.listView));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.i(TAG, "CLicked Item "+listView.getAdapter().getItem(position));
                loadFragment(""+listView.getAdapter().getItem(position));
            }
        });

        return rootView;
    }

    private void loadFragment(String item) {

        MainActivity hostActivity = (MainActivity) getActivity();

        if(item.equals("car")) hostActivity.loadFragment(R.drawable.ic_car);
        else if(item.equals("helicopter")) hostActivity.loadFragment(R.drawable.ic_helicopter);
        else if(item.equals("school_bus")) hostActivity.loadFragment(R.drawable.ic_school_bus);
        else if(item.equals("smile")) hostActivity.loadFragment(R.drawable.ic_smile);
        else hostActivity.loadFragment(R.drawable.ic_stethoscope);
    }


}


