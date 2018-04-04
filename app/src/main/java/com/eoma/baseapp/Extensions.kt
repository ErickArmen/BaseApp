package com.eoma.baseapp

import android.content.SharedPreferences


fun SharedPreferences.savePreferences(name: String, value: String){
    this.edit().putString(name, value)
}

fun SharedPreferences.getPreferences(name: String){
    this.getString(name, "")
}
