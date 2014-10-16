package ca.bcit.www.weatherclock;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextClock;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class ClockFrag extends android.support.v4.app.Fragment {

    private TextClock clock;

    public ClockFrag() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View myFragmentView = inflater.inflate(R.layout.fragment_clock, container, false);
        clock = (TextClock) getActivity().findViewById(R.id.textClock);
        return myFragmentView;
    }

    public static ClockFrag newInstance() {
        ClockFrag cf = new ClockFrag();
        return cf;
    }
}