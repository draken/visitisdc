/**
 * 
 */
package com.abb.visitisdc.fragments.tabs;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;

import com.abb.visitisdc.R;

/**
 * @author marcin
 * 
 */
public abstract class FragmentContentTab extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View tabContent = inflater.inflate(R.layout.fragment_content_tab, container, false);

		setupContentMiddle(inflater, tabContent);

		setupTextBottom(tabContent);

		return tabContent;
	}

	private void setupContentMiddle(LayoutInflater inflater, View tabContent) {
		ScrollView tabContentScroller = (ScrollView) tabContent.findViewById(R.id.tabContentScroller);
		inflater.inflate(getIdTabLayout(), tabContentScroller);
	}

	private void setupTextBottom(View tabContent) {
		TextView textBottom = (TextView) tabContent.findViewById(R.id.textBottom);
		textBottom.setText(getResources().getString(getIdTextBottom()));
	}

	protected abstract int getIdTabLayout();

	protected abstract int getIdTextBottom();
}
