/**
 * 
 */
package com.abb.visitisdc.activities.pages;

import android.support.v4.app.Fragment;

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
}
