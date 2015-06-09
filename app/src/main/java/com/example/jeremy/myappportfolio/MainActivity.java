package com.example.jeremy.myappportfolio;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    /** Called when the user touches the button Media Steamer */
    public void sendMessageMedia(View view) {

        Context context = getApplicationContext();
        CharSequence text = getString(R.string.button_message_Media);
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    /** Called when the user touches the button Score app*/
    public void sendMessageScore(View view) {

        Context context = getApplicationContext();
        CharSequence text = getString(R.string.button_message_score);
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    /** Called when the user touches the button Library App*/
    public void sendMessageLibrary(View view) {

        Context context = getApplicationContext();
        CharSequence text = getString(R.string.button_message_library);
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    /** Called when the user touches the button Build app*/
    public void sendMessageBuild(View view) {

        Context context = getApplicationContext();
        CharSequence text = getString(R.string.button_message_build_bigger);
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    /** Called when the user touches the button XYZ reader */
    public void sendMessageReader(View view) {

        Context context = getApplicationContext();
        CharSequence text = getString(R.string.button_message_reader);
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    /** Called when the user touches the button Capstone */
    public void sendMessageCapstone(View view) {

        Context context = getApplicationContext();
        CharSequence text = getString(R.string.button_message_capstone);
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
