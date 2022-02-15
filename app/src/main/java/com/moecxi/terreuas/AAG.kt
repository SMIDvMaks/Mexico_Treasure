package com.moecxi.terreuas

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import com.moecxi.terreuas.R.drawable.*
import kotlinx.android.synthetic.main.activity_aag.*

class AAG : AppCompatActivity() {
    lateinit var Ard1: Array<Int>
    lateinit var Ard2: Array<Int>
    lateinit var Ard3: Array<Int>
    lateinit var Ard4: Array<Int>
    lateinit var Ard5: Array<Int>
    private var counter: Int = 0
    private var rip:Int = ic_slot_6
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aag)
        window.addFlags(1024)
        Ard1 = arrayOf(
            ic_slot_1,
            ic_slot_2,
            ic_slot_3,
            ic_slot_4,
            ic_slot_5,
            ic_slot_6
        )
        Ard2 = arrayOf(
            ic_slot_1,
            ic_slot_2,
            ic_slot_3,
            ic_slot_4,
            ic_slot_5,
            ic_slot_6,
            ic_slot_6
        )
        Ard3 = arrayOf(
            ic_slot_1,
            ic_slot_2,
            ic_slot_3,
            ic_slot_4,
            ic_slot_5,
            ic_slot_6,
            ic_slot_6,
            ic_slot_6
        )
        Ard4 = arrayOf(
            ic_slot_1,
            ic_slot_2,
            ic_slot_3,
            ic_slot_4,
            ic_slot_5,
            ic_slot_6,
            ic_slot_6,
            ic_slot_6,
            ic_slot_6
        )
        Ard5 = arrayOf(
            ic_slot_1,
            ic_slot_2,
            ic_slot_3,
            ic_slot_4,
            ic_slot_5,
            ic_slot_6,
            ic_slot_6,
            ic_slot_6,
            ic_slot_6,
            ic_slot_6
        )

        img1.setOnClickListener {
            RRRP(Ard1, img1)
            img2.setOnClickListener {
                RRRP(Ard1, img2)
                img3.setOnClickListener {
                    RRRP(Ard2, img3)
                    img4.setOnClickListener {
                        RRRP(Ard2, img4)
                        img5.setOnClickListener {
                            RRRP(Ard3, img5)

                            img6.setOnClickListener {
                                RRRP(Ard3, img6)

                                img7.setOnClickListener {
                                    RRRP(Ard4, img7)
                                    img8.setOnClickListener {
                                        RRRP(Ard4, img8)
                                        img9.setOnClickListener {
                                            RRRP(Ard5, img9)

                                            img10.setOnClickListener {
                                                RRRP(Ard5, img10)
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }








    }


    @SuppressLint("SetTextI18n")
    fun RRRP(arik: Array<Int>, img1: ImageView) {
        arik.shuffle()
        img1.setImageResource(arik[0])
        img1.tag = arik[0]
        if (arik[0]== rip){
            Toast.makeText(this,"You Lost, Try again",Toast.LENGTH_SHORT).show()
            counter -=1
            recreate()
        }else {
            counter +=1
            txt2.text = "Score: $counter"
        }

    }
}