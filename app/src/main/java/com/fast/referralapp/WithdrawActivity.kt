package com.fast.referralapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class WithdrawActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_withdraw)

        val etAccountName = findViewById<EditText>(R.id.etAccountName)
        val etAccountNumber = findViewById<EditText>(R.id.etAccountNumber)
        val etAmount = findViewById<EditText>(R.id.etAmount)
        val btnSubmitWithdraw = findViewById<Button>(R.id.btnSubmitWithdraw)

        btnSubmitWithdraw.setOnClickListener {
            val name = etAccountName.text.toString()
            val acc = etAccountNumber.text.toString()
            val amount = etAmount.text.toString()

            if (name.isEmpty() || acc.isEmpty() || amount.isEmpty()) {
                Toast.makeText(this, "Please fill all details", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Withdrawal Request Submitted Successfully!", Toast.LENGTH_LONG).show()
                finish()
            }
        }
    }
}
