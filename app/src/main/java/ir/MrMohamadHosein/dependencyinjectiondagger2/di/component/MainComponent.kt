package ir.MrMohamadHosein.dependencyinjectiondagger2.di.component

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import ir.MrMohamadHosein.dependencyinjectiondagger2.MyApp
import ir.MrMohamadHosein.dependencyinjectiondagger2.di.module.ActivityBuilderModule
import ir.MrMohamadHosein.dependencyinjectiondagger2.di.module.AppModule
import ir.MrMohamadHosein.dependencyinjectiondagger2.di.module.ImageModule
import ir.MrMohamadHosein.dependencyinjectiondagger2.di.module.NetworkModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AppModule::class,
        ActivityBuilderModule::class,
        AndroidSupportInjectionModule::class,
        NetworkModule::class,
        ImageModule::class
    ]
)
interface MainComponent : AndroidInjector<MyApp> {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application): Builder

        fun build(): MainComponent

    }

}