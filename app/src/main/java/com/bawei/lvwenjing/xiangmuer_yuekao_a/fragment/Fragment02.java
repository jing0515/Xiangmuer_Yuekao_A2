package com.bawei.lvwenjing.xiangmuer_yuekao_a.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.bawei.lvwenjing.xiangmuer_yuekao_a.MapActivity;
import com.bawei.lvwenjing.xiangmuer_yuekao_a.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment02 extends Fragment {


    public Fragment02() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fragment02, container, false);
        // Inflate the layout for this fragment
        Button bt = (Button) view.findViewById(R.id.bt);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), MapActivity.class));
            }
        });
        return view;

    }

}
