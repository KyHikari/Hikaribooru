package ky.hikari;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;

public class MainActivity extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		final TextView text = (TextView) findViewById(R.id.text);
		AsyncHttpClient client = new AsyncHttpClient();
		client.get("http://oreno.imouto.org/post/index.json",
				new AsyncHttpResponseHandler() {
					@Override
					public void onSuccess(String response) {
						Log.d(MainActivity.class.getName(), response);
						text.setText(response);
					}
				});
	}
}