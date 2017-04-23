package a2.animations_transitions;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void viewAnimations(View view) {
        startActivity(new Intent(this, ViewAnimations.class));
    }

    public void propertyAnimations(View view) {
        startActivity(new Intent(this, PropertyAnimations.class));
    }
}
