package com.traffic.shimhg02.seniorcar;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.security.Permission;

import static android.Manifest.permission.CALL_PHONE;

public class CallActivity extends Activity implements View.OnClickListener {

    private Button mCall;
    private Button mDialogCall;
    private EditText mEditNumber;
    private String mNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        requestPermissions(new String[]{CALL_PHONE}, 1);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call);

        mCall = (Button) findViewById(R.id.btnCall);
        mDialogCall = (Button) findViewById(R.id.btnDialog);
        mEditNumber = (EditText) findViewById(R.id.edtNumber);

        mCall.setOnClickListener(this);
        mDialogCall.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        mNum = mEditNumber.getText().toString();
        String tel = "tel:" + mNum;
        switch (v.getId()){
            case R.id.btnCall:
                startActivity(new Intent("android.intent.action.CALL", Uri.parse(tel)));
                break;
            case R.id.btnDialog:
                startActivity(new Intent("android.intent.action.DIAL", Uri.parse(tel)));
                break;
        }
    }
}
