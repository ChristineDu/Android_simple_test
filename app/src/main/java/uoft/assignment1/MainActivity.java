package uoft.assignment1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public int click_num=0;
    public void Register(View buttonR){
        click_num++;
        TextView textview=(TextView) findViewById(R.id.text_id);
        String s = "Clicked "+click_num+" times";
        textview.setText(s);

    }
    public void toggle(View buttonT){

        ImageView image = (ImageView) findViewById(R.id.icon);
        if(image.getVisibility()==View.INVISIBLE){
            image.setVisibility(View.VISIBLE);
        }else image.setVisibility(View.INVISIBLE);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


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
            click_num=0;
            TextView textview=(TextView) findViewById(R.id.text_id);
            textview.setText("No Clicks Yet");
            ImageView image = (ImageView) findViewById(R.id.icon);
            image.setVisibility(View.INVISIBLE);

        }

        return super.onOptionsItemSelected(item);
    }
}
