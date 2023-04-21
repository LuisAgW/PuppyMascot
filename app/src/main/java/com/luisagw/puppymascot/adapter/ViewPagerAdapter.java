package com.luisagw.puppymascot.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.luisagw.puppymascot.fragment.HomeFragment;
import com.luisagw.puppymascot.fragment.MyMascotFragment;

public class ViewPagerAdapter extends FragmentStateAdapter {

    public ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new HomeFragment();
            case 1:
                return new MyMascotFragment();
            default:
                return new HomeFragment();
         }
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
