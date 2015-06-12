package edu.olemiss.p3stasnyv3;

import android.app.Fragment;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Sean Staz on 4/8/2015.
 */
public class InfoFrag extends Fragment
{


    @Override
    public void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
//        ViewGroup vg = (ViewGroup) inflater.inflate(R.layout.activity_info_frag, container, false);
//        ViewGroup parent = (ViewGroup) vg.findViewById(R.id.infoFragment);

        View v = inflater.inflate(R.layout.activity_info_frag, container, false);
        return v;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);
    }

    public void showToast(String message)
    {
        Toast.makeText(getActivity(), message, Toast.LENGTH_LONG).show();
    }

    public void changeTitle(String message)
    {
        TextView TV_nutrInfo = (TextView) getActivity().findViewById(R.id.TV_nutrName);
        TV_nutrInfo.setText(message);
    }

    public void changeDescr(int position)
    {
        Resources res = getResources();

        String[] nutrDescrArr = res.getStringArray(R.array.nutrDescr);
        TextView TV_nutrInfo = (TextView) getActivity().findViewById(R.id.TV_nutrInfo);
        TV_nutrInfo.setText(nutrDescrArr[position]);

        TextView TV_sources = (TextView) getActivity().findViewById(R.id.TV_sources);
        String[] nutrSourcesArr = res.getStringArray(R.array.nutrSources);
        TV_sources.setText(nutrSourcesArr[position]);

        TextView TV_nutrType = (TextView) getActivity().findViewById(R.id.TV_nutrType);
        if(position < 6)
        {
            TV_nutrType.setText("Essential Mineral");
        }
        else if(position > 5 && position < 14)
        {
            TV_nutrType.setText("Essential Vitamin");
        }
        else if(position > 13 && position < 16)
        {
            TV_nutrType.setText("Essential Fatty Acid");
        }
        else
        {
            TV_nutrType.setText("Essential Amino Acid");
        }
    }
}
