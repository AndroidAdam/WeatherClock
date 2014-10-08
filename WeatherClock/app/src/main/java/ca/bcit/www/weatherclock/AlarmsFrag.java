package ca.bcit.www.weatherclock;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class AlarmsFrag extends android.support.v4.app.Fragment {

    public AlarmsFrag() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
        Bundle savedInstanceState) {
        View myFragmentView = inflater.inflate(R.layout.fragment_alarms, container, false);
        return myFragmentView;
    }

    public static AlarmsFrag newInstance() {
        AlarmsFrag af = new AlarmsFrag();
        return af;
    }
}