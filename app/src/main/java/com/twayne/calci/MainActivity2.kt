package com.twayne.calci

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowInsets
import com.twayne.calci.databinding.ActivityMain2Binding
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(R.layout.activity_main2)
        setContentView(binding.root)
        //Let's Hide The Shitty Action And Status Bar //
        supportActionBar!!.hide()
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R)
            window.insetsController?.hide(WindowInsets.Type.statusBars())
            binding.ac.setOnClickListener {
            binding.inputbyuser.text = ""
            binding.answerbycalci.text = ""
        }
             binding.zero.setOnClickListener {
            binding.inputbyuser.append("0")
        }
             binding.bu1.setOnClickListener {
            binding.inputbyuser.append("1")
        }
            binding.bu2.setOnClickListener {
            binding.inputbyuser.append("2")

            binding.bu3.setOnClickListener {
                binding.inputbyuser.append("3")
            }
            binding.bu4.setOnClickListener {
                binding.inputbyuser.append("4")
            }
            binding.bu5.setOnClickListener {
                binding.inputbyuser.append("5")
            }
            binding.bu6.setOnClickListener {
                binding.inputbyuser.append("6")
            }
            binding.bu7.setOnClickListener {
                binding.inputbyuser.append("7")
            }
            binding.bu8.setOnClickListener {
                binding.inputbyuser.append("8")
            }
            binding.bu9.setOnClickListener {
                binding.inputbyuser.append("9")
            }
                binding.point.setOnClickListener {
                    binding.inputbyuser.append(".")
                }
        }
             binding.add.setOnClickListener {
            binding.inputbyuser.append(" + ")
        }
        binding.multi.setOnClickListener {
            binding.inputbyuser.append(" * ")
        }
        binding.divide.setOnClickListener {
            binding.inputbyuser.append(" / ")
        }
        binding.sub.setOnClickListener {
            binding.inputbyuser.append(" - ")
        }
        binding.openbrac.setOnClickListener {
            binding.inputbyuser.append(" ( ")
        }
        binding.closebrac.setOnClickListener {
            binding.inputbyuser.append(" ) ")
        }
        binding.equals.setOnClickListener {
            val expression= ExpressionBuilder(binding.inputbyuser.text.toString()).build()
            val result = expression.evaluate()
            val longresult = result.toLong()

            if (result == longresult.toDouble()) {
                binding.answerbycalci.text = longresult.toString()
            }
            else{
                binding.answerbycalci.text = result.toString()
            }
        }
    }
}