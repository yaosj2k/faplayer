package org.stagex.player;

import android.view.Surface;

class NativePlayer3 implements NativePlayer {

	static {
		System.loadLibrary("ffmpeg");
		System.loadLibrary("player-3");
	}

	public native int open(String file);

	public native void close();

	public native int play(double start, int ast, int vst, int sst);

	public native void pause();

	public native void resume();

	public native int seek(double time);

	public native int getAudioStreamCount();

	public native int getVideoStreamCount();

	public native int getSubtitleStreamCount();

	public native int setVideoMode(int mode);

	public native int getVideoWidth();

	public native int getVideoHeight();

	public native int getDuration();

	public native double getCurrentTime();

	public native boolean isPlaying();

	public native int attach(Surface surface);

	public native void detach();

}
