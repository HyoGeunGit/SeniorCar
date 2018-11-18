package com.traffic.shimhg02.seniorcar;


import android.app.Activity
import android.content.Context
import android.content.Intent
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast


class BluetoothFragment : Fragment(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_bluetooth,
                container,
                false)
        val btn = view.findViewById(R.id.blebtn) as Button
        btn.setOnClickListener(this)
        return view
    }

    override fun onClick(v: View) {
        val intent = Intent(v.context, BluetoothActivity::class.java)
        startActivity(intent)
    }

}