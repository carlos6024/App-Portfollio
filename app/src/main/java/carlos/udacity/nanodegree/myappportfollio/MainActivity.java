package carlos.udacity.nanodegree.myappportfollio;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.main_activity_buildItBigger)
    Button buildItBigger;

    @Bind(R.id.main_activity_Capstone)
    Button capstone;

    @Bind(R.id.main_activity_libraryApp)
    Button libraryApp;

    @Bind(R.id.main_activity_scoresApp)
    Button scoresApp;

    @Bind(R.id.main_activity_spotifyStreamer)
    Button spotifyStreamer;

    @Bind(R.id.main_activity_xyzReader)
    Button xyzReader;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.main_activity_buildItBigger)
    public void setBuildItBigger(){
        Toast.makeText(this,"This button will launch Build It Bigger",Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.main_activity_xyzReader)
    public void setXyzReader(){
        Toast.makeText(this,"This button will launch XYZ Reader",Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.main_activity_scoresApp)
    public void setScoresApp(){
        Toast.makeText(this,"This button will launch Scores App",Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.main_activity_spotifyStreamer)
    public void setSpotifyStreamer(){
        Toast.makeText(this,"This button will launch Spotify Streamer",Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.main_activity_Capstone)
    public void setCapstone(){
        Toast.makeText(this,"This Button will launch my Capstone project",Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.main_activity_libraryApp)
    public void setLibraryApp(){
        Toast.makeText(this,"This button will launch Library App",Toast.LENGTH_SHORT).show();

    }
}

