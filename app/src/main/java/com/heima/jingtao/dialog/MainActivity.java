package com.heima.jingtao.dialog;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;

import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void click1(View v) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setIcon(android.R.drawable.alert_dark_frame);
        builder.setTitle("需练此功必先自宫");
        builder.setMessage("你要想清楚奥");


        builder.setPositiveButton("确定", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "感谢", Toast.LENGTH_LONG).show();

            }
        });
        builder.setNegativeButton("取消", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "你是sb", Toast.LENGTH_LONG).show();
            }
        });

        AlertDialog dialog = builder.create();
        dialog.show();
    }

    public void click2(View v) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("性别");

        final String[] items = new String[]{
                "男",
                "女",
        };

        builder.setSingleChoiceItems(items, -1, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "您选择的是:" + items[which], Toast.LENGTH_LONG).show();
                dialog.dismiss();
            }
        });
        builder.show();
    }
}
