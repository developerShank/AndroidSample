package com.example.viewmodel;

import android.text.TextUtils;

import androidx.lifecycle.ViewModel;

import java.util.Random;

public class MainActivityViewModel extends ViewModel {

    private String randomNumber;

    public String getRandomNumber() {
        if (TextUtils.isEmpty(randomNumber)) {
            createRandomNumber();
        }
        return randomNumber;
    }

    private void createRandomNumber() {
        Random random = new Random();
        randomNumber = "Number: " + (random.nextInt(10 - 1) + 1);
    }
}
