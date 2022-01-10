package com.example.sensingcrowd

import android.content.*
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import io.realm.Realm
import io.realm.mongodb.App
import kotlinx.android.synthetic.main.activity_login.*


class LoginActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        sign_in_btn.setOnClickListener {
            goHome("username")
        }


    }

    private fun goHome(username: String){

        val intent = Intent(this, Home::class.java)
        startActivity(intent)
    }
    /*
    override fun onBackPressed() {
        // Disable going back to the MainActivity
        moveTaskToBack(true)
    }

    private fun onLoginSuccess() {
        // successful login ends this activity, bringing the user back to the project activity
        finish()
    }

    private fun onLoginFailed(errorMsg: String) {
        Log.e(TAG(), errorMsg)
        Toast.makeText(baseContext, errorMsg, Toast.LENGTH_LONG).show()
    }

    private fun validateCredentials(): Boolean = when {
        // zero-length usernames and passwords are not valid (or secure), so prevent users from creating accounts with those client-side.
        username.text.toString().isEmpty() -> false
        password.text.toString().isEmpty() -> false
        else -> true
    }

    // handle user authentication (login) and account creation
    private fun login(createUser: Boolean) {
        if (!validateCredentials()) {
            onLoginFailed("Invalid username or password")
            return
        }

        // while this operation completes, disable the buttons to login or create a new account
        createUserButton.isEnabled = false
        loginButton.isEnabled = false

        val username = this.username.text.toString()
        val password = this.password.text.toString()


        if (createUser) {
            // register a user using the Realm App we created in the TaskTracker class
            taskApp.emailPassword.registerUserAsync(username, password) {
                // re-enable the buttons after user registration returns a result
                createUserButton.isEnabled = true
                loginButton.isEnabled = true
                if (!it.isSuccess) {
                    onLoginFailed("Could not register user.")
                    Log.e(TAG(), "Error: ${it.error}")
                } else {
                    Log.i(TAG(), "Successfully registered user.")
                    // when the account has been created successfully, log in to the account
                    login(false)
                }
            }
        } else {
            val creds = Credentials.emailPassword(username, password)
            taskApp.loginAsync(creds) {
                // re-enable the buttons after user login returns a result
                loginButton.isEnabled = true
                createUserButton.isEnabled = true
                if (!it.isSuccess) {
                    onLoginFailed(it.error.message ?: "An error occurred.")
                } else {
                    onLoginSuccess()
                }
            }
        }
    }*/


}
