/**
 * 
 */
package com.abb.visitisdc.fragments.tabs;

import com.abb.visitisdc.R;

/**
 * @author marcin
 * 
 */
public class FragmentTabSettings extends FragmentContentTab {

	@Override
	protected int getIdTextBottom() {
		return R.string.menu_main_settings;
	}

	@Override
	protected int getIdTabLayout() {
		return R.layout.view_tab_settings;
	}
}
