package com.ely.androidlatihan4fragment.allfragment;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.Switch;

import com.ely.androidlatihan4fragment.R;

public class ketiga extends Fragment {
     public static ketiga newInstance(int id) {
         ketiga fr = new ketiga();
         Bundle b = new Bundle();
         fr.setArguments(b);
         return fr;
     }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View views = inflater.inflate(R.layout.fr_tiga,
                container, false);
        return views;


                }
            }





