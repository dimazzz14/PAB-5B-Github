package com.si5b.pendaftaranmaba;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etNomorPendaftaran,etNama,etTanggal,etAsal;
    Button btnDaftar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNomorPendaftaran = findViewById(R.id.et_nomor_pendaftaran);
        etNama = findViewById(R.id.et_nama);
        etTanggal = findViewById(R.id.et_tanggal);
        etAsal = findViewById(R.id.et_asal);
        btnDaftar = findViewById(R.id.btn_daftar);

        btnDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String NomorPendaftaran=etNomorPendaftaran.getText().toString(); //buat ngambil nilai di etNomorPemdaftaran untuk diubah ke string
                String Nama = etNama.getText().toString();
                String Tanggal = etTanggal.getText().toString();
                String Asal = etAsal.getText().toString();

                // trim() untuk eliminasi spasi. jadi data tidak bisa diisi cuman pakai spasi aja
                if(NomorPendaftaran.trim().equals("")){
                    etNomorPendaftaran.setError("Nomor Pendaftaran harus diisi");
                }

                else if (Nama.trim().equals("")){
                    etNama.setError("Nama harus diisi");
                }

                else if (Tanggal.trim().equals("")){
                    etTanggal.setError("Tanggal lahir harus diisi");
                }

                else if (Asal.trim().equals("")){
                    etAsal.setError("Asal Sekolah harus diisi");
                }

                //Toast untuk munculke pesan pop up pas klik tombol daftar
                else {
                    Toast.makeText(MainActivity.this, "Pendaftaran Berhasil!", Toast.LENGTH_SHORT).show();
                }

        };//setonclicklistener biar ada reaksi ketika tombol diklik
    });
}}