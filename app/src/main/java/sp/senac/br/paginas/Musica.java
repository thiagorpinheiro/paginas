package sp.senac.br.paginas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;

public class Musica extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_musica);
        Toolbar toolbar = (Toolbar) findViewById(R.id.ToolbarMusica);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Musicas");
        toolbar.setNavigationIcon(R.drawable.ic_musicaa_dp);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_musicas, menu);


        return super.onCreateOptionsMenu(menu);


    }
}