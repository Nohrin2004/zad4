package com.bignerdranch.android.zad2

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverter
import androidx.room.TypeConverters

@Database(entities = [Crime::class], version = 1)
@TypeConverters
abstract class CrimeDatabase: RoomDatabase()
{
 abstract fun crimeDao(): CrimeDao
}