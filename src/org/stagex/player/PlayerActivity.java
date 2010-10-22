package org.stagex.player;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

public class PlayerActivity extends Activity {

	private NativePlayerSurface mPlayer;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		super.onCreate(savedInstanceState);
		getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
		mPlayer = new NativePlayerSurface(this);
		setContentView(mPlayer);
		Bundle bundle = getIntent().getExtras();
		String file = bundle.getString("file");
		if (mPlayer.open(file) != 0)
			Toast.makeText(this, "Failed to open file!", Toast.LENGTH_SHORT);
		mPlayer.setVideoMode(NativePlayer.VIDEO_MODE_FIT);
		if (mPlayer.play(0, 0, 0, -1) != 0)
			Toast.makeText(this, "Failed to play file!", Toast.LENGTH_SHORT);
	}

	@Override
	public void onDestroy() {
		super.onDestroy();
		mPlayer.close();
	}
}
