package com.example.languagecourses.fragment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.languagecourses.Activties.information
import com.example.languagecourses.R
import com.example.languagecourses.databinding.ActivityRegistrationBinding
import com.google.firebase.auth.FirebaseAuth

@Suppress("DEPRECATION")
class Registration : AppCompatActivity() {
    lateinit var binding : ActivityRegistrationBinding
    lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegistrationBinding.inflate(layoutInflater)
        setContentView(binding.root)
        auth=FirebaseAuth.getInstance()

        //initialize animation

        val fadeIn = AnimationUtils.loadAnimation(this, R.anim.fade_in)
        val bottomDown = AnimationUtils.loadAnimation(this, R.anim.bottom_down)


        //setting the bottom down animation on top layout

        binding.topLinearLayout.animation =bottomDown

        //create handler for other layout

        var handler = Handler()
        var runnable = Runnable{

            //let's set fade in animation  on other layout

            binding.cardView3.animation = fadeIn
            binding.textView.animation = fadeIn
            binding.loginLayout1.animation = fadeIn
        }
        handler.postDelayed(runnable,100)

        val signup = findViewById<TextView>(R.id.btnsignup)
        signup.setOnClickListener{
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }

        val signin = findViewById<ConstraintLayout>(R.id.login_layout_1)
        signin.setOnClickListener{
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }

        binding.btnsignup.setOnClickListener {
            if(check()){
                val email=binding.etMail.text.toString()
                val password=binding.etPassword.text.toString()
                val name=binding.etName.text.toString()
                val phone=binding.etPhone.text.toString()

                auth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(this) {
                    task->
                    if(task.isSuccessful){
                        Toast.makeText(this,"Registerd",Toast.LENGTH_LONG).show()
                        val intent=Intent(this,Login::class.java)
                        startActivity(intent)

                    }
                    else{
                        Toast.makeText(this,"Already Registerd With This Email",Toast.LENGTH_LONG).show()
                    }
                }
            }
            else{
                Toast.makeText(this,"Enter Details",Toast.LENGTH_LONG).show()
            }
        }
    }
    private fun check():Boolean {
        if(binding.etName.text.toString().isNotEmpty()
            && binding.etPhone.text.toString().isNotEmpty()
            && binding.etMail.text.toString().isNotEmpty()
            && binding.etPassword.text.toString().isNotEmpty()
            ) {
            return true
        }
          return false
    }
}