package projetos.danilo.tempconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_converter.setOnClickListener { converter(it) }
    }

    fun converter(view: View){
        var temp: Double = edt_valorTemp.toString().toDouble()

        if(rd_celcius.isChecked){
            temp = (temp - 32 * 5/9)
        } else if (rd_fahreiheint.isChecked) {
            temp = temp * 9/5 + 32
        }

        edt_valorTemp.setText(temp.toString())
    }
}
