package ca.bcit.www.weatherclock;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class WC_Main2 extends FragmentActivity {

    public WCPageAdapter pageAdapter;

    @Override

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wc_main2);

        List<Fragment> fragments = getFragments();
        pageAdapter = new WCPageAdapter(getSupportFragmentManager(), fragments);
        ViewPager pager = (ViewPager) findViewById(R.id.vpager_top);
        pager.setAdapter(pageAdapter);

    }

    private List<Fragment> getFragments () {
        List<Fragment> fList = new ArrayList<Fragment>();
        fList.add(ClockFrag.newInstance());
        fList.add(AlarmsFrag.newInstance());
        return fList;
    }

    public void manageAlarms(View v)
    {
        Intent intent = new Intent(this, AlarmListActivity.class);
        startActivity(intent);

    }

    public void oneDayFullScreen(View v)
    {
        Intent intent = new Intent(this, Forecast_Single.class);
        Bundle weatherBundle = new Bundle();
        //TODO: Get all the weather strings from the clicked day, put them in a bundle.
        startActivity(intent);

    }
}

