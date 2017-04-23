package id.co.makananringan.myprofile;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by rioswarawan on 4/23/17.
 */

public class MainActivity extends Activity {

    private ImageView imgSeno;
    private ImageView imgAryo;
    private ImageView imgSiti;
    private ImageView imgDijah;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgAryo = (ImageView) findViewById(R.id.image_aryo);
        imgSeno = (ImageView) findViewById(R.id.image_seno);
        imgSiti = (ImageView) findViewById(R.id.image_siti);
        imgDijah = (ImageView) findViewById(R.id.image_dijah);

        imgAryo.setOnClickListener(onAryoClicked);
        imgSeno.setOnClickListener(onSenoClicked);
        imgSiti.setOnClickListener(onSitiClicked);
        imgDijah.setOnClickListener(onDijahClicked);
    }

    View.OnClickListener onAryoClicked = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            goToProfile("Aryo", "aryo_tampan@gmail.com", "Surabaya", R.drawable.profile_aryo);
        }
    };

    View.OnClickListener onSenoClicked = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            goToProfile("Seno", "seno_sleketep@gmail.com", "Semarang", R.drawable.profile_seno);
        }
    };

    View.OnClickListener onSitiClicked = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            goToProfile("Tiwi", "tiwi_tralalala@gmail.com", "Sleman", R.drawable.profile_tiwi);
        }
    };

    View.OnClickListener onDijahClicked = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            goToProfile("Dijah", "dijah_yellow@gmail.com", "Jakarta", R.drawable.profile_dijah);
        }
    };
    
    private void goToProfile(String nama, String email, String alamat, int image) {
        Intent intent = new Intent(this, ProfileActivity.class);
        intent.putExtra("key_nama", nama);
        intent.putExtra("key_email", email);
        intent.putExtra("key_alamat", alamat);
        intent.putExtra("key_image", image);
        startActivity(intent);
    }
}
