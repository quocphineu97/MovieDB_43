package com.asterisk.tuandao.themoviedb.util

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkInfo
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProviders

fun Context.hasNetwork(): Boolean {
    var isConnected = false // Initial Value
    val connectivityManager = this.getSystemService(Context.CONNECTIVITY_SERVICE)
            as ConnectivityManager
    val activeNetwork: NetworkInfo? = connectivityManager.activeNetworkInfo
    if (activeNetwork != null && activeNetwork.isConnected)
        isConnected = true
    return isConnected
}

fun Context.showMessage(msg: String) = Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()

fun <T : ViewModel> AppCompatActivity.obtainViewModel(
    viewModelClass: Class<T>,
    viewModelFactory: MovieViewModelFactory
) = ViewModelProviders.of(this, viewModelFactory).get(viewModelClass)
