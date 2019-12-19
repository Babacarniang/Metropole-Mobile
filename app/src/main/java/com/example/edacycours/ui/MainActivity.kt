package com.example.edacycours.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.example.edacycours.EdacyCoursApplication
import com.example.edacycours.R
import com.example.edacycours.data.model.Article
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupNavigation()
        GlobalScope.launch(Dispatchers.IO) {
            EdacyCoursApplication.database.articleDao().insertAll(
                listOf(
                    Article(
                        1,
                        "ZIARRA A FEZ",
                        "Effectuez votre Ziarah à Fès dans le meilleur des conforts et la plus grande sécurité...",
                        "https://www.metropole.voyage/maroc",
                        "https://static.wixstatic.com/media/c4b827_5094ab36fde14c7c8f8cfe6cb008a93b~mv2.jpg/v1/crop/x_23,y_0,w_1354,h_1000/fill/w_306,h_226,al_c,q_80,usm_0.66_1.00_0.01/ZIAR%20FEZ.webp",
                        "https://www.metropole.voyage/"
                    ),
                    Article(
                        2,
                        "Circuit au Canada",
                        "Circuit Canada Merveilles de la Gaspésie et de la Mauricie – 18 jours – Ce circuit vous emmène à la découverte de toutes les régions du Québec pendant 18 jours....",
                        "https://www.metropole.voyage/etats-unis",
                        "https://static.wixstatic.com/media/c4b827_d8e941b8dc044ca7bc3d4fac0a602902~mv2.jpg/v1/crop/x_137,y_0,w_1006,h_720/fill/w_661,h_473,al_c,q_80,usm_0.66_1.00_0.01/maxresdefault.webp",
                        "https://www.metropole.voyage/"
                    ),
                    Article(
                        3,
                        "SINE SALOUM",
                        "\n" +
                                "Kaolack, Fatick Sénégal....",
                        "https://www.metropole.voyage/eat",
                        "https://static.wixstatic.com/media/c4b827_f4e8813c723b41a6a233d02e84d09e2c~mv2.jpg/v1/fill/w_683,h_273,al_c,q_80,usm_0.66_1.00_0.01/706205.webp",
                        "https://www.metropole.voyage/"
                    )
                )
            )
        }
    }

    private fun setupNavigation() {
        val navController = Navigation.findNavController(this, R.id.main_navigation_fragment)
        NavigationUI.setupActionBarWithNavController(this, navController, null)
        NavigationUI.setupWithNavController(navigation as BottomNavigationView, navController)
    }

    override fun onSupportNavigateUp() =
        Navigation.findNavController(this, R.id.main_navigation_fragment).navigateUp()
}
