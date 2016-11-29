package com.bw.zyj.fragmenttest;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * 1.Effect:
 * 2.Author:赵英杰
 * 3.Time:2016/11/29 13:49
 */
public class FragmentOne extends Fragment{
    private TextView txt;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment1,container, false);

        txt = (TextView) view.findViewById(R.id.txt1);

        Log.e("fragment1", "1-----createview");
        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("fragment1", "1-----create");
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.e("fragment1", "1-----attach");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.e("fragment1", "1-----start");
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        Bundle bundle = getArguments();
        if(bundle != null){
            txt.setText(bundle.getString("测试"));
        }



        Log.e("fragment1", "1-----activitycreated");
    }


    @Override
    public void onResume() {
        super.onResume();
        Log.e("fragment1", "1-----resume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.e("fragment1", "1-----pause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.e("fragment1", "1-----stop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.e("fragment1", "1-----destoryview");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e("fragment1", "1-----destory");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.e("fragment1", "1-----detach");
    }
}
