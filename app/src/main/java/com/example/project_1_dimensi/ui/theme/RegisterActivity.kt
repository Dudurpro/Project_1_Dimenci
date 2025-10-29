package com.example.project_1_dimensi.ui.theme

import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity : AppCompatActivity() {
    private lateinit var radioGroup: RadioGroup
    private lateinit var checkBox: CheckBox
    private lateinit var btnRegister: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        radioGroup = findViewById(R.id.radioGroup)
        checkBox = findViewById(R.id.checkBox)
        btnRegister = findViewById(R.id.btnRegister)
        btnRegister.setOnClickListener
        {

            val selectedRadioButtonId = radioGroup.checkedRadioButtonId
            if (selectedRadioButtonId == -1) {
                Toast.makeText(this, "Pilih jenis kelamin", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val jenisKelamin = when (selectedRadioButtonId) {
                R.id.radioPria -> "Pria"
                R.id.radioWanita -> "Wanita"
                else -> "Tidak Diketahui"
            }

            if (!checkBox.isChecked) {
                Toast.makeText(this, "Setujui Syarat & Ketentuan", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            Toast.makeText(this, "Jenis Kelamin: $jenisKelamin", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish()

            onCreate()spinnerDomisili.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
                override fun onItemSelected(parent: AdapterView<*>, view: android.view.View?, position: Int, id: Long) {
                    val kotaDipilih = parent.getItemAtPosition(position).toString()
                    Toast.makeText(this@RegisterActivity, "Domisili: $kotaDipilih", Toast.LENGTH_SHORT).show()
                }
                override fun onNothingSelected(parent: AdapterView<*>) {}
            }

        }
    }
}

