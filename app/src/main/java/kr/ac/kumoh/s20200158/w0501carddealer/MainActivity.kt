package kr.ac.kumoh.s20200158.w0501carddealer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kr.ac.kumoh.s20200158.w0501carddealer.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        //setContentView(R.layout.activity_main)
        setContentView(binding.root)

        getCardName(29) // 29 : heart 4번

        binding.card1.setImageResource(R.drawable.c_10_of_diamonds)
    }

    private fun getCardName(c: Int) : String {
        Log.i("getCardName() : ", c.toString()) // 29

        val shape = when (c / 13) {
            0 -> "spades"
            1 -> "diamonds"
            2 -> "hearts"
            3 -> "clubs"
            else -> "error"
        }
        Log.i("getCardName() : ", shape) // hearts
        // val shape = c / 13
        // Log.i("getCardName() : ", shape.toString()) // 2

        val number = when (c % 13) {
            in 1..9 -> ((c % 13) + 1).toString()
            else -> "error"
        }
        Log.i("getCardName() : ", number.toString())

        // val number = c % 13
        // Log.i("getCardName() : ", number.toString()) // 3

        //Log.i("getCardName() : ", (c / 13).toString()) // 2
        //Log.i("getCardName() : ", (c % 13).toString()) // 3

        return "c_ace_of_spades"
    }
}