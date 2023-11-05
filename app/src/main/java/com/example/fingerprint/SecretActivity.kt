package com.example.fingerprint

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SecretActivity : AppCompatActivity() {

    private lateinit var showAnswerButton: Button
    private lateinit var cipherText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secret)

        showAnswerButton = findViewById(R.id.showAnswerButton)
        cipherText = findViewById(R.id.cipherText)

        // Set the initial text for the cipherText TextView
        cipherText.text = "D RNXHT VHRVCK VKKXOW FYVF V OVFY\nGENBWKKNE'K PWEC BVPNEDFW TWKKWEF DK GD.\nThis puzzle is called a Cryptoquip."

        showAnswerButton.setOnClickListener {
            // When the button is clicked, reveal the answer
            cipherText.text = "The answer is: ALWAYS"
        }
    }
}