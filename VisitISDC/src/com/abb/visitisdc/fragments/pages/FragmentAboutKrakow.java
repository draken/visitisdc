/**
 * 
 */
package com.abb.visitisdc.fragments.pages;

import com.abb.visitisdc.R;
import com.abb.visitisdc.fragments.FragmentContentMain;

/**
 * @author marcin
 * 
 */
public class FragmentAboutKrakow extends FragmentContentMain {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.abb.visitisdc.fragments.FragmentContentMain#getIdMainLayout()
	 */
	@Override
	protected int getIdMainLayout() {
		return R.layout.view_about_krakow;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.abb.visitisdc.fragments.FragmentContentMain#getIdTextBottom()
	 */
	@Override
	protected int getIdTextBottom() {
		return R.string.about_krakow;
	}

}
