package android.lesson3.homework.fenske;

import ru.startandroid.develop.p0211twoactivity.R;
import android.app.Activity;
import android.os.Bundle;
import android.widget.*;
import android.view.View;
import android.view.View.OnClickListener;

public class FaktorialView extends Activity implements OnClickListener{

	int fakt = 0;
	EditText et = null;
	Button faktCountBtn;
	TextView resultTV = null;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.faktorial);
		
		et = (EditText) findViewById(R.id.numberOfElementsET);
		resultTV = (TextView) findViewById(R.id.resultTV);
		faktCountBtn = (Button) findViewById(R.id.faktCountBtn);
		faktCountBtn.setOnClickListener(this);
	}

	void faktElementsCountMethod() {
		int fakt = 1;
		int elementsCount = Integer.valueOf(et.getText().toString());
		for(int i = 1; i <= elementsCount; i++) {
			fakt = fakt * i;
		}
		resultTV.setText("Сумма элементов до " + elementsCount + " равна " + fakt);
	}
	
	@Override
	public void onClick(View v) {
		faktElementsCountMethod();
	}
	
}
