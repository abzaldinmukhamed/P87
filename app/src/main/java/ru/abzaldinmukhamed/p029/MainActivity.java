package ru.abzaldinmukhamed.p029;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView textView;
    //TextView textView2;

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView);
       // textView2 = (TextView) findViewById(R.id.textView2);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);

    //    Intent intent = getIntent();

      //  String name = intent.getStringExtra("name");

        //textView2.setText(name);
    }

    @Override
    public void onClick(View v) {

        Intent intent = new Intent (this, EditActivity.class);
        startActivityForResult(intent, 1);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (data == null) {
            return;
        } String name = data.getStringExtra("name");
        textView.setText("Your name is " + name);

    }
}
