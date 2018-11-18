package com.traffic.shimhg02.seniorcar;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

class FragmentCall: Fragment(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_call,
                container,
                false)
        val btn = view.findViewById(R.id.callbtn) as Button
        btn.setOnClickListener(this)
        return view
    }

    override fun onClick(v: View) {
        val intent = Intent(v.context, CallActivity::class.java)
        startActivity(intent)
    }

}

