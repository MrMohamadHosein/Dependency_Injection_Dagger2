package ir.MrMohamadHosein.dependencyinjectiondagger2

import android.app.Application
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import ir.MrMohamadHosein.dependencyinjectiondagger2.di.component.DaggerMainComponent

class MyApp : DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {

        return DaggerMainComponent
            .builder()
            .application(this)
            .build()
    }

}