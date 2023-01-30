package com.vholodynskyi.cryptocurrencyapp.di

import com.vholodynskyi.cryptocurrencyapp.domain.repository.CoinRepository
import com.vholodynskyi.cryptocurrencyapp.domain.use_case.get_coin.GetCoinUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
object ViewModelModule {

    @Provides
    @ViewModelScoped
    fun provideGetCoinUseCase(repo: dagger.Lazy<CoinRepository>): GetCoinUseCase {
        return GetCoinUseCase(repo)

    }

}