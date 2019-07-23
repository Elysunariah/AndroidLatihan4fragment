package com.ely.androidlatihan4fragment.allfragment;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ely.androidlatihan4fragment.R;

import java.util.ArrayList;
import java.util.List;

public class kelima extends Fragment {
     public static kelima newInstance(int id) {
         kelima fr = new kelima();
         Bundle b = new Bundle();
         fr.setArguments(b);
         return fr;
     }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        List<String> data = new ArrayList<>();
        data.add("indonesia");
        data.add("singapore");
        data.add("malaysia");
        data.add("thailand");
        data.add("amerika");
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View views = inflater.inflate(R.layout.fr_lima,
                container, false);
        return views;
    }
}
