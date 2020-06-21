package com.example.carriercafe;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PagerAdapter extends FragmentPagerAdapter {
    private Context context;
    private int size;
    private FragmentPagerAdapter fragmentPagerAdapter;

    public PagerAdapter(@NonNull FragmentManager fm, Context context, int size) {
        super(fm);
        this.context = context;
        this.size = size;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                RecentFragment recentFragment=new RecentFragment();
                return recentFragment;

            case 1:
                HomeFragment homeFragment=new HomeFragment();
                return homeFragment;
            default:

                Toast.makeText(context,"Something went wrong",Toast.LENGTH_SHORT).show();
                return null;
        }

    }

    @Override
    public int getCount() {
        return size;
    }
}
