package cr.ac.calculadora

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import org.mariuszgromada.math.mxparser.Expression

class MainActivity : AppCompatActivity() {
    var textoInicio : TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button1 : Button = findViewById(R.id.button1)
        val button2 : Button = findViewById(R.id.button2)
        val button3 : Button = findViewById(R.id.button3)
        val button4 : Button = findViewById(R.id.button4)
        val button5 : Button = findViewById(R.id.button5)
        val button6 : Button = findViewById(R.id.button6)
        val button7 : Button = findViewById(R.id.button7)
        val button8 : Button = findViewById(R.id.button8)
        val button9 : Button = findViewById(R.id.button9)
        val button0 : Button = findViewById(R.id.button0)
        val buttonSuma : Button = findViewById(R.id.buttonSuma)
        val buttonResta : Button = findViewById(R.id.buttonResta)
        val buttonMultiplica : Button = findViewById(R.id.buttonMultiplica)
        val buttonDivide : Button = findViewById(R.id.buttonDivide)
        val buttonPorcentaje : Button = findViewById(R.id.buttonPorcentaje)
        val buttonSigno : Button = findViewById(R.id.buttonSigno)
        val buttonClear : Button = findViewById(R.id.buttonC)
        val buttonPunto : Button = findViewById(R.id.buttonPunto)
        val buttonTotal : Button = findViewById(R.id.buttonIgual)
        button1.setOnClickListener{ button1Click() }
        button2.setOnClickListener{ button2Click() }
        button3.setOnClickListener{ button3Click() }
        button4.setOnClickListener{ button4Click() }
        button5.setOnClickListener{ button5Click() }
        button6.setOnClickListener{ button6Click() }
        button7.setOnClickListener{ button7Click() }
        button8.setOnClickListener{ button8Click() }
        button9.setOnClickListener{ button9Click() }
        button0.setOnClickListener{ button0Click() }
        buttonSuma.setOnClickListener{ buttonSumaClick() }
        buttonResta.setOnClickListener{ buttonRestaClick() }
        buttonMultiplica.setOnClickListener{ buttonMultiplicaClick() }
        buttonDivide.setOnClickListener{ buttonDivideClick() }
        buttonPorcentaje.setOnClickListener{ buttonPorcentajeClick() }
        buttonSigno.setOnClickListener{ buttonSignoClick() }
        buttonClear.setOnClickListener{ buttonClearClick() }
        buttonPunto.setOnClickListener{ buttonPuntoClick() }
        buttonTotal.setOnClickListener{ buttonTotalClick() }

        textoInicio = findViewById<TextView>(R.id.textoInicio)

    }

    private fun button1Click() {
        textoInicio?.text = "" + textoInicio?.text + "1"
    }

    private fun button2Click() {
        textoInicio?.text = "" + textoInicio?.text + "2"
    }

    private fun button3Click() {
        textoInicio?.text = "" + textoInicio?.text + "3"
    }

    private fun button4Click() {
        textoInicio?.text = "" + textoInicio?.text + "4"
    }

    private fun button5Click() {
        textoInicio?.text = "" + textoInicio?.text + "5"
    }

    private fun button6Click() {
        textoInicio?.text = "" + textoInicio?.text + "6"
    }

    private fun button7Click() {
        textoInicio?.text = "" + textoInicio?.text + "7"
    }

    private fun button8Click() {
        textoInicio?.text = "" + textoInicio?.text + "8"
    }

    private fun button9Click() {
        textoInicio?.text = "" + textoInicio?.text + "9"
    }

    private fun button0Click() {
        if (textoInicio?.text.toString() == ""){
            textoInicio?.text = ""
            Toast.makeText(this, "No Puede Iniciar con Cero ",Toast.LENGTH_SHORT).show()
        } else {
            textoInicio?.text = "" + textoInicio?.text + "0"
        }
    }

    private fun buttonSumaClick() {
        textoInicio?.text = "" + textoInicio?.text + "+"
    }

    private fun buttonRestaClick() {
        textoInicio?.text = "" + textoInicio?.text + "-"
    }

    private fun buttonMultiplicaClick() {
        if (textoInicio?.text.toString() == ""){
            textoInicio?.text = ""
            Toast.makeText(this, "No Puede Iniciar con * ",Toast.LENGTH_SHORT).show()
        } else {
            textoInicio?.text = "" + textoInicio?.text + "*"
        }
    }

    private fun buttonDivideClick() {
        if (textoInicio?.text.toString() == ""){
            textoInicio?.text = ""
            Toast.makeText(this, "No Puede Iniciar con / ",Toast.LENGTH_SHORT).show()
        } else {
            textoInicio?.text = "" + textoInicio?.text + "/"
        }
    }

    private fun buttonPorcentajeClick() {
        if (textoInicio?.text.toString() == ""){
            textoInicio?.text = ""
            Toast.makeText(this, "No Puede Iniciar con un % ",Toast.LENGTH_SHORT).show()
        } else {
            textoInicio?.text = "" + textoInicio?.text + "%"
        }
    }

    private fun buttonSignoClick() {
        //textoInicio?.text = "" + textoInicio?.text + "3"
        Toast.makeText(this, "Funcion en Proceso de Implementacion",Toast.LENGTH_SHORT).show()
    }

    private fun buttonClearClick() {
        textoInicio?.text = ""
    }

    private fun buttonPuntoClick() {
        textoInicio?.text = "" + textoInicio?.text + "."
    }

    private fun buttonTotalClick() {

        if (textoInicio?.text.toString() == ""){
            Toast.makeText(this, "Por favor Ingrese un Numero",Toast.LENGTH_SHORT).show()
        } else {
            val valor: String = textoInicio!!.text.toString()
            val expression = Expression(valor);
            textoInicio?.text = "=" + expression.calculate()
        }

    }


}

