package com.hlxz.librarybecan;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

public class TutorialActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.app_tutorial);

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.navigation_bar);
        BottomNavigationViewHelper.disableShiftMode(bottomNavigationView);
        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(2);
        menuItem.setChecked(true);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.navigation_navigation:
                        Intent intent_navigation = new Intent(TutorialActivity.this, MainActivity.class);
                        startActivity(intent_navigation);
                        overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out);
                        break;
                    case R.id.navigation_search:
                        Intent intent_search = new Intent(TutorialActivity.this, SearchActivity.class);
                        startActivity(intent_search);
                        overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out);
                        break;
                    case R.id.navigation_tutorial:
                        break;
                    case R.id.navigation_function:
                        Intent intent_function = new Intent(TutorialActivity.this, FunctionActivity.class);
                        startActivity(intent_function);
                        overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out);
                        break;
                    case R.id.navigation_adjust:
                        Intent intent_adjust = new Intent(TutorialActivity.this, AdjustActivity.class);
                        startActivity(intent_adjust);
                        overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out);
                        break;
                }
                return false;
            }
        });
    }
}


