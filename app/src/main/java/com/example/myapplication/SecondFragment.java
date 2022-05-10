package com.example.myapplication;



    import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication.databinding.FragmentSecondBinding;
    import com.example.myapplication.databinding.FragmentSecondBinding;

    import java.util.ArrayList;

    public class SecondFragment extends Fragment {
        private FragmentSecondBinding binding;
        private ArrayList<Mainlands> countries = new ArrayList<>();
        MainLandAdapter mainlandAdapter;
        public void onCreate(@Nullable Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            mainlandAdapter = new MainLandAdapter(requireContext());

        }



        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            binding = FragmentSecondBinding.inflate(LayoutInflater.from(requireContext()),container,false);
            return binding.getRoot();

        }

        @Override
        public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
            super.onViewCreated(view, savedInstanceState);




            if (getArguments().getString("KEY").equals("Eurasia") ) {
                binding.secondRecycle.setAdapter(mainlandAdapter);
                eurasia();
                mainlandAdapter.setMainlands(countries);
            }else if (getArguments().getString("KEY").equals("North America") ) {
                binding.secondRecycle.setAdapter(mainlandAdapter);
                northAmerica();
                mainlandAdapter.setMainlands(countries);
            }else if (getArguments().getString("KEY").equals("South America") ) {
                binding.secondRecycle.setAdapter(mainlandAdapter);
                southAmerica();
                mainlandAdapter.setMainlands(countries);
            }else if (getArguments().getString("KEY").equals("Australia") ) {
                binding.secondRecycle.setAdapter(mainlandAdapter);
                australia();
                mainlandAdapter.setMainlands(countries);
            }else if (getArguments().getString("KEY").equals("Africa") ) {
                binding.secondRecycle.setAdapter(mainlandAdapter);
                africa();
                mainlandAdapter.setMainlands(countries);
            }else if (getArguments().getString("KEY").equals("Antarctida") ) {
                binding.secondRecycle.setAdapter(mainlandAdapter);
                antarctida();
                mainlandAdapter.setMainlands(countries);
            }

        }
        private void eurasia() {
            countries = new ArrayList<>();
            countries.add(new Mainlands("Moldova", "Kishinev", R.drawable.moldova));
            countries.add(new Mainlands("Ukraine", "Kiev", R.drawable.ukraine));
            countries.add(new Mainlands("Albaniya", "Tirana", R.drawable.alaniya));
            countries.add(new Mainlands("Iran", "Tegeran", R.drawable.iran));
            countries.add(new Mainlands("China", "Pekin", R.drawable.china));
        }
        private void northAmerica() {
            countries = new ArrayList<>();
            countries.add(new Mainlands("Barbados", "Bridgetown", R.drawable.barbados));
            countries.add(new Mainlands("Canada", "Ottawa", R.drawable.canada));
            countries.add(new Mainlands("Costa Rica", "San jose", R.drawable.costarica));
            countries.add(new Mainlands("Haiti", "Port-au-Prince", R.drawable.haiti));
            countries.add(new Mainlands("Panama", "Panama", R.drawable.panama));
        }
        private void southAmerica(){
            countries = new ArrayList<>();
            countries.add(new Mainlands("Colombia", "Bogota", R.drawable.colombia));
            countries.add(new Mainlands("Venezuela", "Karakas", R.drawable.venezuela));
            countries.add(new Mainlands("Peru", "Lima", R.drawable.peru));
            countries.add(new Mainlands("Uruguay", "Montevideo", R.drawable.uruguay));
            countries.add(new Mainlands("Bolivia", "Sucre", R.drawable.bolovia));
        }
        private void australia() {
            countries = new ArrayList<>();
            countries.add(new Mainlands("Australia", "Canberra", R.drawable.australia));
        }
        private void africa() {
            countries = new ArrayList<>();
            countries.add(new Mainlands("Nigeria", "Abuja", R.drawable.nigeria));
            countries.add(new Mainlands("Egypt", "Kair", R.drawable.egypt));
            countries.add(new Mainlands("Kenya", "Nairobi", R.drawable.kenya));
            countries.add(new Mainlands("Morocco", "Rabat", R.drawable.marocco));
            countries.add(new Mainlands("Angola", "Luanda", R.drawable.angola));
        }
        private void antarctida(){
            countries = new ArrayList<>();
            countries.add(new Mainlands("Great Britain","London",R.drawable.graetbritian));
            countries.add(new Mainlands("France","Paris",R.drawable.france));
            countries.add(new Mainlands("Norway","Oslo",R.drawable.norway));
            countries.add(new Mainlands("Chile","Sentiago",R.drawable.chile));
            countries.add(new Mainlands("Argentina","Buenos Aires",R.drawable.argentina));
        }
    }

