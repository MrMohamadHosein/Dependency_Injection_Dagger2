package ir.MrMohamadHosein.dependencyinjectiondagger2.di.module

import dagger.Module
import dagger.android.ContributesAndroidInjector
import ir.MrMohamadHosein.dependencyinjectiondagger2.MainActivity

@Module
abstract class ActivityBuilderModule {

    @ContributesAndroidInjector()
    abstract fun contributeMainActivity(): MainActivity?
}