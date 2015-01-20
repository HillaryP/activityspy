package edu.washington.prathh.activityspy;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.util.Log;

<<<<<<< HEAD
=======

>>>>>>> 8c75932949e1b7bbca4bb641a360736147c4836e
public class MainActivity extends ActionBarActivity {
    private static final String ACTIVITY = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
<<<<<<< HEAD
        Log.i(ACTIVITY, "onCreate event fired");
=======
        Log.i(ACTIVITY, "onCreate even fired");
>>>>>>> 8c75932949e1b7bbca4bb641a360736147c4836e
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
<<<<<<< HEAD
=======
        Log.i(ACTIVITY, "onCreateOptionsMenu event fired");
>>>>>>> 8c75932949e1b7bbca4bb641a360736147c4836e
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

    @Override
    public void onDestroy() {
<<<<<<< HEAD
=======
        super.onDestroy();
>>>>>>> 8c75932949e1b7bbca4bb641a360736147c4836e
        Log.e(ACTIVITY, "We're going down, Captain!");
    }
}
