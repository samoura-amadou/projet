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
        val buttonNature:Button = findViewById(R.id.buttonNature)
        val buttonSpace:Button = findViewById(R.id.buttonSpace)
        val buttonLogin:Button = findViewById(R.id.buttonLogin)
        val buttonCreate:Button = findViewById(R.id.buttonCreate)
        val buttonStudents:Button = findViewById(R.id.buttonStudents)

        (application as AppEpsi).showToast("Hello Epsi")

        buttonNature.setOnClickListener(View.OnClickListener {
            val newIntent= Intent(application,DetailActivity::class.java)
            newIntent.putExtra("title",getString(R.string.txt_home_nature))
            newIntent.putExtra("urlImage","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcROFiHOkKUHVBF3TcyU1NgawBlIV9mIoSGAuA&usqp=CAU")
            startActivity(newIntent)
        })

        buttonSpace.setOnClickListener(View.OnClickListener {
            val newIntent= Intent(application,DetailActivity::class.java)
            newIntent.putExtra("title",getString(R.string.txt_home_space))
            newIntent.putExtra("urlImage","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQkkZFu63Vi0djeAwcj0d7aaEgBsS1eHpGLbw&usqp=CAU")
            startActivity(newIntent)
        })

        buttonLogin.setOnClickListener(View.OnClickListener {
            val newIntent= Intent(application,LoginActivity::class.java)
            startActivity(newIntent)
        })

        buttonCreate.setOnClickListener(View.OnClickListener {
            val newIntent= Intent(application,CreateActivity::class.java)
            startActivity(newIntent)
        })

        buttonStudents.setOnClickListener(View.OnClickListener {
            val newIntent= Intent(application,StudentsActivity::class.java)
            startActivity(newIntent)
        })
    }


}