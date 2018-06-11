package com.example.vimalesh.skctstudentapp;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends Activity {
    ArrayAdapter<CharSequence> adapter;
    ArrayAdapter<CharSequence> adapter1;
    ArrayAdapter<CharSequence> adapter2;
    ArrayAdapter<CharSequence> adapter3;
    ArrayAdapter<CharSequence> adapter4;
    ArrayAdapter<CharSequence> adapter5;
    ArrayAdapter<CharSequence> adapter6;
    ArrayAdapter<CharSequence> adapter7;
    int check;
    int check1;
    String filename;
    Spinner spinner;
    Spinner spinner2;
    Spinner spinner3;
    Spinner spinner4;

    class C01541 implements OnItemSelectedListener {

        class C01491 implements OnItemSelectedListener {

            class C01471 implements OnItemSelectedListener {
                C01471() {
                }

                public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                    MainActivity.this.spinner4.setAdapter(MainActivity.this.adapter5);
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                }
            }

            class C01482 implements OnItemSelectedListener {
                C01482() {
                }

                public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                    MainActivity.this.spinner4.setAdapter(MainActivity.this.adapter5);
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                }
            }

            C01491() {
            }

            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                MainActivity.this.check1 = parent.getSelectedItemPosition();
                if (MainActivity.this.check1 <= 4 && MainActivity.this.check1 != 0) {
                    MainActivity.this.spinner3.setAdapter(MainActivity.this.adapter4);
                    MainActivity.this.spinner3.setOnItemSelectedListener(new C01471());
                }
                if (MainActivity.this.check1 == 5 || MainActivity.this.check1 == 6) {
                    MainActivity.this.spinner3.setAdapter(MainActivity.this.adapter4);
                    MainActivity.this.spinner3.setOnItemSelectedListener(new C01482());
                }
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        }

        class C01512 implements OnItemSelectedListener {

            class C01501 implements OnItemSelectedListener {
                C01501() {
                }

                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    if (parent.getSelectedItemPosition() <= 3 && parent.getSelectedItemPosition() != 0) {
                        MainActivity.this.spinner4.setAdapter(MainActivity.this.adapter5);
                    }
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                }
            }

            C01512() {
            }

            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                MainActivity.this.spinner3.setAdapter(MainActivity.this.adapter4);
                MainActivity.this.spinner3.setOnItemSelectedListener(new C01501());
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        }

        class C01533 implements OnItemSelectedListener {

            class C01521 implements OnItemSelectedListener {
                C01521() {
                }

                public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                    MainActivity.this.spinner4.setAdapter(MainActivity.this.adapter5);
                }

                public void onNothingSelected(AdapterView<?> adapterView) {
                }
            }

            C01533() {
            }

            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                MainActivity.this.spinner3.setAdapter(MainActivity.this.adapter6);
                MainActivity.this.spinner3.setOnItemSelectedListener(new C01521());
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        }

        C01541() {
        }

        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            MainActivity.this.check = parent.getSelectedItemPosition();
            if (MainActivity.this.check == 1) {
                MainActivity.this.spinner2.setAdapter(MainActivity.this.adapter1);
                MainActivity.this.spinner2.setOnItemSelectedListener(new C01491());
            } else if (MainActivity.this.check == 2) {
                MainActivity.this.spinner2.setAdapter(MainActivity.this.adapter2);
                MainActivity.this.spinner2.setOnItemSelectedListener(new C01512());
            } else if (MainActivity.this.check == 3) {
                MainActivity.this.spinner2.setAdapter(MainActivity.this.adapter3);
                MainActivity.this.spinner2.setOnItemSelectedListener(new C01533());
            }
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(C0155R.layout.activity_main);
        this.spinner = (Spinner) findViewById(C0155R.id.spinner);
        this.adapter = ArrayAdapter.createFromResource(this, C0155R.array.stream, 17367048);
        this.adapter.setDropDownViewResource(17367049);
        this.spinner.setAdapter(this.adapter);
        this.spinner2 = (Spinner) findViewById(C0155R.id.spinner2);
        this.spinner3 = (Spinner) findViewById(C0155R.id.spinner3);
        this.spinner4 = (Spinner) findViewById(C0155R.id.spinner4);
        this.adapter1 = ArrayAdapter.createFromResource(this, C0155R.array.bedept, 17367048);
        this.adapter2 = ArrayAdapter.createFromResource(this, C0155R.array.btechdept, 17367048);
        this.adapter3 = ArrayAdapter.createFromResource(this, C0155R.array.medept, 17367048);
        this.adapter4 = ArrayAdapter.createFromResource(this, C0155R.array.year, 17367048);
        this.adapter5 = ArrayAdapter.createFromResource(this, C0155R.array.section, 17367048);
        this.adapter6 = ArrayAdapter.createFromResource(this, C0155R.array.meyear, 17367048);
        this.adapter7 = ArrayAdapter.createFromResource(this, C0155R.array.all, 17367048);
        this.adapter1.setDropDownViewResource(17367049);
        this.adapter2.setDropDownViewResource(17367049);
        this.adapter3.setDropDownViewResource(17367049);
        this.adapter4.setDropDownViewResource(17367049);
        this.adapter5.setDropDownViewResource(17367049);
        this.adapter6.setDropDownViewResource(17367049);
        this.spinner2.setAdapter(this.adapter7);
        this.spinner3.setAdapter(this.adapter4);
        this.spinner4.setAdapter(this.adapter5);
        this.spinner.setOnItemSelectedListener(new C01541());
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C0155R.menu.menu_main, menu);
        return true;
    }

    public void onButtonClick(View v) {
        if (v.getId() == C0155R.id.button) {
            this.filename = this.spinner.getSelectedItem().toString();
            this.filename = this.filename.concat(this.spinner2.getSelectedItem().toString());
            this.filename = this.filename.concat(this.spinner3.getSelectedItem().toString());
            this.filename = this.filename.concat(this.spinner4.getSelectedItem().toString());
            if (this.spinner.getSelectedItemPosition() == 0 || this.spinner2.getSelectedItemPosition() == 0 || this.spinner3.getSelectedItemPosition() == 0 || this.spinner4.getSelectedItemPosition() == 0) {
                Toast.makeText(getBaseContext(), "invalid selection", 1).show();
            } else {
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://www.skct.edu.in/APPS/" + this.filename + ".pdf")));
            }
        }
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == C0155R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
