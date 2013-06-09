/**
 * 
 */
package com.abb.visitisdc.fragments.utils;

import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SpinnerAdapter;

/**
 * @author marcin
 * 
 */
public class GallerySpinnerAdapter implements SpinnerAdapter {

	private final Drawable[] drawables;
	private final Context galleryContext;

	public GallerySpinnerAdapter(Context galleryContext, Drawable... drawables) {
		if (drawables == null) {
			throw new IllegalArgumentException("List of drawables must not be null");
		}
		this.galleryContext = galleryContext;
		this.drawables = drawables;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see android.widget.Adapter#getCount()
	 */
	@Override
	public int getCount() {
		return drawables.length;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see android.widget.Adapter#getItem(int)
	 */
	@Override
	public Object getItem(int position) {
		return drawables[position];
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see android.widget.Adapter#getItemId(int)
	 */
	@Override
	public long getItemId(int position) {
		return drawables[position].hashCode();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see android.widget.Adapter#getItemViewType(int)
	 */
	@Override
	public int getItemViewType(int position) {
		return 0;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see android.widget.Adapter#getView(int, android.view.View, android.view.ViewGroup)
	 */
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ImageView result;
		if ((convertView != null) && (convertView instanceof ImageView)) {
			result = (ImageView) convertView;
		} else {
			result = new ImageView(galleryContext);
		}
		// specify the drawable at this position in the array
		result.setImageDrawable(drawables[position]);
		// scale type within view area
		result.setScaleType(ImageView.ScaleType.FIT_CENTER);
		// set default gallery item background
		result.setBackgroundResource(android.R.drawable.list_selector_background);
		// return the view
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see android.widget.Adapter#getViewTypeCount()
	 */
	@Override
	public int getViewTypeCount() {
		return 1;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see android.widget.Adapter#hasStableIds()
	 */
	@Override
	public boolean hasStableIds() {
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see android.widget.Adapter#isEmpty()
	 */
	@Override
	public boolean isEmpty() {
		return getCount() == 0;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see android.widget.Adapter#registerDataSetObserver(android.database.DataSetObserver)
	 */
	@Override
	public void registerDataSetObserver(DataSetObserver observer) {

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see android.widget.Adapter#unregisterDataSetObserver(android.database.DataSetObserver)
	 */
	@Override
	public void unregisterDataSetObserver(DataSetObserver observer) {

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see android.widget.SpinnerAdapter#getDropDownView(int, android.view.View, android.view.ViewGroup)
	 */
	@Override
	public View getDropDownView(int arg0, View arg1, ViewGroup arg2) {
		return getView(arg0, arg1, arg2);
	}

}
