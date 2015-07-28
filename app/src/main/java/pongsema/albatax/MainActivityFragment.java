package pongsema.albatax;



import android.content.Intent;

import android.net.Uri;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.ImageButton;





public class MainActivityFragment extends Fragment {

    private final String TAG = getClass().getSimpleName();
    private final boolean D = Log.isLoggable(TAG, Log.DEBUG);


    public MainActivityFragment() {
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        //setup for Federal Tax Status (button 1)
        ImageButton imgBtnFedTax = (ImageButton)rootView.findViewById(R.id.imageButton1);
        imgBtnFedTax.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //intent to open web browser here
                String url = "https://sa.www4.irs.gov/irfof/lang/en/irfofgetstatus.jsp";
                Intent webIntent = new Intent(Intent.ACTION_VIEW);
                webIntent.setData(Uri.parse(url));
                startActivity(webIntent);

            }
        });
        //setup for State Tax Status (button 2)
        ImageButton imgBtnNYSTax = (ImageButton)rootView.findViewById(R.id.imageButton2);
        imgBtnNYSTax.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //intent to open web browser here
                String url = "https://www8.tax.ny.gov/PRIS/prisStart";
                Intent webIntent = new Intent(Intent.ACTION_VIEW);
                webIntent.setData(Uri.parse(url));
                startActivity(webIntent);

            }
        });

        //setup for contact us button (button 3)
        ImageButton imgBtnCall = (ImageButton)rootView.findViewById(R.id.imageButton3);
        imgBtnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:7183604856"));
                startActivity(callIntent);

            }
        });

        //setup for directions button (button 4)
        ImageButton imgBtnMap = (ImageButton)rootView.findViewById(R.id.imageButton4);
        imgBtnMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //intent to open google maps here

                String url = "http://maps.google.com/maps?f=d&daddr=40.808387,-73.920475";
                Intent webIntent = new Intent(Intent.ACTION_VIEW);
                webIntent.setData(Uri.parse(url));
                startActivity(webIntent);

            }
        });

        //setup for tax class signup (button 5)
        ImageButton imgTaxClass = (ImageButton)rootView.findViewById(R.id.imageButton5);
        imgTaxClass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //intent to open web browser here
                //goes to google form

                String url = "https://docs.google.com/forms/d/1eDsZrBv3f0XzCd0qGbD1pizBHJNtSirjiQX6sHRrCj8/viewform?usp=send_form";
                Intent webIntent = new Intent(Intent.ACTION_VIEW);
                webIntent.setData(Uri.parse(url));
                startActivity(webIntent);

                /*
                Toast toast = Toast.makeText(getActivity(),
                        "web browser would open to Tax class signup page",
                        Toast.LENGTH_SHORT);
                toast.show();
                */
            }
        });

        //setup for notary class signup (button 6)
        ImageButton imgBtnNotaryClass = (ImageButton)rootView.findViewById(R.id.imageButton6);
        imgBtnNotaryClass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //intent to open web browser here
                //goes to google form

                String url = "https://docs.google.com/forms/d/1AiXtfG-sP_PcBXbxcGPMEfO8xy3K2OAJ4XNafprmq6c/viewform?usp=send_form";
                Intent webIntent = new Intent(Intent.ACTION_VIEW);
                webIntent.setData(Uri.parse(url));
                startActivity(webIntent);
                /*
                Toast toast = Toast.makeText(getActivity(),
                        "web browser would open to notary class signup page",
                        Toast.LENGTH_SHORT);
                toast.show();
                */
            }
        });

        //setup for facebook button (button 7)
        ImageButton imgBtnFacebook = (ImageButton)rootView.findViewById(R.id.imageButton7);
        imgBtnFacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent facebookAppIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("fb://page/59520506051"));
                    startActivity(facebookAppIntent);

                } catch (Exception e) {
                    String url = "https://www.facebook.com/RickAstley";
                    Intent webIntent = new Intent(Intent.ACTION_VIEW);
                    webIntent.setData(Uri.parse(url));
                    startActivity(webIntent);

                }

            }
        });

        //setup for instagram button (button 8)
        ImageButton imgBtnInstagram = (ImageButton)rootView.findViewById(R.id.imageButton8);
        imgBtnInstagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.instagram.com";
                Intent webIntent = new Intent(Intent.ACTION_VIEW);
                webIntent.setData(Uri.parse(url));
                startActivity(webIntent);
/*
                Toast toast = Toast.makeText(getActivity(),
                        "There isn't a instagram app on the kindle version of the google play store :(",
                        Toast.LENGTH_SHORT);
                toast.show();
*/

            }
        });

        //setup for whatsapp button (button 9)
        ImageButton imgBtnWhatsapp = (ImageButton)rootView.findViewById(R.id.imageButton9);
        imgBtnWhatsapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.whatsapp.com";
                Intent webIntent = new Intent(Intent.ACTION_VIEW);
                webIntent.setData(Uri.parse(url));
                startActivity(webIntent);

/*
                Toast toast = Toast.makeText(getActivity(),
                        "There isn't a instagram app on the kindle version of the google play store :(",
                        Toast.LENGTH_SHORT);
                toast.show();
*/
            }
        });


        return rootView;
        //return inflater.inflate(R.layout.fragment_main, container, false);
    }



}

