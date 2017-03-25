package com.lendaneye.app.ui.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.lendaneye.app.R;
import com.lendaneye.library.BaseActivity;

public class MainActivity extends BaseActivity {
	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		setInitial();
	}

	private void setInitial() {
	}
}