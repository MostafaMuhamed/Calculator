package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{
    Button buttonC,buttonResult;
    Button buttonSeven,buttonEight,buttonNine,buttonDivider;
    Button buttonFour,buttonFive,buttonSix,buttonMultiplay;
    Button buttonOne,buttonTwo,buttonThree,buttonSubtract;
    Button buttonZero,buttonPoint,buttonAdd,buttonEqual;

     private int firstNumber = 0;
     private int secondNumber = 0;
     private String op = "";
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        call();

    }

    private void call()
    {
        fvByID();
        seven();
        eight();
        nine();
        four();
        five();
        six();
        one();
        two();
        three();
        zero();
        point();
        c();
        diviDer();
        multY();
        subTrac();
        adD();
        eqUal();
    }

    private void fvByID()
    {
        buttonC = findViewById(R.id.btn_C);
        buttonResult = findViewById(R.id.btn_result);
        buttonSeven = findViewById(R.id.btn_seven);
        buttonEight = findViewById(R.id.btn_eight);
        buttonNine = findViewById(R.id.btn_nine);
        buttonDivider = findViewById(R.id.btn_divider);
        buttonFour = findViewById(R.id.btn_four);
        buttonFive = findViewById(R.id.btn_five);
        buttonSix = findViewById(R.id.btn_six);
        buttonMultiplay = findViewById(R.id.btn_multiplay);
        buttonOne = findViewById(R.id.btn_one);
        buttonTwo = findViewById(R.id.btn_two);
        buttonThree = findViewById(R.id.btn_three);
        buttonSubtract = findViewById(R.id.btn_subtract);
        buttonZero = findViewById(R.id.btn_zero);
        buttonPoint = findViewById(R.id.btn_point);
        buttonAdd = findViewById(R.id.btn_add);
        buttonEqual = findViewById(R.id.btn_equal);
    }
    public void seven()
    {
        buttonSeven.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                buttonResult.append("7");
            }
        });
    }

    public void eight()
    {
        buttonEight.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                buttonResult.append("8");
            }
        });
    }

    public void nine()
    {
        buttonNine.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
             buttonResult.append("9");
            }
        });
    }

    public void four()
    {
        buttonFour.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                buttonResult.append("4");
            }
        });
    }

    public void five()
    {
        buttonFive.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                buttonResult.append("5");
            }
        });
    }

    public void six()
    {
        buttonSix.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                buttonResult.append("6");
            }
        });
    }

    public void one()
    {
        buttonOne.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                buttonResult.append("1");
            }
        });
    }

    public void two()
    {
        buttonTwo.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                buttonResult.append("2");
            }
        });
    }

    public void three()
    {
        buttonThree.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                buttonResult.append("3");
            }
        });
    }

    public void zero()
    {
        buttonZero.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                buttonResult.append("0");
            }
        });
    }

    public void point()
    {
        buttonPoint.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                buttonResult.append(".");
            }
        });
    }

    public void c()
    {
        buttonC.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                buttonResult.setText("");
            }
        });
    }

    public void diviDer()
    {
        buttonDivider.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String fN = buttonResult.getText().toString();
                firstNumber = Integer.parseInt(fN);
                buttonResult.setText("");
                 op = "/";
            }
        });
    }

    public void multY()
    {
        buttonMultiplay.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String fN = buttonResult.getText().toString();
                firstNumber = Integer.parseInt(fN);
                buttonResult.setText("");
                op = "*";
            }
        });
    }

    public void subTrac()
    {
        buttonSubtract.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String fN = buttonResult.getText().toString();
                firstNumber = Integer.parseInt(fN);
                buttonResult.setText("");
                op = "-";
            }
        });
    }

    public void adD()
    {
        buttonAdd.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String fN = buttonResult.getText().toString();
                firstNumber = Integer.parseInt(fN);
                buttonResult.setText("");
                op = "+";
            }
        });
    }

    public void eqUal()
    {
        buttonEqual.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String sN = buttonResult.getText().toString();
                secondNumber = Integer.parseInt(sN);
                buttonResult.setText("");
                if (op == "/")
                {
                    buttonResult.setText(String.valueOf(firstNumber/secondNumber));
                }
                else if (op == "*")
                {
                    buttonResult.setText(String.valueOf(firstNumber*secondNumber));
                }
                else if (op == "-")
                {
                    buttonResult.setText(String.valueOf(firstNumber-secondNumber));
                }
                else if (op == "+")
                {
                    buttonResult.setText(String.valueOf(firstNumber+secondNumber));
                }

               }

        });
    }

}
