package ir.MrMohamadHosein.dependencyinjectiondagger2.di.module

import dagger.Module
import dagger.Provides
import ir.MrMohamadHosein.dependencyinjectiondagger2.ApiService
import ir.MrMohamadHosein.dependencyinjectiondagger2.BASE_URL
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class NetworkModule {

    @Provides
    @Singleton
    fun provideRetrofit() :Retrofit {
        return Retrofit
            .Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Provides
    @Singleton
    fun provideApiService(retrofit: Retrofit) :ApiService {
        return retrofit.create(ApiService::class.java)
    }

}