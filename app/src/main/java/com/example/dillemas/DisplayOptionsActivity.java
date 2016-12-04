package com.example.dillemas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class DisplayOptionsActivity extends AppCompatActivity {

    public static final String PASS_THE_CATEGORY = "";

    private Intent categoryIntent,gameIntent;
    private Button helpButton,goBackButton,catButton1,catButton2,catButton3,catButton4,catButton5;
    private TextView currentCategoryTextView;
    private String[] categoriesList;
    private Button[] categoryButtons;
    private Populating popObj = new Populating();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_options);

        categoryIntent = getIntent();
        populateIds();
        categoriesList = popObj.getCategories();
        categoryButtons = populateCategoryButtons();

        for(int i=0; i < categoryButtons.length;i++) {
            categoryButtons[i].setText(categoriesList[i]);
        }

    }

    //Filling the categoryButtons array with buttons.
    private Button[] populateCategoryButtons() {
        Button[] population = new Button[5];
        population[0] = catButton1;
        population[1] = catButton2;
        population[2] = catButton3;
        population[3] = catButton4;
        population[4] = catButton5;

        return population;
    }

    //Initializing Ids.
    private void populateIds() {
        helpButton = (Button) findViewById(R.id.helpButton);
        helpButton.setText(Html.fromHtml("<h1> ? </h1>"));
        goBackButton = (Button) findViewById(R.id.goBackButton);
        goBackButton.setText(Html.fromHtml("<h1> <<< </h1>"));
        catButton1 = (Button) findViewById(R.id.catButton1);
        catButton2 = (Button) findViewById(R.id.catButton2);
        catButton3 = (Button) findViewById(R.id.catButton3);
        catButton4 = (Button) findViewById(R.id.catButton4);
        catButton5 = (Button) findViewById(R.id.catButton5);
        currentCategoryTextView = (TextView) findViewById(R.id.currentCategoryTextView);
    }

    //Passing the category from the button that's pressed to TextView.
    public void chosenCategory(View view) {
        switch (view.getId()) {
            case R.id.catButton1:
                currentCategoryTextView.setText(catButton1.getText().toString());
                break;
            case R.id.catButton2:
                currentCategoryTextView.setText(catButton2.getText().toString());
                break;
            case R.id.catButton3:
                currentCategoryTextView.setText(catButton3.getText().toString());
                break;
            case R.id.catButton4:
                currentCategoryTextView.setText(catButton4.getText().toString());
                break;
            case R.id.catButton5:
                currentCategoryTextView.setText(catButton5.getText().toString());
                break;
        }
    }

    //Start of the DisplayGameActivity while passing the chosenCategory.
    public void beginGame(View view) {
        gameIntent = new Intent(this,DisplayGameActivity.class);
        String passTheCategory = currentCategoryTextView.getText().toString();
        gameIntent.putExtra(PASS_THE_CATEGORY, passTheCategory);
        startActivity(gameIntent);
    }

    //Go back to main menu.
    public void goBackToMain(View view) {
        this.finish();
    }

    //Displaying info about the game.
    public void getHelp(View view) {
        Toast.makeText(getBaseContext(),"Τα διλλήματα είναι ένα παιχνίδι στο οποίο ο κόσμος είναι σκληρός." +
                "Αναγκαστικά επιλέγεις 1 από τις 2 απαντήσεις ενώ σκέφτεσαι ποιά απο τις 2 σε συμφέρει ή σου αρέσει πιο πολύ ",Toast.LENGTH_LONG).show();
    }
}

