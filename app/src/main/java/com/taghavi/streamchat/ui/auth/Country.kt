package com.taghavi.streamchat.ui.auth

import android.content.Context
import com.taghavi.streamchat.R

data class Country(
    val phoneCode: Int,
    val countryCode: String,
)

fun Context.getCountries(): List<Country> {
    val listCountries = mutableListOf<Country>()

    resources.getStringArray(R.array.countries).forEach {
        val temp = it.split(',')
        val country = Country(temp[0].toInt(), temp[1])
        listCountries.add(country)
    }

    return listCountries
}
