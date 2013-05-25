/**
 * 
 */
package com.abb.visitisdc.fragments.tabs;

import com.abb.visitisdc.R;

/**
 * @author marcin
 * 
 */
public class FragmentTabCity extends FragmentContentTab {

	@Override
	protected int getIdTextBottom() {
		return R.string.menu_main_city;
	}

	@Override
	protected int getIdTabLayout() {
		return R.layout.view_tab_city;
	}
}
