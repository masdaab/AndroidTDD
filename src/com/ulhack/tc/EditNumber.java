package com.ulhack.tc;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EditText;

public class EditNumber extends EditText{

 
	public EditNumber(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}

 
	public EditNumber(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
	}

 
	public EditNumber(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		// TODO Auto-generated constructor stub
	}

	public void clear() {
		setText("");
	}

	public void setNumber(double f) {
		setText(Double.toString(f));
	}

	public double getNumber() {
		final String s = getText().toString();
		android.util.Log.d("get numbur", "converting " + s);
		if ( "".equals(s) ) {
			return Double.NaN;
		}
		return Double.valueOf(s);
	}
}
