package com.app.thehillsmagazine;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.util.FitPolicy;

public class MainActivity extends AppCompatActivity {
    private PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pdfView = findViewById(R.id.pdfView);
        displayFromAsset();
    }

    private void displayFromAsset(){
        pdfView.fromAsset("TheHillsMagazineFirstEdition.pdf")
                .pageFitPolicy(FitPolicy.WIDTH)
                .load();
    }
}