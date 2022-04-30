package org.jag.ganaderia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class RegisterActivity : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        // ...
        // Initialize Firebase Auth
        auth = Firebase.auth
    }

    override fun onStart() {
        super.onStart()
        // Check if user is signed in (non-null) and update UI accordingly.
        var currentUser = auth.getCurrentUser()
        //updateUI(currentUser);
    }

    public fun goToLogin(view: View) {
        val myIntentLogin = Intent(this, LoginActivity::class.java)
        startActivity(myIntentLogin)
    }

    public fun goToListG(view: View) {
        val myIntentLG = Intent(this, ListGanadoActivity::class.java)
        startActivity(myIntentLG)
    }


}