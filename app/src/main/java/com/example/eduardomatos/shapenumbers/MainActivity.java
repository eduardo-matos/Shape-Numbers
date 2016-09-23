package com.example.eduardomatos.shapenumbers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void checkIsShapeNumber (View view) {
        int number = Integer.parseInt(((TextView) findViewById(R.id.numberField)).getText().toString());

        ShapeNumber checker = new ShapeNumber();

        String message;

        boolean isTriangular = checker.isTriangular(number);
        boolean isSquare = checker.isSquare(number);

        if (isTriangular && isSquare) {
            message = String.format("%d is both tringular and square!", number);
        } else if (isTriangular) {
            message = String.format("%d is triangular but not square.", number);
        } else if (isSquare) {
            message = String.format("%d is square but not triangular.", number);
        } else {
            message = String.format("%d is neither triangular nor square.", number);
        }

        ((TextView) findViewById(R.id.result)).setText(message);
    }
}
