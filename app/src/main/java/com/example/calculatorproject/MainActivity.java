package com.example.calculatorproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import javax.xml.transform.Result;

public class MainActivity extends AppCompatActivity {
    EditText Result;
    EditText Input;
    float Res1, Res2;
    Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, b_dot, b_add, b_sub, b_mul, b_div, b_clear, b_equal;
    Boolean Add, Sub, Mul, Div;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonHandler();

    }

    public void buttonHandler() {
        b0 = (Button) findViewById(R.id.b0);
        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);
        b7 = (Button) findViewById(R.id.b7);
        b8 = (Button) findViewById(R.id.b8);
        b9 = (Button) findViewById(R.id.b9);
        b_dot = (Button) findViewById(R.id.b_dot);
        b_add = (Button) findViewById(R.id.b_add);
        b_sub = (Button) findViewById(R.id.b_sub);
        b_mul = (Button) findViewById(R.id.b_mul);
        b_div = (Button) findViewById(R.id.b_div);
        b_clear = (Button) findViewById(R.id.b_clear);
        b_equal = (Button) findViewById(R.id.b_equal);

        Result = (EditText) findViewById(R.id.Result);
        Input = (EditText) findViewById(R.id.Input);
        Add = false;
        Sub = false;
        Div = false;
        Mul = false;


        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Input.setText(Input.getText().toString() + "0");

            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Input.setText(Input.getText().toString() + "1");

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Input.setText(Input.getText().toString() + "2");
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Input.setText(Input.getText().toString() + "3");
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Input.setText(Input.getText().toString() + "4");
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Input.setText(Input.getText().toString() + "5");
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Input.setText(Input.getText().toString() + "6");
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Input.setText(Input.getText().toString() + "7");
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Input.setText(Input.getText().toString() + "8");
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Input.setText(Input.getText().toString() + "9");
            }
        });

        b_dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Input.setText(Input.getText().toString() + ".");
            }
        });

        b_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (Input.getText().length() > 0) {
                    Res1 = Float.parseFloat(Input.getText().toString());
                    Add = true;
                    Input.setText(null);

                    Result.setText(Float.toString(Res1)+"+");

                } else if (Add == true) {
                    Toast.makeText(MainActivity.this, "Please press = ", Toast.LENGTH_SHORT).show();
                }


            }
        });

        b_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Input.getText().length() > 0) {
                    Res1 = Float.parseFloat(Input.getText().toString());
                    Sub = true;
                    Input.setText(null);
                    Result.setText(Float.toString(Res1)+"-");
                }
            }
        });

        b_mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Input.getText().length() > 0) {
                    Res1 = Float.parseFloat(Input.getText().toString());
                    Mul = true;
                    Input.setText(null);
                    Result.setText(Float.toString(Res1)+"*");
                }
            }
        });

        b_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Input.getText().length() > 0) {
                    Res1 = Float.parseFloat(Input.getText().toString());
                    Div = true;
                    Input.setText(null);
                    Result.setText(Float.toString(Res1)+"/");
                }
            }
        });

        b_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Input.setText("");
                Result.setText("");
            }
        });

        b_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Add == true) {
                    if (Input.getText().length() > 0) {
                        Res2 = Float.parseFloat(Input.getText().toString());
                        Result.setText(Float.toString(Res1) + " + " + Float.toString(Res2) + "= " + Float.toString(Res1 + Res2));
                        Input.setText("");
                        Add = false;
                    } else {
                        Toast.makeText(MainActivity.this, "Please enter second number", Toast.LENGTH_SHORT).show();
                    }
                }
                if (Sub == true) {
                    if (Input.getText().length() > 0) {
                        Res2 = Float.parseFloat(Input.getText().toString());
                        Result.setText(Float.toString(Res1) + " - " + Float.toString(Res2) + "= " + Float.toString(Res1 - Res2));
                        Input.setText("");
                        Sub = false;
                    } else {
                        Toast.makeText(MainActivity.this, "Please enter second number", Toast.LENGTH_SHORT).show();
                    }
                }
                if (Div == true) {
                    if (Input.getText().length() > 0) {
                        Res2 = Float.parseFloat(Input.getText().toString());
                        Result.setText(Float.toString(Res1) + " / " + Float.toString(Res2) + "= " + Float.toString(Res1 / Res2));
                        Input.setText("");
                        Div = false;
                    } else {
                        Toast.makeText(MainActivity.this, "Please enter second number", Toast.LENGTH_SHORT).show();
                    }

                }
                if (Mul == true) {
                    if (Input.getText().length() > 0) {
                        Res2 = Float.parseFloat(Input.getText().toString());
                        Result.setText(Float.toString(Res1) + " * " + Float.toString(Res2) + "= " + Float.toString(Res1 * Res2));
                        Input.setText("");
                        Mul = false;
                    } else {
                        Toast.makeText(MainActivity.this, "Please enter second number", Toast.LENGTH_SHORT).show();
                    }
                }

                if(Add==false&&Sub==false&&Mul==false&&Div==false){
                    if (Input.getText().length() > 0){
                        Res2 = Float.parseFloat(Input.getText().toString());
                        Result.setText(Float.toString(Res2));
                    }


                }

            }


        });


    }
}