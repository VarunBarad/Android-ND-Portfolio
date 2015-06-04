package org.no_ip.varunbarad.proj_0_portfolio;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class ProjectHome extends ActionBarActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_project_home);
  }

  public void onClick(View view) {
    String message;
    switch (view.getId()) {
      case R.id.button_project_spotify:
        message = "This would launch my spotify streamer";
        break;
      case R.id.button_project_scores:
        message = "This would launch my scores app";
        break;
      case R.id.button_project_library:
        message = "This would launch my library project";
        break;
      case R.id.button_project_gradle:
        message = "This would launch my gradle based project";
        break;
      case R.id.button_project_reader:
        message = "This would launch my reader application";
        break;
      case R.id.button_project_capstone:
        message = "This would launch my capstone project";
        break;
      default:
        message = "Unknown button pressed";
    }

    Toast.makeText(this, message, Toast.LENGTH_LONG).show();
  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    // Inflate the menu; this adds items to the action bar if it is present.
    // getMenuInflater().inflate(R.menu.menu_project_home, menu);
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
