package com.plat.brown;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager2 viewPager2 = findViewById(R.id.view_pager);
        SignUpAdapter signUpAdapter = new SignUpAdapter(this);
        viewPager2.setAdapter(signUpAdapter);
        viewPager2.setUserInputEnabled(false);

        TabLayout tabLayout = findViewById(R.id.tab_layout);

        new TabLayoutMediator(tabLayout, viewPager2, true, false, (tab, i) -> {
            if (i==0){
                tab.setText("Email");
            }else {
                tab.setText("Phone");
            }
        }).attach();
    }
}