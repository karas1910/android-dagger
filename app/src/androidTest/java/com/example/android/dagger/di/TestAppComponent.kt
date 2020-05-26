package com.example.android.dagger.di

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [TestStorageModule::class, AppSubcomponets::class])
interface TestAppComponent : AppComponent