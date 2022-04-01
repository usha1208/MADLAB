import android.R
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


<?xml version="1.0" encoding="utf-8"?>
<LinearLayout
xmlns:android="http://schemas.android.com/apk/res/android"
xmlns:app="http://schemas.android.com/apk/res-auto"
xmlns:tools="http://schemas.android.com/tools"
android:id="@+id/contain"
android:layout_width="match_parent"
android:layout_height="match_parent"
android:background="@color/white"
android:orientation="vertical"
tools:context=".MainActivity">

<TextView
android:id="@+id/textView1"
android:layout_width="match_parent"
android:layout_height="wrap_content"
android:layout_marginTop="50dp"
android:layout_marginBottom="80dp"
android:gravity="center"
android:textColor="@color/black"
android:text="REC"
android:textAlignment="center"
android:textSize="10dp" />

<Button
android:id="@+id/button1"
android:layout_width="200dp"
android:layout_height="wrap_content"
android:layout_marginLeft="95dp"
android:text="FONT SIZE" />

<Button
android:id="@+id/button2"
android:layout_width="200dp"
android:layout_height="wrap_content"
android:layout_marginLeft="95dp"
android:text="FONT COLOR" />

<Button
android:id="@+id/button3"
android:layout_width="200dp"
android:layout_height="wrap_content"
android:layout_marginLeft="95dp"
android:text="BACKGROUND" />
</LinearLayout>
package com.example.scientificcalculator
class MainActivity : AppCompatActivity() {
    var b1: Button? = null
    var b2: Button? = null
    var b3: Button? = null
    var b4: Button? = null
    var b5: Button? = null
    var b6: Button? = null
    var b7: Button? = null
    var b8: Button? = null
    var b9: Button? = null
    var b0: Button? = null
    var bdot: Button? = null
    var bpi: Button? = null
    var bequal: Button? = null
    var bplus: Button? = null
    var bmin: Button? = null
    var bmul: Button? = null
    var bdiv: Button? = null
    var binv: Button? = null
    var bsqrt: Button? = null
    var bsquare: Button? = null
    var bfact: Button? = null
    var bln: Button? = null
    var blog: Button? = null
    var btan: Button? = null
    var bcos: Button? = null
    var bsin: Button? = null
    var bb1: Button? = null
    var bb2: Button? = null
    var bc: Button? = null
    var bac: Button? = null
    var tvmain: TextView? = null
    var tvsec: TextView? = null
    var pi = "3.14159265"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        b1 = findViewById(R.id.b1)
        b2 = findViewById(R.id.b2)
        b3 = findViewById(R.id.b3)
        b4 = findViewById(R.id.b4)
        b5 = findViewById(R.id.b5)
        b6 = findViewById(R.id.b6)
        b7 = findViewById(R.id.b7)
        b8 = findViewById(R.id.b8)
        b9 = findViewById(R.id.b9)
        b0 = findViewById(R.id.b0)
        bpi = findViewById(R.id.bpi)
        bdot = findViewById(R.id.bdot)
        bequal = findViewById(R.id.bequal)
        bplus = findViewById(R.id.bplus)
        bmin = findViewById(R.id.bmin)
        bmul = findViewById(R.id.bmul)
        bdiv = findViewById(R.id.bdiv)
        binv = findViewById(R.id.binv)
        bsqrt = findViewById(R.id.bsqrt)
        bsquare = findViewById(R.id.bsquare)
        bfact = findViewById(R.id.bfact)
        bln = findViewById(R.id.bln)
        blog = findViewById(R.id.blog)
        btan = findViewById(R.id.btan)
        bsin = findViewById(R.id.bsin)
        bcos = findViewById(R.id.bcos)
        bb1 = findViewById(R.id.bb1)
        bb2 = findViewById(R.id.bb2)
        bc = findViewById(R.id.bc)
        bac = findViewById(R.id.bac)
        tvmain = findViewById(R.id.tvmain)
        tvsec = findViewById(R.id.tvsec)

        //onclick listeners
        b1.setOnClickListener(View.OnClickListener {
            tvmain.setText(
                tvmain.getText().toString() + "1"
            )
        })
        b2.setOnClickListener(View.OnClickListener {
            tvmain.setText(
                tvmain.getText().toString() + "2"
            )
        })
        b3.setOnClickListener(View.OnClickListener {
            tvmain.setText(
                tvmain.getText().toString() + "3"
            )
        })
        b4.setOnClickListener(View.OnClickListener {
            tvmain.setText(
                tvmain.getText().toString() + "4"
            )
        })
        b5.setOnClickListener(View.OnClickListener {
            tvmain.setText(
                tvmain.getText().toString() + "5"
            )
        })
        b6.setOnClickListener(View.OnClickListener {
            tvmain.setText(
                tvmain.getText().toString() + "6"
            )
        })
        b7.setOnClickListener(View.OnClickListener {
            tvmain.setText(
                tvmain.getText().toString() + "7"
            )
        })
        b8.setOnClickListener(View.OnClickListener {
            tvmain.setText(
                tvmain.getText().toString() + "8"
            )
        })
        b9.setOnClickListener(View.OnClickListener {
            tvmain.setText(
                tvmain.getText().toString() + "9"
            )
        })
        b0.setOnClickListener(View.OnClickListener {
            tvmain.setText(
                tvmain.getText().toString() + "0"
            )
        })
        bdot.setOnClickListener(View.OnClickListener {
            tvmain.setText(
                tvmain.getText().toString() + "."
            )
        })
        bac.setOnClickListener(View.OnClickListener {
            tvmain.setText("")
            tvsec.setText("")
        })
        bc.setOnClickListener(View.OnClickListener {
            var `val` = tvmain.getText().toString()
            `val` = `val`.substring(0, `val`.length - 1)
            tvmain.setText(`val`)
        })
        bplus.setOnClickListener(View.OnClickListener {
            tvmain.setText(
                tvmain.getText().toString() + "+"
            )
        })
        bmin.setOnClickListener(View.OnClickListener {
            tvmain.setText(
                tvmain.getText().toString() + "-"
            )
        })
        bmul.setOnClickListener(View.OnClickListener {
            tvmain.setText(
                tvmain.getText().toString() + "×"
            )
        })
        bdiv.setOnClickListener(View.OnClickListener {
            tvmain.setText(
                tvmain.getText().toString() + "÷"
            )
        })
        bsqrt.setOnClickListener(View.OnClickListener {
            val `val` = tvmain.getText().toString()
            val r = Math.sqrt(`val`.toDouble())
            tvmain.setText(r.toString())
        })
        bb1.setOnClickListener(View.OnClickListener {
            tvmain.setText(
                tvmain.getText().toString() + "("
            )
        })
        bb2.setOnClickListener(View.OnClickListener {
            tvmain.setText(
                tvmain.getText().toString() + ")"
            )
        })
        bpi.setOnClickListener(View.OnClickListener {
            tvsec.setText(bpi.getText())
            tvmain.setText(tvmain.getText().toString() + pi)
        })
        bsin.setOnClickListener(View.OnClickListener {
            tvmain.setText(
                tvmain.getText().toString() + "sin"
            )
        })
        bcos.setOnClickListener(View.OnClickListener {
            tvmain.setText(
                tvmain.getText().toString() + "cos"
            )
        })
        btan.setOnClickListener(View.OnClickListener {
            tvmain.setText(
                tvmain.getText().toString() + "tan"
            )
        })
        binv.setOnClickListener(View.OnClickListener {
            tvmain.setText(
                tvmain.getText().toString() + "^" + "(-1)"
            )
        })
        bfact.setOnClickListener(View.OnClickListener {
            val `val` = tvmain.getText().toString().toInt()
            val fact = factorial(`val`)
            tvmain.setText(fact.toString())
            tvsec.setText("$`val`!")
        })
        bsquare.setOnClickListener(View.OnClickListener {
            val d = tvmain.getText().toString().toDouble()
            val square = d * d
            tvmain.setText(square.toString())
            tvsec.setText("$d²")
        })
        bln.setOnClickListener(View.OnClickListener {
            tvmain.setText(
                tvmain.getText().toString() + "ln"
            )
        })
        blog.setOnClickListener(View.OnClickListener {
            tvmain.setText(
                tvmain.getText().toString() + "log"
            )
        })
        bequal.setOnClickListener(View.OnClickListener {
            val `val` = tvmain.getText().toString()
            val replacedstr = `val`.replace('÷', '/').replace('×', '*')
            val result = eval(replacedstr)
            tvmain.setText(result.toString())
            tvsec.setText(`val`)
        })
    }

    //factorial function
    fun factorial(n: Int): Int {
        return if (n == 1 || n == 0) 1 else n * factorial(n - 1)
    }

    companion object {
        //eval function
        fun eval(str: String): Double {
            return object : Any() {
                var pos = -1
                var ch = 0
                fun nextChar() {
                    ch = if (++pos < str.length) str[pos].toInt() else -1
                }

                fun eat(charToEat: Int): Boolean {
                    while (ch == ' '.toInt()) nextChar()
                    if (ch == charToEat) {
                        nextChar()
                        return true
                    }
                    return false
                }

                fun parse(): Double {
                    nextChar()
                    val x = parseExpression()
                    if (pos < str.length) throw RuntimeException("Unexpected: " + ch.toChar())
                    return x
                }

                // Grammar:
                // expression = term | expression `+` term | expression `-` term
                // term = factor | term `*` factor | term `/` factor
                // factor = `+` factor | `-` factor | `(` expression `)`
                //        | number | functionName factor | factor `^` factor
                fun parseExpression(): Double {
                    val x = parseTerm()
                    while (true) {
                        if (eat('+'.toInt())) com.example.scientificcalculator.x += parseTerm() // addition
                        else if (eat('-'.toInt())) com.example.scientificcalculator.x -= parseTerm() // subtraction
                        else return com.example.scientificcalculator.x
                    }
                }

                fun parseTerm(): Double {
                    val x = parseFactor()
                    while (true) {
                        if (eat('*'.toInt())) com.example.scientificcalculator.x *= parseFactor() // multiplication
                        else if (eat('/'.toInt())) com.example.scientificcalculator.x /= parseFactor() // division
                        else return com.example.scientificcalculator.x
                    }
                }

                fun parseFactor(): Double {
                    if (eat('+'.toInt())) return parseFactor() // unary plus
                    if (eat('-'.toInt())) return -parseFactor() // unary minus
                    var x: Double
                    val startPos = pos
                    if (eat('('.toInt())) { // parentheses
                        com.example.scientificcalculator.x = parseExpression()
                        eat(')'.toInt())
                    } else if (ch >= '0'.toInt() && ch <= '9'.toInt() || ch == '.'.toInt()) { // numbers
                        while (ch >= '0'.toInt() && ch <= '9'.toInt() || ch == '.'.toInt()) nextChar()
                        com.example.scientificcalculator.x = str.substring(
                            com.example.scientificcalculator.startPos,
                            pos
                        ).toDouble()
                    } else if (ch >= 'a'.toInt() && ch <= 'z'.toInt()) { // functions
                        while (ch >= 'a'.toInt() && ch <= 'z'.toInt()) nextChar()
                        val func = str.substring(com.example.scientificcalculator.startPos, pos)
                        com.example.scientificcalculator.x = parseFactor()
                        if (com.example.scientificcalculator.func == "sqrt") com.example.scientificcalculator.x =
                            Math.sqrt(com.example.scientificcalculator.x) else if (com.example.scientificcalculator.func == "sin") com.example.scientificcalculator.x =
                            Math.sin(
                                Math.toRadians(com.example.scientificcalculator.x)
                            ) else if (com.example.scientificcalculator.func == "cos") com.example.scientificcalculator.x =
                            Math.cos(
                                Math.toRadians(com.example.scientificcalculator.x)
                            ) else if (com.example.scientificcalculator.func == "tan") com.example.scientificcalculator.x =
                            Math.tan(
                                Math.toRadians(com.example.scientificcalculator.x)
                            ) else if (com.example.scientificcalculator.func == "log") com.example.scientificcalculator.x =
                            Math.log10(com.example.scientificcalculator.x) else if (com.example.scientificcalculator.func == "ln") com.example.scientificcalculator.x =
                            Math.log(com.example.scientificcalculator.x) else throw RuntimeException(
                            "Unknown function: " + com.example.scientificcalculator.func
                        )
                    } else {
                        throw RuntimeException("Unexpected: " + ch.toChar())
                    }
                    if (eat('^'.toInt())) com.example.scientificcalculator.x = Math.pow(
                        com.example.scientificcalculator.x,
                        parseFactor()
                    ) // exponentiation
                    return com.example.scientificcalculator.x
                }
            }.parse()
        }
    }
}