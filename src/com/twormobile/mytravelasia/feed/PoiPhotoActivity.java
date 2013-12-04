package com.twormobile.mytravelasia.feed;

import android.app.Activity;
import android.os.Bundle;
import com.loopj.android.image.SmartImageView;
import com.twormobile.mytravelasia.R;
import com.twormobile.mytravelasia.util.AppConstants;

/**
 * @author avendael
 */
public class PoiPhotoActivity extends Activity {
    private static final String TAG = PoiPhotoActivity.class.getSimpleName();

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.poi_photo_activity);

        String photoUrl = getIntent().getStringExtra(AppConstants.ARG_PHOTO_URL);
        SmartImageView ivPhoto = (SmartImageView) findViewById(R.id.iv_photo);

        if (photoUrl != null) ivPhoto.setImageUrl(photoUrl);
    }
}