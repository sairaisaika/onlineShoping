package com.example.onlineshoping.ui.conversation;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ConversationViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ConversationViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is conversation fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}