package com.example.databinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;


import android.os.Bundle;
import android.widget.Toast;

import com.example.databinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements ClickHandler{

    private ActivityMainBinding binding;
    private ClickHandler clickHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setUser(new User("DataBinding User"));
        binding.setHandler(this);

        }


    @Override
    public void onButtonClick(User user) {
        Toast.makeText(MainActivity.this,"Welcome " + user.getName(),Toast.LENGTH_LONG).show();
    }
}
