package pl.edu.pwr.lab4.i242571.ui.main;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import pl.edu.pwr.lab4.i242571.R;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.tab_text_events, R.string.tab_text_places, R.string.tab_text_accommodations, R.string.tab_text_guided};
    private final Context mContext;
    private String language;

    public SectionsPagerAdapter(Context context, FragmentManager fm, String language) {
        super(fm);
        mContext = context;
        this.language = language;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new EventFragment(language);
            case 1:
                return new PlaceFragment(language);
            case 2:
                return new AccommodationFragment(language);
            case 3:
                return new TourFragment(language);
            default:
                return PlaceholderFragment.newInstance(position + 1);
        }
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getResources().getString(TAB_TITLES[position]);
    }

    @Override
    public int getCount() {
        return 4;
    }
}