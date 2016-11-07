package com.example.phucv.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnLongClickListener, View.OnClickListener {

    String result = "0", screeMath = "", temp = "";
    double num1 = 0, num2 = 0;
    boolean trangthai = false;
    String pheptinh = "", pheptinh1 = "";
    TextView txtMath, txtResult;
    Button btn_0, btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_9, btn_cong, btn_tru,
            btn_nhan, btn_chia, btn_ketqua, btn_cham, btn_xoa;

    public double tinhtoan() {
        switch (pheptinh) {
            case "+":
                num1 = num1 + num2;
                break;
            case "-":
                num1 = num1 - num2;
                break;
            case "×":
                num1 = num1 * num2;
                break;
            case "÷":
                num1 = num1 / num2;
                result = num1 + "";
                break;
        }
        return num1;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtMath = (TextView) findViewById(R.id.txt_math);
        txtResult = (TextView) findViewById(R.id.txt_ans);

        btn_0 = (Button) findViewById(R.id.btn_0);
        btn_0.setOnClickListener(this);

        btn_1 = (Button) findViewById(R.id.btn_1);
        btn_1.setOnClickListener(this);

        btn_2 = (Button) findViewById(R.id.btn_2);
        btn_2.setOnClickListener(this);

        btn_3 = (Button) findViewById(R.id.btn_3);
        btn_3.setOnClickListener(this);

        btn_4 = (Button) findViewById(R.id.btn_4);
        btn_4.setOnClickListener(this);

        btn_5 = (Button) findViewById(R.id.btn_5);
        btn_5.setOnClickListener(this);

        btn_6 = (Button) findViewById(R.id.btn_6);
        btn_6.setOnClickListener(this);

        btn_7 = (Button) findViewById(R.id.btn_7);
        btn_7.setOnClickListener(this);

        btn_8 = (Button) findViewById(R.id.btn_8);
        btn_8.setOnClickListener(this);

        btn_9 = (Button) findViewById(R.id.btn_9);
        btn_9.setOnClickListener(this);

        btn_cong = (Button) findViewById(R.id.btn_cong);
        btn_cong.setOnClickListener(this);

        btn_tru = (Button) findViewById(R.id.btn_tru);
        btn_tru.setOnClickListener(this);

        btn_nhan = (Button) findViewById(R.id.btn_nhan);
        btn_nhan.setOnClickListener(this);

        btn_chia = (Button) findViewById(R.id.btn_chia);
        btn_chia.setOnClickListener(this);

        btn_cham = (Button) findViewById(R.id.btn_cham);
        btn_cham.setOnClickListener(this);

        btn_ketqua = (Button) findViewById(R.id.btn_ketqua);
        btn_ketqua.setOnClickListener(this);

        btn_xoa = (Button) findViewById(R.id.btn_xoa);
        btn_xoa.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.btn_0) {
            if (trangthai == false) {
                screeMath = "";
                result = "";
                num1 = num2 = 0;
                temp = "";
                trangthai = true;
            }
            if (result.equals("Khong thuc hien dươc")) {
                temp = "0";
                screeMath = "0";
            } else {
                screeMath += "0";
                temp += "0";
            }
        }
        txtMath.setText(screeMath);
        if (id == R.id.btn_1) {
            if (trangthai == false) {
                screeMath = "";
                result = "";
                num1 = num2 = 0;
                temp = "";
                trangthai = true;
            }
            if (result.equals("Khong thuc hien dươc")) {
                temp = "1";
                screeMath = "1";
            } else {
                screeMath += "1";
                temp += "1";
            }
        }
        txtMath.setText(screeMath);
        if (id == R.id.btn_2) {
            if (trangthai == false) {
                screeMath = "";
                result = "";
                num1 = num2 = 0;
                temp = "";
                trangthai = true;
            }
            if (result.equals("Khong thuc hien dươc")) {
                temp = "2";
                screeMath = "2";
            } else {
                screeMath += "2";
                temp += "2";
            }
        }
        txtMath.setText(screeMath);
        if (id == R.id.btn_3) {
            if (trangthai == false) {
                screeMath = "";
                result = "";
                num1 = num2 = 0;
                temp = "";
                trangthai = true;
            }
            if (result.equals("Khong thuc hien dươc")) {
                temp = "3";
                screeMath = "3";
            } else {
                screeMath += "3";
                temp += "3";
            }
        }
        txtMath.setText(screeMath);
        if (id == R.id.btn_4) {
            if (trangthai == false) {
                screeMath = "";
                result = "";
                num1 = num2 = 0;
                temp = "";
                trangthai = true;
            }
            if (result.equals("Khong thuc hien dươc")) {
                temp = "4";
                screeMath = "4";
            } else {
                screeMath += "4";
                temp += "4";
            }
        }
        txtMath.setText(screeMath);
        if (id == R.id.btn_5) {
            if (trangthai == false) {
                screeMath = "";
                result = "";
                num1 = num2 = 0;
                temp = "";
                trangthai = true;
            }
            if (result.equals("Khong thuc hien dươc")) {
                temp = "5";
                screeMath = "5";
            } else {
                screeMath += "5";
                temp += "5";
            }
        }
        txtMath.setText(screeMath);
        if (id == R.id.btn_6) {
            if (trangthai == false) {
                screeMath = "";
                result = "";
                num1 = num2 = 0;
                temp = "";
                trangthai = true;
            }
            if (result.equals("Khong thuc hien dươc")) {
                result = "6";
                screeMath = "6";
            } else {
                screeMath += "6";
                result += "6";
            }
        }
        txtMath.setText(screeMath);
        if (id == R.id.btn_7) {
            if (trangthai == false) {
                screeMath = "";
                result = "";
                num1 = num2 = 0;
                temp = "";
                trangthai = true;
            }
            if (result.equals("Khong thuc hien dươc")) {
                temp = "7";
                screeMath = "7";
            } else {
                screeMath += "7";
                temp += "7";
            }
        }
        txtMath.setText(screeMath);
        if (id == R.id.btn_8) {
            if (trangthai == false) {
                screeMath = "";
                result = "";
                num1 = num2 = 0;
                temp = "";
                trangthai = true;
            }
            if (result.equals("Khong thuc hien dươc")) {
                temp = "8";
                screeMath = "8";
            } else {
                screeMath += "8";
                temp += "8";
            }
        }
        txtMath.setText(screeMath);
        if (id == R.id.btn_9) {
            if (trangthai == false) {
                screeMath = "";
                result = "";
                num1 = num2 = 0;
                temp = "";
                trangthai = true;
            }
            if (result.equals("Khong thuc hien dươc")) {
                temp = "9";
                screeMath = "9";
            } else {
                screeMath += "9";
                temp += "9";
            }
        }
        txtMath.setText(screeMath);
        if (id == R.id.btn_cong) {
            pheptinh1 = "+";
            if (trangthai == false) {
                screeMath = num1 + "";
                result = num1 + "";
                pheptinh = "";
            } else if (pheptinh == "" && trangthai == true) {
                num1 = Double.parseDouble(temp);
                result = num1 + "";
            } else if (pheptinh != "" && trangthai == true && temp != "") {
                num2 = Double.parseDouble(temp);
                num1 = tinhtoan();
                result = num1 + "";
            } else if (pheptinh != "" && trangthai == true && temp == "") {
                pheptinh = "";
                screeMath = screeMath.substring(0, screeMath.length() - 3);
            }
            pheptinh = pheptinh1;
            screeMath += "+";
            temp = "";
            trangthai = true;
            txtMath.setText(screeMath);
            txtResult.setText(result);
        }
        txtMath.setText(screeMath);
        if (id == R.id.btn_tru) {
            pheptinh1 = "-";
            if (trangthai = false) {
                screeMath = num1 + "";
                result = num1 + "";
                pheptinh = "";
            } else if (pheptinh == "" && trangthai == true) {
                num1 = Double.parseDouble(temp);
                result = num1 + "";
            } else if (pheptinh != "" && trangthai == true && temp != "") {
                num2 = Double.parseDouble(temp);
                num1 = tinhtoan();
                result = num1 + "";
            } else if (pheptinh != "" && trangthai == true && temp == "") {
                pheptinh = "";
                screeMath = screeMath.substring(0, screeMath.length() - 3);
            }
            pheptinh = pheptinh1;
            screeMath += "-";
            temp = "";
            trangthai = true;
            txtMath.setText(screeMath);
            txtResult.setText(result);
        }
        txtMath.setText(screeMath);
        if (id == R.id.btn_nhan) {
            pheptinh1 = "×";
            if (trangthai == false) {
                screeMath = num1 + "";
                result = num1 + "";
                trangthai = true;
            } else if (pheptinh == "" && trangthai == true) {
                num1 = Double.parseDouble(temp);
                pheptinh = pheptinh1;
                result = num1 + "";
            } else if ((pheptinh == "×" || pheptinh == "÷") && trangthai == true && temp != "") {
                num2 = Double.parseDouble(temp);
                num1 = tinhtoan();
                result = num1 + "";
            } else if ((pheptinh == "+" || pheptinh == "-") && trangthai == true && temp != "") {
                num2 = Double.parseDouble(temp);
                num1 = tinhtoan();
                result = num1 + "";
            } else if (pheptinh != "" && trangthai == true && temp == "") {
                pheptinh = "";
                result = result.substring(0, result.length() - 3);
            }
            screeMath += " × ";
            pheptinh = pheptinh1;
            temp = "";
            trangthai = true;
            txtMath.setText(screeMath);
            txtResult.setText(result);
        }
        txtMath.setText(screeMath);
        if (id == R.id.btn_chia) {
            pheptinh1 = "÷";
            if (temp == "0") {
                result = "Không thực hiên được";
                num1 = num2 = 0;
                pheptinh = pheptinh1 = "";
                trangthai = false;
            } else if (trangthai == false) {
                screeMath = num1 + "";
                result = num1 + "";
                trangthai = true;
            } else if (pheptinh == "" && trangthai == true) {
                num1 = Double.parseDouble(temp);
                pheptinh = pheptinh1;
                result = num1 + "";
            } else if ((pheptinh == "x" || pheptinh == "÷") && trangthai == true && temp != "") {
                num2 = Double.parseDouble(temp);
                num1 = tinhtoan();
                result = num1 + "";
            } else if ((pheptinh == "+" || pheptinh == "-") && trangthai == true && temp != "") {
                num2 = Double.parseDouble(temp);
                num1 = tinhtoan();
                result = num1 + "";
            } else if (pheptinh != "" && trangthai == true && temp == "") {
                pheptinh1 = "";
                result = result.substring(0, result.length() - 3);
            }
            screeMath += " ÷ ";
            pheptinh = pheptinh1;
            temp = "";
            trangthai = true;
            txtMath.setText(screeMath);
            txtResult.setText(result);
        }
        txtMath.setText(screeMath);
        if (id == R.id.btn_ketqua) {
            if (trangthai == true && pheptinh1 == "") {
                num1 = Double.parseDouble(temp);
                result = num1 + "";
            } else if (trangthai == true && temp != "") {
                num2 = Double.parseDouble(temp);
                num1 = tinhtoan();
                result = num1 + "";
                temp = "";
            } else if (temp == "") {
                screeMath = num1 + "";
                result = num1 + "";
            }
            trangthai = false;
            txtMath.setText(screeMath);
            txtResult.setText(result);
        }
        if (id == R.id.btn_cham) {
            if (trangthai == false) {
                screeMath = "0.";
                num1 = num2 = 0;
                result = "";
                temp = "0.";
                trangthai = true;
            } else if ((screeMath.equals("") && trangthai == true) || temp.equals("")) {
                screeMath = screeMath + "0.";
                temp = "0.";
            } else {
                if (temp.indexOf(".") == -1) {
                    screeMath = screeMath + ".";
                    temp = temp + ".";
                }
            }
            txtMath.setText(screeMath);
            txtResult.setText(result);
        }
        txtMath.setText(screeMath);
        if (id == R.id.btn_xoa) {
            if (trangthai == false) {
                screeMath = "";
                result = "";
                num1 = num2 = 0;
                pheptinh = pheptinh1 = "";
            } else if (temp != "") {
                screeMath = screeMath.substring(0, screeMath.length() - temp.length());
                temp = "";
            } else if (temp == "" && pheptinh1 != "") {
                screeMath = num1 + "";
                pheptinh1 = "";
            } else if (temp == "" && pheptinh1 == "") {
                screeMath = "";
                result = "";
                num1 = num2 = 0;
                trangthai = false;
                pheptinh = pheptinh1 = "";
            }
            txtMath.setText(screeMath);
            txtResult.setText(result);
        }
    }

    @Override
    public boolean onLongClick(View v) {
        int id = v.getId();
        if (id == R.id.btn_xoa) {
            screeMath = "";
        }
        txtMath.setText(screeMath);
        return true;
    }
}
