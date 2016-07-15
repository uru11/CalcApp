package jp.techacademy.tominaga.calcapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText editText;
    EditText editText1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.ButtonView0);
        button1.setOnClickListener(this);

        Button button2 = (Button) findViewById(R.id.ButtonView1);
        button2.setOnClickListener(this);

        Button button3 = (Button) findViewById(R.id.ButtonView2);
        button3.setOnClickListener(this);

        Button button4 = (Button) findViewById(R.id.ButtonView3);
        button4.setOnClickListener(this);

        editText = (EditText) findViewById(R.id.edittext1);

        editText1 = (EditText) findViewById(R.id.edittext2);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, SecondActivity.class);
        String edit11 = editText.getText().toString();
        Double edit1 = Double.parseDouble(edit11);
        String right22 = editText1.getText().toString();
        Double edit2 = Double.parseDouble(right22);

        if (v.getId() == R.id.ButtonView0) {
            intent.putExtra("kotae", edit1 + edit2);
        }
        else if (v.getId() == R.id.ButtonView1) {
            intent.putExtra("kotae", edit1 - edit2);
        }
        else if (v.getId() == R.id.ButtonView2) {
            intent.putExtra("kotae", edit1 * edit2);
        }
        else if (v.getId() == R.id.ButtonView3) {
            intent.putExtra("kotae", edit1 / edit2);
        }
        startActivity(intent);

    }
}