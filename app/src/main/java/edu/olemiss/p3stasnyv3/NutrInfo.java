package edu.olemiss.p3stasnyv3;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ImageView;

/**
 * Created by Sean Staz on 4/8/2015.
 */
public class NutrInfo extends ActionBarActivity implements Communicator{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nutr_info);

        FragmentManager fM = getFragmentManager();
        FragmentTransaction fT;

        // construct and add fragment for listFrag
        fT = fM.beginTransaction();
        ListFrag nutrList = new ListFrag();
        fT.add(R.id.listFragment, nutrList);
        fT.commit();

        // construct and add fragment for infoFrag
        fT = fM.beginTransaction();
        InfoFrag iFrag = new InfoFrag();
        fT.add(R.id.infoFragment, iFrag, "InfoView");
        fT.commit();
    }

    @Override
    public void strMessage(String mess) {
        FragmentManager manager = getFragmentManager();
        InfoFrag iFrag = (InfoFrag) manager.findFragmentById(R.id.infoFragment);
        iFrag.changeTitle(mess);
    }

    @Override
    public void intMessage(int pos) {
        FragmentManager manager = getFragmentManager();
        InfoFrag iFrag = (InfoFrag) manager.findFragmentById(R.id.infoFragment);
        iFrag.changeDescr(pos);
    }
}
