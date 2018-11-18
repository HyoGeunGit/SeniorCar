package com.traffic.shimhg02.seniorcar

import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_signup.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

/**
 * Created by Kinetic on 2018-06-03.
 */

class SignUpActivity : BaseActivity() {

    override var viewId: Int = R.layout.activity_signup
    override var toolbarId: Int? = R.id.toolbar
    override fun onCreate() {

        logo.bringToFront()

        findViewById<Button>(R.id.sign_btn).setOnClickListener {
            Client.retrofitService.logUp(name_tv.text.toString(), id_tv.text.toString(), pw_tv.text.toString()).enqueue(object : Callback<Void> {
                override fun onResponse(call: Call<Void>?, response: Response<Void>?) {
                    when (response!!.code()) {
                        200 -> {
                            Toast.makeText(this@SignUpActivity, "회원가입 성공", Toast.LENGTH_LONG).show()
                            finish ()
                        }
                        405 -> Toast.makeText(this@SignUpActivity, "회원가입 실패 : 아이디나 비번이 올바르지 않습니다", Toast.LENGTH_LONG).show()
                        500 -> Toast.makeText(this@SignUpActivity, "회원가입 실패 : 서버 오류", Toast.LENGTH_LONG).show()
                    }
                }

                override fun onFailure(call: Call<Void>?, t: Throwable?) {
                }
            })
        }
    }
}