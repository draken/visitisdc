/**
 * 
 */
package com.abb.visitisdc.activities.pages;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.Fragment;
import android.view.View;

import com.abb.visitisdc.R;
import com.abb.visitisdc.activities.PageActivity;
import com.abb.visitisdc.fragments.pages.FragmentAboutKrakow;

/**
 * @author marcin
 * 
 */
public class AboutKrakow extends PageActivity {

	@Override
	protected Fragment getContentFragment() {
		return new FragmentAboutKrakow();
	}

	public void onClickGoToKrakowWebsite(View v) {
		Uri uri = Uri.parse(getResources().getString(R.string.about_krakow_website_link));
		Intent intent = new Intent(Intent.ACTION_VIEW, uri);
		startActivity(intent);
	}
}
