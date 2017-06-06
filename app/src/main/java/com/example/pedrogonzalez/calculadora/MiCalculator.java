package com.example.pedrogonzalez.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MiCalculator extends AppCompatActivity {

    Button zero, one, two, three, four, five, six, seven, eight, believe,
            point, sign, product, divide, minus, plus, erase, equals, history;
    TextView screen, exit;
    double number, num, result;
    String operator;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mi_calculadora);


        point = (Button) findViewById(R.id.my_point);
        sign = (Button) findViewById(R.id.my_sign);
        product = (Button) findViewById(R.id.my_product);
        divide = (Button) findViewById(R.id.my_divide);
        minus = (Button) findViewById(R.id.my_minus);
        plus = (Button) findViewById(R.id.my_plus);
        equals = (Button) findViewById(R.id.my_equals);
        history = (Button) findViewById(R.id.my_history);
        erase = (Button) findViewById(R.id.my_eraser);
        screen = (TextView) findViewById(R.id.my_screen);

        zero = (Button) findViewById(R.id.my_zero);
        zero.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                exit = (TextView) findViewById(R.id.my_screen);
                screen.setText(exit.getText().toString()+ "0");
            }
        });
        one = (Button) findViewById(R.id.my_one);
        one.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                exit = (TextView) findViewById(R.id.my_screen);
                screen.setText(exit.getText().toString()+ "1");
            }
        });
        two = (Button) findViewById(R.id.my_two);
        two.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                exit = (TextView) findViewById(R.id.my_screen);
                screen.setText(exit.getText().toString()+ "2");

            }
        });
        three = (Button) findViewById(R.id.my_three);
        three.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                exit = (TextView) findViewById(R.id.my_screen);
                screen.setText(exit.getText().toString()+ "3");
            }
        });
        four = (Button) findViewById(R.id.my_four);
        four.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                exit = (TextView) findViewById(R.id.my_screen);
                screen.setText(exit.getText().toString()+ "4");
            }
        });
        five = (Button) findViewById(R.id.my_five);
        five.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                exit = (TextView) findViewById(R.id.my_screen);
                screen.setText(exit.getText().toString()+ "5");
            }
        });
        six = (Button)findViewById(R.id.my_six);
        six.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                exit = (TextView) findViewById(R.id.my_screen);
                screen.setText(exit.getText().toString()+ "6");
            }
        });
        seven = (Button) findViewById(R.id.my_seven);
        seven.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                exit = (TextView) findViewById(R.id.my_screen);
                screen.setText(exit.getText().toString()+ "7");
            }
        });
        eight = (Button) findViewById(R.id.my_eight);
        eight.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                exit = (TextView) findViewById(R.id.my_screen);
                screen.setText(exit.getText().toString()+ "8");
            }
        });
        believe = (Button) findViewById(R.id.my_nine);
        believe.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                exit = (TextView) findViewById(R.id.my_screen);
                screen.setText(exit.getText().toString()+ "9");
            }
        });
    }
}
