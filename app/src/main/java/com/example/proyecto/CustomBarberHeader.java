package com.example.proyecto;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

public class CustomBarberHeader extends ConstraintLayout {

    private ImageView barberIcon;
    private TextView textView;
    private ImageView userIcon;

    public CustomBarberHeader(Context context) {
        super(context);
        init(context);
    }

    public CustomBarberHeader(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public CustomBarberHeader(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    private void init(Context context) {
        LayoutInflater.from(context).inflate(R.layout.barber_menu, this, true);
        barberIcon = findViewById(R.id.barberIcon);
        textView = findViewById(R.id.textView);
        userIcon = findViewById(R.id.User);
    }
    public void setBarberText(String text) {
        textView.setText(text);
    }
}
