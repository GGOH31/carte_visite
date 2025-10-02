package com.example.cartedevisitegoh

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CarteDeVisiteApp()
        }
    }
}

@Composable
fun CarteDeVisiteApp() {
    // Utilisation directe de MaterialTheme sans thème personnalisé
    MaterialTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = Color(0xFF3DDC84) // Vert Android
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(32.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {

                Icon(
                    imageVector = Icons.Default.Email,
                    contentDescription = "Icône email",
                    tint = Color.Black,
                    modifier = Modifier.size(40.dp)
                )

                Spacer(modifier = Modifier.height(16.dp))

                // Nom
                Text(
                    text = "GOH GEDEON (WEBDEV)",
                    fontSize = 28.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )

                Spacer(modifier = Modifier.height(16.dp))

                // Titre
                Text(
                    text = "Développeur Android",
                    fontSize = 18.sp,
                    color = Color(0xFF006400), // Vert foncé
                    fontWeight = FontWeight.Medium
                )

                Spacer(modifier = Modifier.height(40.dp))

                // Section coordonnées
                ContactSection()
            }
        }
    }
}

@Composable
fun ContactSection() {
    Column(
        horizontalAlignment = Alignment.Start,
        modifier = Modifier.fillMaxWidth()
    ) {
        ContactLine("📞", "+225 0757727688")
        Spacer(modifier = Modifier.height(12.dp))
        ContactLine("📧", "gedeongoh@ggmail.com")
        Spacer(modifier = Modifier.height(12.dp))
        ContactLine("🌐", "www.ci-plus.net")
        Spacer(modifier = Modifier.height(12.dp))
        ContactLine("📍", "Abidjan, Palmerais")
    }
}

@Composable
fun ContactLine(emoji: String, text: String) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.padding(vertical = 4.dp)
    ) {
        Text(
            text = emoji,
            fontSize = 18.sp,
            modifier = Modifier.width(32.dp)
        )
        Text(
            text = text,
            fontSize = 16.sp,
            color = Color.Black
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewCarteDeVisite() {
    CarteDeVisiteApp()
}