package com.wangmin.java.weatherapp.utils;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;



public class SoftKeyboardUtil {
    
    public static void showSoftKeyboard(View view) {
        if (view == null) {
            return;
        }
        try {
            InputMethodManager imm = (InputMethodManager) view.getContext().getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.showSoftInput(view, InputMethodManager.SHOW_FORCED);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void hideSoftKeyboard(View view) {
        if (view == null) {
            return;
        }
        try {
            ((InputMethodManager) view.getContext().getSystemService(
                Context.INPUT_METHOD_SERVICE)).hideSoftInputFromWindow(
                view.getWindowToken(), 0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
   
    
}
