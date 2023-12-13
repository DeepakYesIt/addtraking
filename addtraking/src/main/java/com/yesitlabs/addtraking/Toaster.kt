package com.yesitlabs.addtraking

import android.content.Context
import android.widget.Toast

class Toaster {
    companion object{
        public fun showToas(context:Context,msg:String){
            Toast.makeText(context,msg,Toast.LENGTH_SHORT).show()
        }

        public fun showToastMsg(context:Context,msg:String){
            Toast.makeText(context,msg,Toast.LENGTH_SHORT).show()
        }
    }
}