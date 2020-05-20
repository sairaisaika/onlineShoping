package com.example.onlineshoping.ui.myItems;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class myItemsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public myItemsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Items fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}