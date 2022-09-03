package com.chenzfall.indonesianuniversity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var rvUniversities: RecyclerView
    private var list: ArrayList<University> = arrayListOf()

    companion object{
        const val UNIVERSITY = "university"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvUniversities = findViewById(R.id.rv_heroes)
        list.addAll(UniversityData.listData)

        showRecyclerList()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.app_bar_menu_main,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.about_page -> {
                startActivityAboutMe()
            }
        }
        return true
    }

    private fun showRecyclerList(){
        rvUniversities.layoutManager = LinearLayoutManager(this)
        val listUniversityAdapter = ListUniversityAdapter(list)
        rvUniversities.adapter = listUniversityAdapter

        listUniversityAdapter.setOnItemClickCallback (object : ListUniversityAdapter.OnItemClickCallback{
            override fun onItemClicked(data: University) {
                showSelectedUniversity(data)
            }
        })
    }

    private fun showSelectedUniversity(data: University) {

        val intent = Intent(this, DetailActivity::class.java)
        intent.putExtra(UNIVERSITY, data)
        startActivity(intent)
    }

    private fun startActivityAboutMe(){
        val intent = Intent(this, AboutActivity::class.java)
        startActivity(intent)
    }
}