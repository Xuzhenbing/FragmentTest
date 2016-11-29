package com.bw.zyj.fragmenttest;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * 1.Effect:
 * 2.Author:赵英杰
 * 3.Time:2016/11/29 13:49
 */
public class FragmentTwo extends Fragment{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment2,container, false);

        Log.e("fragment2", "2-----createview");
        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("fragment2", "2-----create");
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.e("fragment2", "2-----attach");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.e("fragment2", "2-----start");
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.e("fragment2", "2-----activitycreated");
    }


    @Override
    public void onResume() {
        super.onResume();
        Log.e("fragment2", "2-----resume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.e("fragment2", "2-----pause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.e("fragment2", "2-----stop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.e("fragment2", "2-----destoryview");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e("fragment2", "2-----destory");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.e("fragment2", "2-----detach");
    }
}
