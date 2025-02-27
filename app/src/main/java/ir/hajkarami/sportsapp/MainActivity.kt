package ir.hajkarami.sportsapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import ir.hajkarami.sportsapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val sportList: MutableList<Sport> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)

        setupSportList()
        setupRecyclerView()
    }

    private fun setupSportList() {
        sportList.apply {
            add(Sport("Football", R.drawable.football))
            add(Sport("Basketball", R.drawable.basketball))
            add(Sport("VolleyBall", R.drawable.volley))
            add(Sport("Tennis", R.drawable.tennis))
            add(Sport("Ping Pong", R.drawable.ping))
        }
    }

    private fun setupRecyclerView() {
        binding.recyclerView.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = MyAdapter(sportList)
        }
    }
}
