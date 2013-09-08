package chathura.test1;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Chronometer;

public class Start extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_start);
		
		Button b= (Button)findViewById(R.id.button1);
		final Chronometer cm =(Chronometer)findViewById(R.id.chronometer1);
		
		b.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if(!cm.isActivated()){
					cm.start();
				}
				else{
					cm.stop();
				}
				
			}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.start, menu);
		return true;
	}

}
