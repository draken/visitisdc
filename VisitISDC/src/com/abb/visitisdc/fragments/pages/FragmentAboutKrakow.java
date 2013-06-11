/**
 * 
 */
package com.abb.visitisdc.fragments.pages;

import us.feras.ecogallery.EcoGallery;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;

import com.abb.visitisdc.R;
import com.abb.visitisdc.fragments.FragmentContentMain;
import com.abb.visitisdc.fragments.utils.GallerySpinnerAdapter;

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

	@Override
	protected void setupContentMiddle(LayoutInflater inflater, View tabContent) {
		super.setupContentMiddle(inflater, tabContent);

		setupGalleryView(tabContent);

	}

	private void setupGalleryView(View tabContent) {
		EcoGallery gallery = (EcoGallery) tabContent.findViewById(R.id.images_about_krakow);
		Resources resources = getResources();
		GallerySpinnerAdapter adapter = new GallerySpinnerAdapter(gallery.getContext(),
				resources.getDrawable(R.drawable.im_about_krakow0), resources.getDrawable(R.drawable.im_about_krakow1),
				resources.getDrawable(R.drawable.im_about_krakow2), resources.getDrawable(R.drawable.im_about_krakow3),
				resources.getDrawable(R.drawable.im_about_krakow4), resources.getDrawable(R.drawable.im_about_krakow5),
				resources.getDrawable(R.drawable.im_about_krakow6));
		gallery.setAdapter(adapter);
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
