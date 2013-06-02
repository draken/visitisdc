/**
 * 
 */
package com.abb.visitisdc.fragments.tabs;

import com.abb.visitisdc.R;
import com.abb.visitisdc.fragments.FragmentContentMain;

/**
 * @author marcin
 * 
 */
public class FragmentTabOffice extends FragmentContentMain {

	@Override
	protected int getIdTextBottom() {
		return R.string.menu_main_office;
	}

	@Override
	protected int getIdMainLayout() {
		return R.layout.view_tab_office;
	}
}
