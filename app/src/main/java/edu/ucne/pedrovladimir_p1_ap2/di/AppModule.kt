package edu.ucne.pedrovladimir_p1_ap2.di

import android.content.Context
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
class AppModule {
    fun ProvideContex(@ApplicationContext AppContex: Context) = AppContex
}