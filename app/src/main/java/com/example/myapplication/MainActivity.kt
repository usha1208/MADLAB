import android.R
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
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
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn1: Button = findViewById(R.id.button1)
        val btn2: Button = findViewById(R.id.button2)
        val btn3: Button = findViewById(R.id.button3)
        val fsize = floatArrayOf(0f)
        val tview1 = findViewById<View>(R.id.textView1) as TextView
        btn1.setOnClickListener(object : OnClickListener() {
            fun onClick(view: View?) {
                fsize[0] = (fsize[0] + 5) % 50
                tview1.textSize = fsize[0]
            }
        })
        btn2.setOnClickListener(object : OnClickListener() {
            fun onClick(view: View?) {
                val color1 = tview1.currentTextColor
                var newColor = 0
                when (color1) {
                    Color.BLACK -> newColor = Color.RED
                    Color.RED -> newColor = Color.BLUE
                    Color.BLUE -> newColor = Color.GREEN
                    Color.GREEN -> newColor = Color.RED
                }
                tview1.setTextColor(newColor)
            }
        })
        btn3.setOnClickListener(object : OnClickListener() {
            fun onClick(view: View?) {
                val lay = findViewById<View>(R.id.contain) as LinearLayout
                //                lay.setBackgroundColor(Color.WHITE);

//                LinearLayout lay = (LinearLayout) findViewById(R.id.contain);
                val viewColor = lay.background as ColorDrawable
                val colorId = viewColor.color
                var newcol = 0
                when (colorId) {
                    Color.WHITE -> newcol = Color.RED
                    Color.RED -> newcol = Color.GREEN
                    Color.GREEN -> newcol = Color.CYAN
                    Color.CYAN -> newcol = Color.WHITE
                }
                //                if(colorId == Color.WHITE){
//                    newcol = Color.RED;
//                }
//                else if(colorId == Color.RED){
//                    newcol = Color.GREEN;
//                }
//                else{
//                    newcol = Color.BLUE;
//                }
                lay.setBackgroundColor(newcol)
            }
        })
    }
}