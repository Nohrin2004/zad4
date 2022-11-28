package com.bignerdranch.android.zad2

import java.util.*

data class Crime (val id:UUID = UUID.randomUUID())
{
    var title:String = ""
    var date:Int = 0
    var bool:Boolean = false;

}