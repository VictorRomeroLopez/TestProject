package com.victorromero.helloworld

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_bad_jokes.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //var changeme : String = "Hello World!"

    /*
    Si posem el interrogant al final podras assignar null a aquesta variable
    var changeme : String? = null
    */

    var changeme : String? = "Hello World!"

    //Variables val no poden modificarse mentre que les var si
    val canotchange : String = "España"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //No podem accedir als metodes si la variable pot ser null
        //Pero podem aplicar aquest primer '?'
        val variable = changeme?.length

        //Per poder treballar amb la variable usarem el let de forma que només entrara si el coontingut es diferent de null
        variable?.let{
            val lengthPlusOne = it.plus(1)
        }?: println("the value was null!!! OMG")

        _loginButton.setOnClickListener{
            /*
            val email = _userName.text
            Toast.makeText(this, "LoginClicked with email $email", Toast.LENGTH_LONG).show()
            */

            val usernameText = _userName.text.toString()
            val variableIntent = Intent(this, BadJokesActivity::class.java)
            variableIntent.putExtra("username", usernameText)
            //DoLogin and go to badJokesActivity
            startActivity(variableIntent)


        }
    }

    private fun concatTwoStrings(string1: String, string2: String) : String {
        return string1 + string2
    }
}

class MyObject(
    val texto : String ,
    val number : Int){

    constructor(isValid : Boolean) : this("", 1)
    {}

    val classVal: String = ""

    fun function(){
        texto
    }
}

data class Bulk(var texto : String){
    val classVal : String = "Holakehase"


}