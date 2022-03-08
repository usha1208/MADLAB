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
