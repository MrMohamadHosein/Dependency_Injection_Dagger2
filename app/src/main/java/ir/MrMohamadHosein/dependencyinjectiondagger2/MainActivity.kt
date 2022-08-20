package ir.MrMohamadHosein.dependencyinjectiondagger2

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.squareup.picasso.Picasso
import dagger.android.support.DaggerAppCompatActivity
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {

    @Inject lateinit var apiService: ApiService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        apiService
            .getAllStudents()
            .enqueue( object :Callback<List<Student>> {

                override fun onResponse(call: Call<List<Student>>, response: Response<List<Student>>) {
                    Log.v("testLog" , response.body().toString() )
                }

                override fun onFailure(call: Call<List<Student>>, t: Throwable) {
                    Log.v("testLog" , t.message ?: "null")
                }


            } )

    }
}