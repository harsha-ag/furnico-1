package com.example.furnico;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.List;

public class OrderPaymentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_payment);
        findViewById(R.id.bt_activity_order_pay).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
            }
        });
        TextView total = findViewById(R.id.tv_activity_order_payment_pay);
        //total.setText(String.valueOf());
        findViewById(R.id.bt_activity_order_pay).setOnClickListener(v -> {
            Intent intent = new Intent(this,MainActivity.class);
            Toast.makeText(this,"Payment Made" ,Toast.LENGTH_SHORT).show();
            startActivity(intent);
        });
    }
}