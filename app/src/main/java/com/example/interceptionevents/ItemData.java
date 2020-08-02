package com.example.interceptionevents;

import android.graphics.drawable.Drawable;
import android.widget.Button;

public class ItemData {
    private Drawable image;
    private String title;
    private String subtitle;
    private Button butDelete;

    public ItemData(Drawable image, String title, String subtitle, Button butDelete) {
        this.image = image;
        this.title = title;
        this.subtitle = subtitle;
        this.butDelete = butDelete;

    }

    public Drawable getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public Button getButton() {
        return butDelete;
    }
}