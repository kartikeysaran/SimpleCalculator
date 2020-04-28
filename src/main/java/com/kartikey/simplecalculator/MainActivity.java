package com.kartikey.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button one,two,three,point,four,five,six,seven,eight,nine,tens,hundreds,clear,delete,add,subtract,divide,multiply,percentage,equals;
    TextView result,history;
    Double val1 ;
    Double val2,val3 ;
    Dialog mydialog;
    String action;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        val1 = Double.NaN;


        point = findViewById(R.id.point);
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        tens = findViewById(R.id.tens);
        hundreds = findViewById(R.id.hundreds);
        clear = findViewById(R.id.clear);
        delete = findViewById(R.id.delete);
        add = findViewById(R.id.add);
        subtract = findViewById(R.id.subtract);
        divide = findViewById(R.id.divide);
        multiply = findViewById(R.id.multiply);
        percentage = findViewById(R.id.percent);
        equals = findViewById(R.id.equal);
        result = findViewById(R.id.result);
        history = findViewById(R.id.history);

        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+".");
                history.setText(history.getText()+".");


            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                result.setText(result.getText()+"1");
                history.setText(history.getText()+"1");



            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                result.setText(result.getText()+"2");
                history.setText(history.getText()+"2");

            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                result.setText(result.getText()+"3");
                history.setText(history.getText()+"3");

            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                result.setText(result.getText()+"4");
                history.setText(history.getText()+"4");

            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                result.setText(result.getText()+"5");
                history.setText(history.getText()+"5");

            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                result.setText(result.getText()+"6");
                history.setText(history.getText()+"6");

            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                result.setText(result.getText()+"7");
                history.setText(history.getText()+"7");

            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                result.setText(result.getText()+"8");
                history.setText(history.getText()+"8");

            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                result.setText(result.getText()+"9");
                history.setText(history.getText()+"9");

            }
        });
        tens.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                result.setText(result.getText()+"0");
                history.setText(history.getText()+"0");

            }
        });
        hundreds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                result.setText(result.getText()+"00");
                history.setText(history.getText()+"00");

            }
        });


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                commute(0);
                val1 = Double.parseDouble((String) result.getText());
                result.setText(null);
                action = "+";
                history.setText(history.getText()+"+");


            }
        });
        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                commute(0);
                val1 = Double.parseDouble((String) result.getText());
                result.setText(null);
                action = "-";
                history.setText(history.getText()+"-");


            }
        });
        percentage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                commute(0);
                val1 = Double.parseDouble((String) result.getText());
                result.setText(null);
                action = "%";
                history.setText(history.getText()+"%");
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                commute(0);
                val1 = Double.parseDouble((String) result.getText());
                result.setText(null);
                action = "*";
                history.setText(history.getText()+"*");


            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                commute(0);
                val1 = Double.parseDouble((String) result.getText());
                result.setText(null);
                action = "/";
                history.setText(history.getText()+"/");


            }
        });

        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(result.getText().length()>0){
                    CharSequence chars = result.getText().toString();
                    result.setText(chars.subSequence(0,chars.length()-1));
                    CharSequence histo = history.getText().toString();
                    history.setText(histo.subSequence(0,histo.length()-1));
                }
                else{
                    val1 = Double.NaN;
                    val2 = Double.NaN;
                    history.setText(null);
                    result.setText(null);

                }

            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                val1 = Double.NaN;
                val2 = Double.NaN;
                history.setText(null);
                result.setText(null);
            }
        });
        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                commute(1);


            }
        });


    }

    private void commute(int a) {

        if(a==0){

        if(!Double.isNaN(val1)){

        val2 = Double.parseDouble((String) result.getText());
        switch (action){
            case "+" :
                val3 = val1+val2;
                result.setText(String.valueOf(val3));
                history.setText(history.getText()+"="+String.valueOf(val3));


                break;

            case "-" :
                val3 = val1-val2;
                result.setText(String.valueOf(val3));
                history.setText(history.getText()+"="+String.valueOf(val3));
                break;
            case "*" :
                val3 = val1*val2;
                result.setText(String.valueOf(val3));
                history.setText(history.getText()+"="+String.valueOf(val3));
                break;
            case "/" :
                val3 = val1/val2;
                result.setText(String.valueOf(val3));
                history.setText(history.getText()+"="+String.valueOf(val3));
                break;
            case "percentage" :
                val3 = (val1/val2)*100;
                result.setText(String.valueOf(val3));
                history.setText(history.getText()+"="+String.valueOf(val3));
                break;
            default:

                break;}



        }

        else{
            Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();}
        }
        else{
            if(!Double.isNaN(val1)){

                val2 = Double.parseDouble((String) result.getText());
                switch (action){
                    case "+" :
                        val3 = val1+val2;
                        result.setText(String.valueOf(val3));
                        history.setText(history.getText()+"="+String.valueOf(val3));


                        break;

                    case "-" :
                        val3 = val1-val2;
                        result.setText(String.valueOf(val3));
                        history.setText(history.getText()+"="+String.valueOf(val3));
                        break;
                    case "*" :
                        val3 = val1*val2;
                        result.setText(String.valueOf(val3));
                        history.setText(history.getText()+"="+String.valueOf(val3));
                        break;
                    case "/" :
                        val3 = val1/val2;
                        result.setText(String.valueOf(val3));
                        history.setText(history.getText()+"="+String.valueOf(val3));
                        break;
                    case "%" :
                        val3 = (val1/val2)*100;
                        result.setText(String.valueOf(val3));
                        history.setText(history.getText()+"="+String.valueOf(val3));
                        break;
                    default:

                        break;}



            }
            else{
                Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();

            }

        }
    }
    public void showpopup(View v){
        TextView close;
        mydialog.setContentView(R.layout.popup);
        close = (TextView) mydialog.findViewById(R.id.close);
        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mydialog.dismiss();
            }
        });
        mydialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mydialog.show();

    }
}
