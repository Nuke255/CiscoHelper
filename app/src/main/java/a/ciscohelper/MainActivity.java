package a.ciscohelper;

import android.app.ActionBar;
import android.support.annotation.IntegerRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.view.View;
import android.widget.TextView;
import junit.framework.TestListener;
import java.text.CollationElementIterator;


public class MainActivity extends AppCompatActivity implements TextWatcher {
TextView subnetmask;
TextView bits;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        subnetmask = (TextView) (findViewById(R.id.subnetmaskText));
        bits = (TextView) (findViewById(R.id.bitborrowedtext)) ;

        EditText edittext = (EditText) (findViewById(R.id.cidrnumberText));
        edittext.addTextChangedListener(this);

        }


    @Override
    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void afterTextChanged(Editable editable) {

        try{
           int no = Integer.parseInt(editable.toString());



               if (no==17) {
                   subnetmask.setText("255.255.128.0");
                   bits.setText("15");
                   }
               else if (no==18){
                    subnetmask.setText("255.255.192.0");
                     bits.setText("14");
                        }
               else if (no==19){

                    subnetmask.setText("255.255.240.0");
                     bits.setText("13");
                    }
               else if (no==21){
                    subnetmask.setText("255.255.248.0");
                       bits.setText("12");
                       }
               else if (no==22){
                    subnetmask.setText("255.255.252.0");
                       bits.setText("11");
                       }
               else if (no==23){
                    subnetmask.setText("255.255.254.0");
                       bits.setText("10");
                       }
               else if (no==24){
                    subnetmask.setText("255.255.255.0");
                       bits.setText("9");
                       }
               else if (no==25){
                    subnetmask.setText("255.255.255.128");
                       bits.setText("8");
                       }
               else if (no==26){
                    subnetmask.setText("255.255.255.192");
                       bits.setText("7");
                       }
               else if (no==27){
                    subnetmask.setText("255.255.255.224");
                       bits.setText("6");
                       }
               else if (no==28){
                    subnetmask.setText("255.255.255.240");
                       bits.setText("5");
                       }
               else if (no==29){
                    subnetmask.setText("255.255.255.248");
                       bits.setText("4");
                       }
               else if (no==30){
                    subnetmask.setText("255.255.255.252");
                       bits.setText("3");
                       }
               else if (no==31){
                    subnetmask.setText("255.255.255.254");
                       bits.setText("2");
                       }
               else if (no==32){
                    subnetmask.setText("255.255.255.255");
                       bits.setText("1");
                       }
            else
                subnetmask.setText("Error");



        }catch(NumberFormatException e){

            return;
        }


    }
}
