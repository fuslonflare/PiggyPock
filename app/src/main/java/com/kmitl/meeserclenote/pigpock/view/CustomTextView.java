package com.kmitl.meeserclenote.pigpock.view;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;

/**
 * Created by Phuwarin on 4/8/2017.
 */

public class CustomTextView extends AppCompatTextView {
    public CustomTextView(Context context) {
        super(context);
        if (!isInEditMode()) {
            setFontNSize(context);
        }
    }

    public CustomTextView(Context context,
                          AttributeSet attrs) {
        super(context, attrs);
        if (!isInEditMode()) {
            setFontNSize(context);
        }
    }

    public CustomTextView(Context context,
                          AttributeSet attrs,
                          int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        if (!isInEditMode()) {
            setFontNSize(context);
        }
    }

    private void setFontNSize(Context context) {
        Typeface myFont = Typeface.createFromAsset(context.getAssets(), "THSarabun.ttf");
        this.setTypeface(myFont);
    }
}
