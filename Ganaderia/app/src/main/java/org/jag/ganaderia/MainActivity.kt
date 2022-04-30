package org.jag.ganaderia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    public fun goToLogin(view: View) {
        val myIntentLogin = Intent(this, LoginActivity::class.java)
        startActivity(myIntentLogin)
    }

    public fun goToRegister(view: View) {
        val myIntentRegister = Intent(this, RegisterActivity::class.java)
        startActivity(myIntentRegister)
    }

    /*
public void getTokent(){

    signInRequest = BeginSignInRequest.builder()
        .setGoogleIdTokenRequestOptions(
            BeginSignInRequest.GoogleIdTokenRequestOptions.builder()
                .setSupported(true)
                // Your server's client ID, not your Android client ID.
                .setServerClientId(getString(R.string.your_web_client_id))
                // Only show accounts previously used to sign in.
                .setFilterByAuthorizedAccounts(true)
                .build())


}
     */


}