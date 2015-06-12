package org.no_ip.varunbarad.proj_0_portfolio.activity;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import org.no_ip.varunbarad.proj_0_portfolio.R;


public class ProjectHomeActivity extends AppCompatActivity {

  Toast toast;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_project_home);
  }

  public void displayToast(View view) {
    Button button = (Button) view;

    String buttonText = button.getText().toString();

    Context context = getApplicationContext();

    String text = getString(R.string.open_app, buttonText);

    if (this.toast != null) {
      this.toast.cancel();
    }
    toast = Toast.makeText(context, text, Toast.LENGTH_SHORT);
    toast.show();
  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.menu_project_home, menu);
    return true;
  }

  @Override
  public boolean onOptionsItemSelected(MenuItem item) {
    // Handle action bar item clicks here. The action bar will
    // automatically handle clicks on the Home/Up button, so long
    // as you specify a parent activity in AndroidManifest.xml.
    int id = item.getItemId();

    //noinspection SimplifiableIfStatement
    if (id == R.id.action_settings) {
      return true;
    }

    return super.onOptionsItemSelected(item);
  }
}
