package android.lesson3.homework.fenske;

import ru.startandroid.develop.p0211twoactivity.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener {

	  Button btnActTwo;
	  Button faktorialActivity;
	  TextView tv;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		btnActTwo = (Button) findViewById(R.id.btnActTwo);
		btnActTwo.setOnClickListener(this);
		faktorialActivity = (Button) findViewById(R.id.faktorialActivity);
		faktorialActivity.setOnClickListener(this);
		
		tv = (TextView) findViewById(R.id.textView1);
		tv.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btnActTwo:
			Intent intentSumm = new Intent(this, SummNElements.class);
			startActivity(intentSumm);
			break;
		case R.id.faktorialActivity:
			Intent intentFactorial = new Intent(this, FaktorialView.class);
			startActivity(intentFactorial);
			break;
			default:
				break;
		}
	}
}
