package com.ely.androidlatihan4fragment;

import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.ViewGroup;

import com.ely.androidlatihan4fragment.allfragment.kedua;
import com.ely.androidlatihan4fragment.allfragment.keempat;
import com.ely.androidlatihan4fragment.allfragment.kelima;
import com.ely.androidlatihan4fragment.allfragment.ketiga;
import com.ely.androidlatihan4fragment.allfragment.pertama;

public class NavBottomAdapter extends FragmentPagerAdapter {
    final int RG = 5;
    private Fragment currentFragment;

    public NavBottomAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        switch (i){
            case 0: {
                currentFragment = pertama.newInstance(0);
            }break;
            case 1: {
                currentFragment = kedua.newInstance(1);
            }break;
            case 2: {
                currentFragment = ketiga.newInstance(2);
            }break;
            case 3: {
                currentFragment = keempat.newInstance(3);
            }break;
            case 4:{
                currentFragment = kelima.newInstance(4);
            }
        }
        return currentFragment;
    }

    @Override
    public int getCount() {
        return RG;
    }

    @Override
    public void setPrimaryItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        super.setPrimaryItem(container, position, object);
    }
    public Fragment getCurrentFragment(){return currentFragment;}
}
