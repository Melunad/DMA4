package com.example.four;

public class MuzeiListItem {
    private final int imageRes;
    private final String textMuzeiName;

    public MuzeiListItem(int imageRes, String textUserName) {
        this.imageRes = imageRes;
        this.textMuzeiName = textUserName;
    }

    public int getImageRes() {
        return imageRes;
    }

    public String getTextUserName() {
        return textMuzeiName;
    }
}

