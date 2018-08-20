package com.example.guoyanwen.my;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.transition.Transition;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    FragmentTransaction transaction;
    //private TextView mTextMessage;
    private NavigationView navigation;
    private FragmentManager fragmentManager;


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            transaction = fragmentManager.beginTransaction();
            switch (item.getItemId()) {
                case R.id.navigation_home:
                   // mTextMessage.setText(R.string.title_home);
                    return true;
                case R.id.navigation_shelf:
                    //mTextMessage.setText(R.string.title_shelf);
                    transaction.add(R.id.layout_content,new Fragment2());
                    transaction.commit();
                    return true;
                case R.id.navigation_topic:
                    //mTextMessage.setText(R.string.title_topic);
                    return true;
                case R.id.navigation_myInfo:
                    transaction.replace(R.id.layout_content,new Fragment4());
                   // mTextMessage.setText(R.string.title_myInfo);
                    transaction.commit();
                    return true;
            }

            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentManager=getSupportFragmentManager();


        //mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        navigation = findViewById(R.id.navigation);

        navigation.setItemHorizontalTranslationEnabled(false);
        navigation.setLabelVisibilityMode(1);
    }

}
