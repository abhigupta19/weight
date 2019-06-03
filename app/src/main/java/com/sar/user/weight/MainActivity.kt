package com.sar.user.weight

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        checkBox.setOnClickListener(this);
        checkBox2.setOnClickListener(this);

        button.setOnClickListener {
        }
    }
    override fun onClick(v: View?) {
        var a=editText.text;
        v as CheckBox
        var ischecked:Boolean=v.isChecked
        when(v.id){
            R.id.checkBox->if(ischecked){textView.text=(a.toString().toDouble()*0.81).toString()}
            R.id.checkBox2->if(ischecked){textView.text=(a.toString().toDouble()*0.5).toString()}

        }
    }

}
