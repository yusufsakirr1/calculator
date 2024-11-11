package com.yusufsakir.hesapmakinesi

import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.yusufsakir.hesapmakinesi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
    fun mySum(view : View){
        val myNumber1 = binding.editText1.text.toString().toDoubleOrNull()
        val myNumber2 = binding.editText2.text.toString().toDoubleOrNull()
        if (myNumber1 != null && myNumber2 != null){
            val result = myNumber1+ myNumber2
            binding.textView.text = "Result: ${result}"
        }else{
            binding.textView.text ="Enter Number!"
        }
    }
    fun mySub(view : View){
        val myNumber1 = binding.editText1.text.toString().toDoubleOrNull()
        val myNumber2 = binding.editText2.text.toString().toDoubleOrNull()
        if (myNumber1 != null && myNumber2 != null){
            val result = myNumber1- myNumber2
            binding.textView.text = "Result: ${result}"
        }else{
            binding.textView.text ="Enter Number!"
        }
    }
    fun myMultipl(view : View){
        val myNumber1 = binding.editText1.text.toString().toDoubleOrNull()
        val myNumber2 = binding.editText2.text.toString().toDoubleOrNull()
        if (myNumber1 != null && myNumber2 != null){
            val result = myNumber1* myNumber2
            binding.textView.text = "Result: ${result}"
        }else{
            binding.textView.text ="Enter Number!"
        }
    }
    fun myDiv(view : View){
        val myNumber1 = binding.editText1.text.toString().toDoubleOrNull()
        val myNumber2 = binding.editText2.text.toString().toDoubleOrNull()
        if (myNumber1 != null && myNumber2 != null){
            val result = myNumber1/ myNumber2
            binding.textView.text = "Result: ${result}"
        }else{
            binding.textView.text ="Enter Number!"
        }

    }


}