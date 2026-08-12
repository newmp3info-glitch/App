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

        // Add Cash Click Action (Redirects to your website deposit/game page)
        btnAddCash.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, android.net.Uri.parse("https://fastyonoapp.online"))
            startActivity(intent)
        }

        // Withdraw Click Action (Opens Withdraw Form Activity)
        btnWithdraw.setOnClickListener {
            val intent = Intent(this, WithdrawActivity::class.java)
            startActivity(intent)
        }

        // Share Referral Link with your official domain
        btnShare.setOnClickListener {
            val shareText = "Join Fast Yono App and get ৳50 Bonus! Download now: https://www.fastyonoapp.online/?code=VIPQSYFW1U7"
            val intent = Intent().apply {
                action = Intent.ACTION_SEND
                type = "text/plain"
                putExtra(Intent.EXTRA_TEXT, shareText)
            }
            startActivity(Intent.createChooser(intent, "Share Referral Link via"))
        }

        // My Rewards Click Action
        btnRewards.setOnClickListener {
            Toast.makeText(this, "Your Reward Balance: ৳9.00", Toast.LENGTH_SHORT).show()
        }

        // My Referrals Click Action
        btnReferrals.setOnClickListener {
            Toast.makeText(this, "Total Referrals: 0 | Earned: ৳0.00", Toast.LENGTH_SHORT).show()
        }

        // Leaderboard Click Action
        btnLeaderboard.setOnClickListener {
            Toast.makeText(this, "Top Earners Leaderboard Loading...", Toast.LENGTH_SHORT).show()
        }
    }
}
