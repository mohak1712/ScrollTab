package com.example.xfactor.scrolltab;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends ActionBarActivity {
    ViewPager pager = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pager = (ViewPager) findViewById(R.id.pager);
        FragmentManager manager = getSupportFragmentManager();
        pager.setAdapter(new MyAdapter(manager));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

 class MyAdapter extends FragmentStatePagerAdapter {

     public MyAdapter(FragmentManager fm) {
         super(fm);
     }

     @Override
     public Fragment getItem(int i) {
        Fragment fragment2 = null;
         if(i==0)
         {
           FragmentA  fragment = new FragmentA();
             return fragment;
         }

         if(i==1)
         {
             FragmentB  fragment = new FragmentB();
             return fragment;
         }

         if(i==2)
         {
             FragmentC  fragment = new FragmentC();
             return fragment;
         }
         return null;
     }

     @Override
     public int getCount() {
         return 3;
     }

     @Override
     public CharSequence getPageTitle(int position) {
         if(position==0)
         {
             return "Tab1";
         }
         if(position==1)
         {
             return  "Tab2";

         }
         if (position==2)
         {
             return  "Tab3";
         }
         else
         return null;
     }
 }

