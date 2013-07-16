package android.lesson3.homework.fenske;

import ru.startandroid.develop.p0211twoactivity.R;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class les4task1 extends MainActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.les4task1);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.les4task1, menu);
		return true;
	}
	
}
