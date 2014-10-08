package ca.bcit.www.weatherclock;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ClockFrag extends android.support.v4.app.Fragment {

    public ClockFrag() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
        Bundle savedInstanceState) {
        View myFragmentView = inflater.inflate(R.layout.fragment_clock, container, false);
        return myFragmentView;
    }

    public static ClockFrag newInstance() {
        ClockFrag cf = new ClockFrag();
        return cf;
    }
}