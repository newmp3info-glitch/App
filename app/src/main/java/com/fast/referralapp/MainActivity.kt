package com.fast.referralapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnAddCash = findViewById<Button>(R.id.btnAddCash)
        val btnWithdraw = findViewById<Button>(R.id.btnWithdraw)
        val btnShare = findViewById<Button>(R.id.btnShare)
        val btnRewards = findViewById<Button>(R.id.btnRewards)
        val btnReferrals = findViewById<Button>(R.id.btnReferrals)
        val btnLeaderboard = findViewById<Button>(R.id.btnLeaderboard)

        // Add Cash Click Action
        btnAddCash.setOnClickListener {
            Toast.makeText(this, "Add Cash feature opened", Toast.LENGTH_SHORT).show()
        }

        // Withdraw Click Action
        btnWithdraw.setOnClickListener {
            Toast.makeText(this, "Withdrawable Balance: ৳ 0.96 (Min withdraw ৳100)", Toast.LENGTH_LONG).show()
        }

        // Share Referral Link with your official domain
        btnShare.setOnClickListener {
            val shareText = "Join Fast Yono App and start earning daily! Use my link: https://fastyonoapp.online/?code=VIPQSYFW1U7"
            val intent = Intent().apply {
                action = Intent.ACTION_SEND
                type = "text/plain"
                putExtra(Intent.EXTRA_TEXT, shareText)
            }
            startActivity(Intent.createChooser(intent, "Share Referral Link via"))
        }

        // My Rewards Click Action
        btnRewards.setOnClickListener {
            Toast.makeText(this, "Opening My Rewards...", Toast.LENGTH_SHORT).show()
        }

        // My Referrals Click Action
        btnReferrals.setOnClickListener {
            Toast.makeText(this, "Loading Total Referrals...", Toast.LENGTH_SHORT).show()
        }

        // Leaderboard Click Action
        btnLeaderboard.setOnClickListener {
            Toast.makeText(this, "Opening Leaderboard...", Toast.LENGTH_SHORT).show()
        }
    }
}
