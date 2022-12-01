package com.bignerdranch.android.zad2

import androidx.lifecycle.ViewModel

class CrimeListViewModel: ViewModel()
{
    val crimes = mutableListOf<Crime>()
    init {
        for (i in 0.. 100) {
            val crime = Crime()
            crime.title = "Crime #$i"
            crime.date
            crime.bool = i % 2 == 0
            crimes+=crime
        }
    }
}