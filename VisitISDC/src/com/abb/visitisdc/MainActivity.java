package com.abb.visitisdc;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTabHost;
import android.view.Menu;
import android.view.View;
import android.widget.TabHost;
import android.widget.TextView;

import com.abb.visitisdc.fragments.tabs.FragmentTabCity;
import com.abb.visitisdc.fragments.tabs.FragmentTabExplore;
import com.abb.visitisdc.fragments.tabs.FragmentTabNavigate;
import com.abb.visitisdc.fragments.tabs.FragmentTabOffice;
import com.abb.visitisdc.fragments.tabs.FragmentTabSettings;

public class MainActivity extends FragmentActivity {
	private FragmentTabHost mTabHost;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		createTabs();
	}

	private void createTabs() {
		mTabHost = (FragmentTabHost) findViewById(android.R.id.tabhost);
		mTabHost.setup(this, getSupportFragmentManager(), R.id.realtabcontent);
		mTabHost.setOnTabChangedListener(new TabHost.OnTabChangeListener() {

			@Override
			public void onTabChanged(String tabId) {
				setTabIndicatorColors();
			}
		});

		Resources res = getResources();

		mTabHost.addTab(
				mTabHost.newTabSpec("city").setIndicator(res.getString(R.string.menu_main_city),
						res.getDrawable(R.drawable.ic_menu_main_city)), FragmentTabCity.class, null);
		mTabHost.addTab(
				mTabHost.newTabSpec("office").setIndicator(res.getString(R.string.menu_main_office),
						res.getDrawable(R.drawable.ic_menu_main_city)), FragmentTabOffice.class, null);
		mTabHost.addTab(
				mTabHost.newTabSpec("explore").setIndicator(res.getString(R.string.menu_main_explore),
						res.getDrawable(R.drawable.ic_menu_main_city)), FragmentTabExplore.class, null);
		mTabHost.addTab(
				mTabHost.newTabSpec("navigate").setIndicator(res.getString(R.string.menu_main_navigate),
						res.getDrawable(R.drawable.ic_menu_main_city)), FragmentTabNavigate.class, null);
		mTabHost.addTab(
				mTabHost.newTabSpec("settings").setIndicator(res.getString(R.string.menu_main_settings),
						res.getDrawable(R.drawable.ic_menu_main_city)), FragmentTabSettings.class, null);

		setTabIndicatorSize();
		setTabIndicatorColors();
	}

	private void setTabIndicatorSize() {
		for (int i = 0; i < mTabHost.getTabWidget().getChildCount(); i++) {
			View childAt = mTabHost.getTabWidget().getChildAt(i);
			childAt.setPadding(0, 0, 0, 0);
		}
	}

	private void setTabIndicatorColors() {
		Resources res = getResources();
		for (int i = 0; i < mTabHost.getTabWidget().getChildCount(); i++) {
			TextView tv = (TextView) mTabHost.getTabWidget().getChildAt(i).findViewById(android.R.id.title);
			tv.setTextColor(res.getColor(android.R.color.tab_indicator_text));
		}
		TextView tv = (TextView) mTabHost.getCurrentTabView().findViewById(android.R.id.title); // for Selected Tab
		tv.setTextColor(res.getColor(android.R.color.white));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public void onClickAboutKrakow(View v) {
		bkgFlicker(v);
	}

	private void bkgFlicker(View v) {
		v.setBackgroundColor(getResources().getColor(android.R.color.background_light));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		v.setBackgroundColor(getResources().getColor(android.R.color.background_dark));
	}
}
