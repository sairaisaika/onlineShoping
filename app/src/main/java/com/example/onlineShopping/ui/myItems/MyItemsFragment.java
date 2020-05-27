package com.example.onlineShopping.ui.myItems;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.onlineShopping.R;

public class MyItemsFragment extends Fragment {

    private MyItemsViewModel myItemsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        myItemsViewModel =
                ViewModelProviders.of(this).get(MyItemsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_my_items, container, false);
        final TextView textView = root.findViewById(R.id.text_my_items);
        myItemsViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}