package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    private lateinit var firstName:EditText
    private lateinit var secondName:EditText
    private lateinit var btfullName:button
    private lateinit var btlastName:button
    private lateinit var title:TextView

    @suppressLint("missingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        firstName = findViewById(R.id.et_firstName)
        secondName = findViewById(R.id.et_secondName)
        btfullName = findViewById(R.id.et_btfullName)
        btlastName = findViewById(R.id.et_btlastName)

        title.Text = resources.getString(R.string. .name)

        title.setOnClickListener(
            val intent = Intent(PackageContent,MainActivity::class.java)
            intent.putExtra(name"fullname",title.Text.toString())
            intent.putExtra(name"lastname",title.Text.toString())

            startActivity(intent)
        )
    }
}