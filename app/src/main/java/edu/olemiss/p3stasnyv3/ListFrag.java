package edu.olemiss.p3stasnyv3;

import android.app.Activity;
import android.app.ListFragment;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Sean Staz on 4/8/2015.
 */
public class ListFrag extends ListFragment
{
    private String[] nutrArr;
    Communicator comm;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        nutrArr = new String[]{
                "Calcium", "Potassium", "Magnesium", "Iodine", "Phosphorus", "Sodium", "Vitamin A", "Vitamin B",
                "Vitamin C", "Vitamin D", "Vitamin E", "Vitamin K", "Fiber", "Choline", "Omega 6", "Omega 3",
                "Histidine", "Isoleucine", "Leucine", "Lysine", "Cystine", "Tyrosine", "Threonine", "Tryptophan", "Valine"
        };

        setListAdapter(new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, nutrArr));
    }

    public void onActivityCreated(Bundle savedState) {
        super.onActivityCreated(savedState);
    }


    @Override
    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        comm = (Communicator) activity;
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id)
    {
        comm.strMessage(nutrArr[position]);
        comm.intMessage(position);
    }



    public void showToast(String message)
    {
        Toast.makeText(getActivity(), message, Toast.LENGTH_LONG).show();
    }
}
