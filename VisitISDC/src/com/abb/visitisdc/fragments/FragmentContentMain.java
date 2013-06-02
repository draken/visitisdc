/**
 * 
 */
package com.abb.visitisdc.fragments;

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
public abstract class FragmentContentMain extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View currentView = inflater.inflate(R.layout.fragment_content_main, container, false);

		setupContentMiddle(inflater, currentView);

		setupTextBottom(currentView);

		return currentView;
	}

	private void setupContentMiddle(LayoutInflater inflater, View tabContent) {
		ScrollView tabContentScroller = (ScrollView) tabContent.findViewById(R.id.mainContentScroller);
		inflater.inflate(getIdMainLayout(), tabContentScroller);
	}

	private void setupTextBottom(View tabContent) {
		TextView textBottom = (TextView) tabContent.findViewById(R.id.textBottom);
		textBottom.setText(getResources().getString(getIdTextBottom()));
	}

	protected abstract int getIdMainLayout();

	protected abstract int getIdTextBottom();
}
