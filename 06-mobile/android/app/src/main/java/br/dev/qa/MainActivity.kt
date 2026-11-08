package br.dev.qa
import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
class MainActivity : Activity() {
 override fun onCreate(savedInstanceState: Bundle?) { super.onCreate(savedInstanceState)
  val layout = LinearLayout(this).apply { orientation = LinearLayout.VERTICAL }
  val resultado = TextView(this).apply { id = 101; text = "Aguardando" }
  val botao = Button(this).apply { id = 102; text = "Confirmar"; setOnClickListener { resultado.text = "Confirmado" } }
  layout.addView(resultado); layout.addView(botao); setContentView(layout)
 }
}
