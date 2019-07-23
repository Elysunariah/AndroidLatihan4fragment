package com.ely.androidlatihan4fragment;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.aurelhubert.ahbottomnavigation.AHBottomNavigation;
import com.aurelhubert.ahbottomnavigation.AHBottomNavigationAdapter;
import com.aurelhubert.ahbottomnavigation.AHBottomNavigationItem;
import com.aurelhubert.ahbottomnavigation.AHBottomNavigationViewPager;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    AHBottomNavigationViewPager viewPager;
    AHBottomNavigation bottomNavigation;
            AHBottomNavigationAdapter navigationAdapter;
            Fragment currenFragment;
            NavBottomAdapter navBottomAdapter;
            boolean useMenuResource = true;
            int[] tabcolors;
            ArrayList<AHBottomNavigationItem> bottomNavigationItems = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = findViewById(R.id.view_pager);
        bottomNavigation = findViewById(R.id.bottomNav);

        initUI();

    }

    private void initUI(){
        if (useMenuResource){
            tabcolors = getApplicationContext().getResources()
                    .getIntArray(R.array.tab_colors);
            navigationAdapter = new AHBottomNavigationAdapter(MainActivity.this,
                    R.menu.bottom_menu);
            navigationAdapter.setupWithBottomNavigation(bottomNavigation, tabcolors);
        }else {
            AHBottomNavigationItem item1 = new AHBottomNavigationItem("tab 1",
                    R.mipmap.ic_launcher, R.color.colorPrimary);
            AHBottomNavigationItem item2 = new AHBottomNavigationItem("tab 2",
                    R.mipmap.ic_launcher, R.color.colorPrimaryDark);
            AHBottomNavigationItem item3 = new AHBottomNavigationItem("tab 3",
                    R.mipmap.ic_launcher, R.color.colorPrimaryDark);
            AHBottomNavigationItem item4 = new AHBottomNavigationItem("tab 4",
                    R.mipmap.ic_launcher, R.color.colorPrimaryDark);
            AHBottomNavigationItem item5 = new AHBottomNavigationItem("tab 5",
                    R.mipmap.ic_launcher, R.color.colorPrimaryDark);
            bottomNavigationItems.add(item1);
            bottomNavigationItems.add(item2);
            bottomNavigationItems.add(item3);
            bottomNavigationItems.add(item4);
            bottomNavigationItems.add(item5);

            bottomNavigation.addItems(bottomNavigationItems);
        }

        bottomNavigation.setOnTabSelectedListener(new AHBottomNavigation.OnTabSelectedListener() {
            @Override
            public boolean onTabSelected(int position, boolean wasSelected) {
                if (currenFragment == null){
                    currenFragment = navBottomAdapter.getCurrentFragment();
                }

                viewPager.setCurrentItem(position, false);
                if (currenFragment == null){
                    return true;
                }
                currenFragment = navBottomAdapter.getCurrentFragment();
                return true;
            }
        });
        viewPager.setOffscreenPageLimit(4);
        navBottomAdapter = new NavBottomAdapter(getSupportFragmentManager());
        viewPager.setAdapter(navBottomAdapter);
        currenFragment = navBottomAdapter.getCurrentFragment();

    }
}
