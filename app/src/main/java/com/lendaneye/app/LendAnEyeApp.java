package com.lendaneye.app;

import android.content.Context;
import android.support.multidex.MultiDex;
import android.support.multidex.MultiDexApplication;
import com.crashlytics.android.Crashlytics;
import com.twitter.sdk.android.Twitter;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import io.fabric.sdk.android.Fabric;

public class LendAnEyeApp extends MultiDexApplication {

    // Note: Your consumer key and secret should be obfuscated in your source code before shipping.
    private static final String TWITTER_KEY = "IcCaP81dca5PwhrqDYMOY3mQG";
    private static final String TWITTER_SECRET = "73g1J6JrJVlQAQXC03w4VAzq6Te3id3ttLxLvpIw8nAxjDIfad";

	private static Context context;

	@Override
	public void onCreate() {
		super.onCreate();
		TwitterAuthConfig authConfig = new TwitterAuthConfig(TWITTER_KEY, TWITTER_SECRET);
		Fabric.with(this, new Crashlytics(), new Twitter(authConfig));
		context = getApplicationContext();
	}

	@Override
	protected void attachBaseContext(Context base) {
		super.attachBaseContext(base);
		MultiDex.install(base);
	}
}
