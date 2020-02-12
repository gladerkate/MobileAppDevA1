package ie.wit.assignment1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class Main2Activity : AppCompatActivity() {

    private lateinit var app: MainApp
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_outfit)
        app = application as MainApp
        val nameBox: EditText = findViewById<EditText>(R.id.NameInput)
        val descBox: EditText = findViewById(R.id.DescriptionInput)
        val btn: Button = findViewById(R.id.SaveOutfit)
        btn.setOnClickListener{
            val Outfit:OutfitModel = OutfitModel(name = nameBox.text.toString(),description = descBox.text.toString(), image = null)
            app.list.add(Outfit)
            finish()
        }
    }
}
