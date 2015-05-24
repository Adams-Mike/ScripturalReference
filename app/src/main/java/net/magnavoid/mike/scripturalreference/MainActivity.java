package net.magnavoid.mike.scripturalreference;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                EditText Book = (EditText) findViewById(R.id.book);
                EditText Chapter = (EditText) findViewById(R.id.chapter);
                EditText Verse = (EditText) findViewById(R.id.verse);

                String book = Book.getText().toString();
                String chapter = Chapter.getText().toString();
                String verse = Verse.getText().toString();

                Intent intent = new Intent(v.getContext(), Activity2.class);
                intent.putExtra("BOOK", book);
                intent.putExtra("CHAPTER", chapter);
                intent.putExtra("VERSE", verse);

                startActivity(intent);
            }
        });
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

}