package ca.bcit.www.weatherclock;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;


public class WCPageAdapter extends FragmentStatePagerAdapter {

    private List<Fragment> fraglist;

    public WCPageAdapter(FragmentManager fragman, List<Fragment> fraglist) {
        super(fragman);
        this.fraglist = fraglist;
    }

    @Override
    public Fragment getItem(int position) {
        return this.fraglist.get(position);
    }

    @Override
    public int getCount() {
        return this.fraglist.size();
    }
}

