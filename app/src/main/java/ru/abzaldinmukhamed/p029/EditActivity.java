package ru.abzaldinmukhamed.p029;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class EditActivity extends AppCompatActivity implements View.OnClickListener {


    EditText editText;
    Button button1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);

        editText = (EditText) findViewById(R.id.editText);

        button1 = (Button) findViewById(R.id.button_submit);
        button1.setOnClickListener(this);

    }

    @Override
        public void onClick(View v) {

        Intent intent = new Intent (this, MainActivity.class);
        intent.putExtra("name", editText.getText().toString());
        setResult(RESULT_OK, intent);
        finish();

    }
}
