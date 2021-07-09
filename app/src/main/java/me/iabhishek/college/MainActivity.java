package me.iabhishek.college;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

//    For drawer


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView link = findViewById(R.id.ab);
        link.setText(Html.fromHtml("<a href=https://www.google.com/>Click</a>"));
        link.setMovementMethod(LinkMovementMethod.getInstance());









    }
}