package projetos.danilo.tempconverter

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_converter.setOnClickListener { converter(it) }
    }

    fun converter(view: View){
        var temp = edt_valorTemp.text.toString().toDouble()

        if(rd_celcius.isChecked){
            temp = (temp - 32 * 5/9)
        } else if (rd_fahreiheint.isChecked) {
            temp = temp * 9/5 + 32
        }

        edt_valorTemp.setText(temp.toString())
    }
}
