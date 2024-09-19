package com.example.recyclerviewproject

import android.content.Context
import android.content.Intent
import android.content.res.Configuration
import android.os.Build
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.User
import com.example.myapplication.UserAdapter
import com.example.recyclerviewproject.databinding.ActivityMainBinding
import java.util.Locale

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view: View = binding.root
        setContentView(view)


        //binding.name="Hiii"


        val users = mutableListOf<User>(
            User(R.drawable.angels, "Angels & Demons", "Dan Brown",R.drawable.fourstars),
            User(R.drawable.sword, "The Sword Thief", "Peter Lerangis",R.drawable.threestars),
            User(R.drawable.blood, "Blood Line", "James Rollins",R.drawable.threestars),
            User(R.drawable.humming, "The Hummingbird's Daughter", "Luis Alberto Urrea",R.drawable.fourstars),
            User(R.drawable.nostra, "Terra Nostra", "Carlos Fuentes",R.drawable.fourstars),
            User(R.drawable.solitude, "One Hundred Years of Solitude", "Gabriel Garcia Marquez",R.drawable.threestars),
            User(R.drawable.spirits, "The House Of The Spirits", "Isabel Allende",R.drawable.fourstars)

        )


        val userAdapter = UserAdapter(users)
        binding.rvUsers.layoutManager = LinearLayoutManager(this)
        binding.rvUsers.adapter = userAdapter

        binding.toolbar.materialToolbar.setOnMenuItemClickListener {
            when (it.itemId) {
                R.id.notif -> {
                    Toast.makeText(this, R.string.notif_clicked, Toast.LENGTH_SHORT).show()
                    true
                }

                else -> false
            }
        }




        binding.toolbar.materialToolbar.setNavigationOnClickListener {
            binding.drawerLayout.open()
        }


        binding.navigationView.setNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.review -> {
                    Toast.makeText(this, R.string.review_clicked, Toast.LENGTH_SHORT).show()
                    binding.drawerLayout.close()
                    true
                }

                R.id.favorite -> {
                    Toast.makeText(this, R.string.favorite_clicked, Toast.LENGTH_SHORT).show()
                    binding.drawerLayout.close()
                    true
                }

                R.id.search -> {
                    Toast.makeText(this, R.string.search_clicked, Toast.LENGTH_SHORT).show()
                    binding.drawerLayout.close()
                    true
                }

                R.id.person -> {
                    Toast.makeText(this, R.string.profile_clicked, Toast.LENGTH_SHORT).show()
                    binding.drawerLayout.close()
                    true
                }

                R.id.settings -> {
                    Toast.makeText(this, R.string.settings_clicked, Toast.LENGTH_SHORT).show()
                    binding.drawerLayout.close()
                    true
                }


                else -> false
            }
        }



    fun bindUserImage(imageView: ImageView, imageResId: Int) {
        imageView.setImageResource(imageResId)
    }
        fun bindantUserImage(imageView: ImageView, antImageResId: Int) {
            imageView.setImageResource(antImageResId)
        }
}
}
        //binding.bottomNavigation.setOnNavigationItemSelectedListener {
        //when (it.itemId) {
        //R.id.home -> {
        //Toast.makeText(this, R.string.home_clicked, Toast.LENGTH_SHORT).show()
        //true }

        //R.id.profile -> {
        //Toast.makeText(this, R.string.profile_clicked, Toast.LENGTH_SHORT).show()
        //true }

        //R.id.settings -> {
        //Toast.makeText(this, R.string.settings_clicked, Toast.LENGTH_SHORT).show()
        //true }

        //else -> false } }


        //binding.floatingActionButton.setOnClickListener {

        //Snackbar.make(binding.coordinatorLayout, R.string.user_added, Snackbar.LENGTH_LONG)
        //.setAction(R.string.dismiss) {
        // Responds to click on the action }
        //.show() }}


        //fun updateLocale(context: Context, languageCode: String) {

            // locale  ar  direction

            //val locale = Locale(languageCode)
            //Locale.setDefault(locale)
            //val config = Configuration()

            //if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            //    config.setLocale(locale)
            //    context.createConfigurationContext(config)
            //} else {
            //    config.locale = locale
            //    context.resources.updateConfiguration(config, context.resources.displayMetrics)
            //}

            // Update layout direction
            //if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
            //    config.setLayoutDirection(locale)
            //}

            //context.resources.updateConfiguration(config, context.resources.displayMetrics)

            //restart activity

            //val intent = Intent(this, MainActivity::class.java)
            //startActivity(intent)
            //finish() }



