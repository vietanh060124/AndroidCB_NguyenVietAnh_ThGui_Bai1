package com.example.thgui_bai1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText etSoA, etSoB;
    private TextView tvKetQua;
    private Button btnTong, btnHieu, btnTich, btnThuong, btnUCLN, btnThoat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etSoA = findViewById(R.id.etSoA);
        etSoB = findViewById(R.id.etSoB);
        tvKetQua = findViewById(R.id.tvKetQua);
        btnTong = findViewById(R.id.btnTong);
        btnHieu = findViewById(R.id.btnHieu);
        btnTich = findViewById(R.id.btnTich);
        btnThuong = findViewById(R.id.btnThuong);
        btnUCLN = findViewById(R.id.btnUCLN);
        btnThoat = findViewById(R.id.btnThoat);

        btnTong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(etSoA.getText().toString());
                int b = Integer.parseInt(etSoB.getText().toString());
                int result = a + b;
                tvKetQua.setText("Kết quả: " + result);
            }
        });


        btnHieu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(etSoA.getText().toString());
                int b = Integer.parseInt(etSoB.getText().toString());
                int result = a - b;
                tvKetQua.setText("Kết quả: " + result);
            }
        });

        btnTich.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(etSoA.getText().toString());
                int b = Integer.parseInt(etSoB.getText().toString());
                int result = a * b;
                tvKetQua.setText("Kết quả: " + result);
            }
        });

        btnThuong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(etSoA.getText().toString());
                int b = Integer.parseInt(etSoB.getText().toString());
                if (b != 0) {
                    double result = (double) a / b;
                    tvKetQua.setText("Kết quả: " + result);
                } else {
                    tvKetQua.setText("Không thể chia cho 0");
                }
            }
        });

        btnUCLN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(etSoA.getText().toString());
                int b = Integer.parseInt(etSoB.getText().toString());
                int result = UCLN(a, b);
                tvKetQua.setText("Ước chung lớn nhất: " + result);
            }
        });

        btnThoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); // Thoát chương trình
            }
        });
    }

    private int UCLN(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}