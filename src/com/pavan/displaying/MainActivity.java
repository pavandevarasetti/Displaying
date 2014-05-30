package com.pavan.displaying;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;
public class MainActivity extends ActionBarActivity {
  String answer;
  int a=0, count=1;
  Button click;
  TextView display;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		answer = "hello world!";
		click=(Button) findViewById(R.id.bAdd);
		display=(TextView) findViewById(R.id.printdisplay);
		click.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				 // the "if" clause: display must be print
			    if (a==0)
			    {
			    	display.setText("!dlrow olleh" + count);
			        a=1;
			    }
			}
				
				
			    
			
		});
		

		}
}
    


	
