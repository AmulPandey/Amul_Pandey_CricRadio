package org.Crick_Bustor.project.di


import org.koin.core.context.startKoin
import org.koin.dsl.KoinAppDeclaration
import sharedModule

fun initKoin(config: KoinAppDeclaration? = null) {
    startKoin {
        config?.invoke(this)
        modules(sharedModule)
    }
}