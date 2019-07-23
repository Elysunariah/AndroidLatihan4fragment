package com.ely.androidlatihan4fragment.allfragment;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ely.androidlatihan4fragment.R;

public class pertama extends Fragment {
     public static pertama newInstance(int id) {
         pertama fr = new pertama();
         Bundle b = new Bundle();
         fr.setArguments(b);
         return fr;
     }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View views = inflater.inflate(R.layout.fr_satu,
                container, false);
        return views;
    }
}
