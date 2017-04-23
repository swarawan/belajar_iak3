package id.co.makananringan.myprofile;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends Activity {

    EditText formUsername;
    EditText formPassword;
    Button buttonLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        formUsername = (EditText) findViewById(R.id.input_username);
        formPassword = (EditText) findViewById(R.id.input_password);
        buttonLogin = (Button) findViewById(R.id.button_login);

        buttonLogin.setOnClickListener(onLoginClicked);
    }

    View.OnClickListener onLoginClicked = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            validasiForm();
        }
    };

    /**
     * 1. ambil value dari username dan password dan disimpan kedalam masing2 variabel
     * 2. cek apakah username adalah "rioswarawan"
     * 3. cek apakah password adalah "123456"
     * 4. jika benar -> masuk ke halaman utama
     * 5. jika salah -> menampilkan pesan bahwa username dan password tidak sesuai
     */
    private void validasiForm() {
        String username = formUsername.getText().toString();
        String password = formPassword.getText().toString();

        if (username.equals("rioswarawan") && password.equals("123456")) {
            goToMain();
        } else {
            Toast.makeText(this, "Username dan password tidak sesuai", Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * 1. Buat object Intent
     * 2. Deklarasikan perpindahan layout dari activity 1 ke activity 2
     * 3. Jalankan activity-nya
     */
    private void goToMain() {
        Intent intentToMain = new Intent(this, MainActivity.class);
        startActivity(intentToMain);
        finish();
    }
}
