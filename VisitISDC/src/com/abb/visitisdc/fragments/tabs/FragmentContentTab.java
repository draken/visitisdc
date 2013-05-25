/**
 * 
 */
package com.abb.visitisdc.fragments.tabs;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.abb.visitisdc.R;

/**
 * @author marcin
 * 
 */
public abstract class FragmentContentTab extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View tabContent = inflater.inflate(R.layout.fragment_tab_content, container, false);

		TextView textBottom = (TextView) tabContent.findViewById(R.id.textBottom);
		textBottom.setText(getResources().getString(getIdTextBottom()));

		return tabContent;
	}

	protected abstract int getIdTextBottom();
}
