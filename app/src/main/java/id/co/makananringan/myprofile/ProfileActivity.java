package id.co.makananringan.myprofile;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by rioswarawan on 4/23/17.
 */

public class ProfileActivity extends Activity {

    ImageView imageProfile;
    TextView textNama;
    TextView textEmail;
    TextView textAlamat;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        imageProfile = (ImageView) findViewById(R.id.image_profile);
        textNama = (TextView) findViewById(R.id.text_nama);
        textEmail = (TextView) findViewById(R.id.text_email);
        textAlamat = (TextView) findViewById(R.id.text_alamat);

        Intent intentData = getIntent();
        String nama = intentData.getExtras().getString("key_nama");
        String email = intentData.getExtras().getString("key_email");
        String alamat = intentData.getExtras().getString("key_alamat");
        int image = intentData.getExtras().getInt("key_image");

        textNama.setText(nama);
        textEmail.setText(email);
        textAlamat.setText(alamat);
        imageProfile.setImageDrawable(getResources().getDrawable(image));
    }
}
