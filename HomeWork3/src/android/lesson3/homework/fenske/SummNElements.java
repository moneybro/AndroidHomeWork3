package android.lesson3.homework.fenske;

import ru.startandroid.develop.p0211twoactivity.R;
import android.app.Activity;
import android.os.Bundle;
import android.widget.*;
import android.view.View;
import android.view.View.OnClickListener;

public class SummNElements extends Activity implements OnClickListener {

	int summ = 0;
	EditText et = null;
	Button summCountBtn;
	TextView resultTV = null;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sum_n_elements);
		
		et = (EditText) findViewById(R.id.numberOfElementsET);
		resultTV = (TextView) findViewById(R.id.resultTV);
		summCountBtn = (Button) findViewById(R.id.faktCountBtn);
		summCountBtn.setOnClickListener(this);
	}
	
	void summElements() {
		int summ = 0;
		int elementsCount = Integer.valueOf(et.getText().toString());
		for(int i = 1; i <= elementsCount; i++) {
			summ = summ + i;
		}
		resultTV.setText("Сумма элементов до " + elementsCount + " равна " + summ);
	}

	@Override
	public void onClick(View arg0) {
		summElements();
	}
	
}
