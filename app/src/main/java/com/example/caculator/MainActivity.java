package com.example.caculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private Button one;
    private Button zero;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button Add;
    private Button sub;
    private Button divide;
    private Button mul;
    private Button equal;
    private Button point;
    private Button Brace;
    private Button Braces;
    private Button Squareroot;
    private Button clear;
    private Button Tan;
    private Button Sin;
    private Button Cos;
    private Button pie;
    private TextView result;
    private TextView Action;
    String pi="3.14159";





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        zero = (Button) findViewById(R.id.button0);
        pie =(Button) findViewById(R.id.piButton);
        one = (Button) findViewById(R.id.button1);
        two = (Button) findViewById(R.id.button2);
        three = (Button) findViewById(R.id.button3);
        four = (Button) findViewById(R.id.button4);
        five = (Button) findViewById(R.id.button5);
        six = (Button) findViewById(R.id.button6);
        seven = (Button) findViewById(R.id.button7);
        eight = (Button) findViewById(R.id.button8);
        nine = (Button) findViewById(R.id.button9);
        point = (Button) findViewById(R.id.buttonPoint);
        Squareroot = (Button) findViewById(R.id.buttonPer);
        Brace = (Button) findViewById(R.id.buttonBrace);
        Braces = (Button) findViewById(R.id.buttonBraces);
        divide = (Button) findViewById(R.id.buttonDivide);
        Sin = (Button) findViewById(R.id.sinbutton);
        Tan = (Button) findViewById(R.id.tanButton);
        Cos = (Button) findViewById(R.id.cosButton);
        mul = (Button) findViewById(R.id.buttonMulti);
        clear = (Button) findViewById(R.id.buttonClear);
        Add = (Button) findViewById(R.id.buttonPlus);
        sub = (Button) findViewById(R.id.buttonMinus);
        equal = (Button) findViewById(R.id.buttonEqual);
        result = (TextView) findViewById(R.id.resultView);
        Action = (TextView) findViewById(R.id.actionview);

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText() + "0");
            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText() + "1");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               result.setText(result.getText() + "2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText() + "3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+ "4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText() + "5");
            }
        });
        result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(Action.getText() + "6");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText() + "6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText() + "7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+ "8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText() + "9");
            }
        });
        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                result.setText(result.getText() + "+");
                Action.setText(null);

            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                result.setText(result.getText() + "-");
                Action.setText(null);
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                result.setText(result.getText()+ "÷");
                Action.setText(null);
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                result.setText(result.getText()+ "×");

            }
        });
        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               result.setText(result.getText().toString() + ".");
            }
        });
        Brace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               result.setText(result.getText() + "(");
            }
        });
        Braces.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText() + ")");
            }
        });



        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String val = result.getText().toString();
                String replacestr = val.replace('÷', '/').replace('×', '*');
                double team = eval(replacestr);
                result.setText(String.valueOf(team));
                Action.setText(val);

            }
        });
        Squareroot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               String val = result.getText().toString();
               double r = Math.sqrt(Double.parseDouble(val));
               result.setText(String.valueOf(r));
            }
        }); pie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Action.setText(pie.getText());
                result.setText(result.getText()+pi);
            }
        });
        Sin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               Action.setText(pie.getText());
                result.setText(result.getText().toString() + "sin");
            }
        });
    Cos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

             Action.setText(pie.getText());
                result.setText(result.getText().toString() + "cos");
            }
        });

       Tan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Action.setText(pie.getText());
                result.setText(result.getText().toString() + "tan");
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String val = result.getText().toString();
                val = val.substring(0,val.length()-1);
                result.setText(val);
            }
        });

    }
    public static double eval(final String str) {
        return new Object() {
            int pos = -1, ch;

            void nextChar() {
                ch = (++pos < str.length()) ? str.charAt(pos) : -1;
            }

            boolean eat(int charToEat) {
                while (ch == ' ') nextChar();
                if (ch == charToEat) {
                    nextChar();
                    return true;
                }
                return false;
            }

            double parse() {
                nextChar();
                double x = parseExpression();
                if (pos < str.length()) throw new RuntimeException("Unexpected: " + (char)ch);
                return x;
            }

            // Grammar:
            // expression = term | expression `+` term | expression `-` term
            // term = factor | term `*` factor | term `/` factor
            // factor = `+` factor | `-` factor | `(` expression `)`
            //        | number | functionName factor | factor `^` factor

            double parseExpression() {
                double x = parseTerm();
                for (;;) {
                    if      (eat('+')) x += parseTerm(); // addition
                    else if (eat('-')) x -= parseTerm(); // subtraction
                    else return x;
                }
            }

            double parseTerm() {
                double x = parseFactor();
                for (;;) {
                    if      (eat('*')) x *= parseFactor(); // multiplication
                    else if (eat('/')) x /= parseFactor(); // division
                    else return x;
                }
            }

            double parseFactor() {
                if (eat('+')) return parseFactor(); // unary plus
                if (eat('-')) return -parseFactor(); // unary minus

                double x;
                int startPos = this.pos;
                if (eat('(')) { // parentheses
                    x = parseExpression();
                    eat(')');
                } else if ((ch >= '0' && ch <= '9') || ch == '.') { // numbers
                    while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                    x = Double.parseDouble(str.substring(startPos, this.pos));
                } else if (ch >= 'a' && ch <= 'z') { // functions
                    while (ch >= 'a' && ch <= 'z') nextChar();
                    String func = str.substring(startPos, this.pos);
                    x = parseFactor();
                    if (func.equals("sqrt")) x = Math.sqrt(x);
                    else if (func.equals("sin")) x = Math.sin(Math.toRadians(x));
                    else if (func.equals("cos")) x = Math.cos(Math.toRadians(x));
                    else if (func.equals("tan")) x = Math.tan(Math.toRadians(x));
                    else throw new RuntimeException("Unknown function: " + func);
                } else {
                    throw new RuntimeException("Unexpected: " + (char)ch);
                }

                if (eat('^')) x = Math.pow(x, parseFactor()); // exponentiation

                return x;
            }
        }.parse();
    }



}
