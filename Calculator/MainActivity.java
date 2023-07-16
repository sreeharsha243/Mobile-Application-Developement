package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    double in1 = 0, in2 = 0;
    EditText edittext1;
    boolean Add, Sub, Multiply, Divide, deci;
    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    Button btnAdd, btnSub, btnMul, btnDiv, btnEqu, btnClr, btnDot;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn0 = (Button) findViewById(R.id.b0);
        btn1 = (Button) findViewById(R.id.b1);
        btn2 = (Button) findViewById(R.id.b2);
        btn3 = (Button) findViewById(R.id.b3);
        btn4 = (Button) findViewById(R.id.b4);
        btn5 = (Button) findViewById(R.id.b5);
        btn6 = (Button) findViewById(R.id.b6);
        btn7 = (Button) findViewById(R.id.b7);
        btn8 = (Button) findViewById(R.id.b8);
        btn9 = (Button) findViewById(R.id.b9);
        btnDot = (Button) findViewById(R.id.bDot);
        btnAdd = (Button) findViewById(R.id.badd);
        btnSub = (Button) findViewById(R.id.bsub);
        btnMul = (Button) findViewById(R.id.bmul);
        btnDiv = (Button) findViewById(R.id.bdiv);
        btnClr = (Button) findViewById(R.id.buttonClr);
        btnEqu = (Button) findViewById(R.id.buttoneql);

        edittext1 = (EditText) findViewById(R.id.display);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext1.setText(edittext1.getText() + "1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext1.setText(edittext1.getText() + "2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext1.setText(edittext1.getText() + "3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext1.setText(edittext1.getText() + "4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext1.setText(edittext1.getText() + "5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext1.setText(edittext1.getText() + "6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext1.setText(edittext1.getText() + "7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext1.setText(edittext1.getText() + "8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext1.setText(edittext1.getText() + "9");
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext1.setText(edittext1.getText() + "0");
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edittext1.getText().length() != 0) {
                    in1 = Float.parseFloat(edittext1.getText() + "");
                    Add = true;
                    deci = false;
                    edittext1.setText(null);
                }
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edittext1.getText().length() != 0) {
                    in1 = Float.parseFloat(edittext1.getText() + "");
                    Sub = true;
                    deci = false;
                    edittext1.setText(null);
                }
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edittext1.getText().length() != 0) {
                    in1 = Float.parseFloat(edittext1.getText() + "");
                    Multiply = true;
                    deci = false;
                    edittext1.setText(null);
                }
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edittext1.getText().length() != 0) {
                    in1 = Float.parseFloat(edittext1.getText() + "");
                    Divide = true;
                    deci = false;
                    edittext1.setText(null);
                }
            }
        });

        btnEqu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Add || Sub || Multiply || Divide) {
                    in2 = Float.parseFloat(edittext1.getText() + "");
                }
                if (Add) {

                    edittext1.setText(in1 + in2 + "");
                    Add = false;
                }
                if (Sub) {

                    edittext1.setText(in1 - in2 + "");
                    Sub = false;
                }
                if (Multiply) {
                    edittext1.setText(in1 * in2 + "");
                    Multiply = false;
                }
                if (Divide) {
                    edittext1.setText(in1 / in2 + "");
                    Divide = false;
                }
            }
        });

        btnClr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext1.setText("");
                in1 = 0.0;
                in2 = 0.0;
            }
        });

        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!deci) {
                    edittext1.setText(edittext1.getText() + ".");
                    deci = true;
                } else {
                    Toast.makeText(getApplicationContext(),"WrongClick",Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}



