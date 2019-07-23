package com.ely.androidlatihan4fragment.allfragment;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;

import com.ely.androidlatihan4fragment.R;

public class kedua extends Fragment {
    public static kedua newInstance(int id) {
        kedua fr = new kedua();
        Bundle b = new Bundle();
        fr.setArguments(b);
        return fr;
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View views = inflater.inflate(R.layout.fr_dua, container, false);
        return views;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);



    }

    public void welcome(View v){
        switch (v.getId()) {
            case R.id.kdua: {
                Toast.makeText(getContext(), "kedua", Toast.LENGTH_SHORT).show();
            }
            default:
                //
        }
    }
}



