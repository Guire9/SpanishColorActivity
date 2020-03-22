package edu.temple.coloractivity;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class CanvasFragment extends Fragment {

    private static final String ID_color = "color";
    private View layout;
    int colorNum;

    public CanvasFragment() {
        // Required empty public constructor
    }
    public static CanvasFragment newInstance (int x) {
        CanvasFragment fragment = new CanvasFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(ID_color, x);
        fragment.setArguments(bundle);
        return fragment;
    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle bundle = getArguments();
        if (bundle != null) {
            colorNum = bundle.getInt(ID_color);
        }
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        layout =inflater.inflate(R.layout.fragment_canvas, container, false);
        changeColor2(colorNum);
        return layout;
    }
    public void changeColor2(int colorNum) {
        layout.setBackgroundColor(colorNum);
        CanvasFragment.newInstance(colorNum);
    }

    public int getFragmentId() {
        return colorNum;
    }
}
