package fr.epsi.epsig2

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView:TextView = findViewById(R.id.textViewTitle)
        val button:Button = findViewById(R.id.buttonHome)

        button.setOnClickListener(View.OnClickListener {
            textView.setText("Epsi")
            val newIntent= Intent(application,DetailActivity::class.java)
            startActivity(newIntent)
        })
    }
}