package com.example.appserasa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import com.example.appserasa.model.Session
import com.example.appserasa.model.User

class LoginActivity : AppCompatActivity(), TextWatcher {

    //criar variaveis e tipar para depois atribuir valor
    private lateinit var inputCpf: EditText
    private lateinit var inputPassword: EditText
    private lateinit var buttonLogin: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //funcao para carregar os elementos da tela (inputs)
        carregarElementosDaTela()
    }

    //com a funcao carregamos os dados digitados pelo id
    fun carregarElementosDaTela() {
        inputCpf = findViewById(R.id.inputCpf)
        inputPassword = findViewById(R.id.inputPassword)
        buttonLogin = findViewById(R.id.buttonLogin)


      //atribuimos click ao botão e vamos validar se os campos foram preenchidos corretamente
        buttonLogin.setOnClickListener {
            if (validarCamposParaLogin()) {
                fazerLogin()
            } else {
                inputCpf.error = "CPF inválido"
                inputPassword.error = "Senha inválida"
            }
        }
    }
    //funcão para validar se os campos não estão nulos
    private fun validarCamposParaLogin(): Boolean {
        val cpf = inputCpf.text.toString()
        val password = inputPassword.text.toString()
        if (cpf.isNotEmpty() && password.isNotEmpty()) {
            Session.currentUser = User(cpf, password)
            return Session.currentUser!!.isValidCpf() && Session.currentUser!!.isValidPassword()

        }
        return false

    }

    //se estiver tudo ok, manda para a proxima activity - lista
    private fun fazerLogin() {
        Intent(this, ListaActivity::class.java).apply {
            startActivity(this)
        }
    }

    //abaixo as funções para ir digitando nos inputs e ja ir aparecendo na tela real time
    
    override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
    }

    override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
    }

    override fun afterTextChanged(s: Editable?) {
    }

}
