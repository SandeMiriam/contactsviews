package com.example.mycontacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.Toast
import com.example.mycontacts.databinding.ActivityViewContactBinding
import com.squareup.picasso.Picasso

class viewContactActivity : AppCompatActivity() {
    lateinit var binding: ActivityViewContactBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityViewContactBinding.inflate(layoutInflater)
        setContentView(binding.root)
        getExtras()
    }
    fun  getExtras(){
        val extras=intent.extras
        var name=extras?.getString("NAME","")
        var phone=extras?.getString("PHONE_NUMBER","")
        var email=extras?.getString("EMAIL","")
        var address=extras?.getString("ADDRESS","")
        var image= binding.imgUser



        Toast.makeText(this,name,Toast.LENGTH_LONG).show()
        Toast.makeText(this,phone,Toast.LENGTH_LONG).show()
        binding.tvName.text=name
        binding.tvPhone1.text=phone
        binding.tvAddress.text=address
        binding.tvEmail.text=email
        Picasso.get().load(intent.getStringExtra("IMAGE")).into(image)
    }
}