package com.example.exchangerate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button checkButton;
    TextView resultView;
    EditText getTextView;


    void calculate(){
        int get = Integer.parseInt(getTextView.getText().toString());
        get *= 1121;
        String text = Integer.toString(get);
        resultView.setText(text);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkButton = findViewById(R.id.check_button);
        resultView = findViewById(R.id.result_textView);
        getTextView = findViewById(R.id.edit_Text);

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getId() == R.id.check_button){
                    if (!getTextView.getText().toString().equals("")){
                        calculate();
                    }
                    else {
                        Toast.makeText(getApplicationContext(), "값을 입력해 주세요", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        };

        checkButton.setOnClickListener(onClickListener);
    }
}