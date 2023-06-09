package com.example.four;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.four.databinding.FragmentListViewBinding;

import java.util.ArrayList;
import java.util.List;

public class ListViewFragment extends Fragment {

    private FragmentListViewBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentListViewBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


    }

    private List<ListItem> initList() {
        List<ListItem> list = new ArrayList<>();
        for (int i = 1; i <= 200; i++) {
            list.add(
                    new ListItem(
                            R.drawable.ic_launcher_background,
                            getString(R.string.muzei_list_title, String.valueOf(i)),
                            "Описания не введено")
            );
        }
        return list;
    }
}
