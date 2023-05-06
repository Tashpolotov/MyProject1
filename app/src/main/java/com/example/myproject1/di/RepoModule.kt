package com.example.myproject1.di

import com.example.myproject1.data.network.remote.repo.Repository
import org.koin.dsl.module

val repoModule = module {
    single { Repository(get()) }
}