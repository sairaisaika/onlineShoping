package com.example.onlineShopping.ui.myItems;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MyItemsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public MyItemsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Items fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}