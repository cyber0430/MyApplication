package com.example.com.calc;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
    EditText edit1, edit2;
    Button button1, button2, button3, button4, button5;
    TextView textResult;
    String num1, num2;
    Double result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("초간단 계산기");

        edit1=(EditText) findViewById(R.id.Edit1);
        edit2=(EditText) findViewById(R.id.Edit2);
        button1=(Button) findViewById(R.id.Button1);
        button2=(Button) findViewById(R.id.Button2);
        button3=(Button) findViewById(R.id.Button3);
        button4=(Button) findViewById(R.id.Button4);
        button5=(Button) findViewById(R.id.Button5);

        textResult=(TextView) findViewById(R.id.TextResult);

        button1.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                num1=edit1.getText().toString();
                num2=edit2.getText().toString();
                if (num1.length()<=0 || num2.length()<=0) {
                    Toast.makeText(getApplicationContext(), "값이 입력되지 않았습니다.",Toast.LENGTH_SHORT).show();
                }
                else {
                    result = Double.parseDouble(num1) + Double.parseDouble(num2);
                    textResult.setText("계산결과 : " + result.toString());
                }
            }
        });
        button2.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                num1=edit1.getText().toString();
                num2=edit2.getText().toString();
                if (num1.length()<=0 || num2.length()<=0) {
                    Toast.makeText(getApplicationContext(), "값이 입력되지 않았습니다.",Toast.LENGTH_SHORT).show();
                }
                else {
                    result = Double.parseDouble(num1) - Double.parseDouble(num2);
                    result=(int)(result*10000.0+0.5)/10000.0;
                    textResult.setText("계산결과 : " + result.toString());
                }
            }
        });
        button3.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                num1=edit1.getText().toString();
                num2=edit2.getText().toString();
                if (num1.length()<=0 || num2.length()<=0) {
                    Toast.makeText(getApplicationContext(), "값이 입력되지 않았습니다.",Toast.LENGTH_SHORT).show();
                }
                else {
                    result = Double.parseDouble(num1) * Double.parseDouble(num2);
                    textResult.setText("계산결과 : " + result.toString());
                }
            }
        });
        button4.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                num1=edit1.getText().toString();
                num2=edit2.getText().toString();
                if (num1.length()<=0 || num2.length()<=0) {
                    Toast.makeText(getApplicationContext(), "값이 입력되지 않았습니다.",Toast.LENGTH_SHORT).show();
                }
                else if (Double.parseDouble(num2)==0) {
                    Toast.makeText(getApplicationContext(), "0으로 나눌 수 없습니다.",Toast.LENGTH_SHORT).show();
                }
                else {
                    result = Double.parseDouble(num1) / Double.parseDouble(num2);
                    result=(int)(result*10000.0+0.5)/10000.0;
                    textResult.setText("계산결과 : " + result.toString());
                }
            }
        });
        button5.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                num1=edit1.getText().toString();
                num2=edit2.getText().toString();
                if (num1.length()<=0 || num2.length()<=0) {
                    Toast.makeText(getApplicationContext(), "값이 입력되지 않았습니다.",Toast.LENGTH_SHORT).show();
                }
                else if (Double.parseDouble(num2)==0) {
                    Toast.makeText(getApplicationContext(), "0으로 나눌 수 없습니다.",Toast.LENGTH_SHORT).show();
                }
                else {
                    result = Double.parseDouble(num1) % Double.parseDouble(num2);
                    result=(int)(result*10000.0+0.5)/10000.0;
                    textResult.setText("계산결과 : " + result.toString());
                }
            }
        });
    }

}
