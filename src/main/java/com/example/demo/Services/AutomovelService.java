package com.example.demo.Services;

import com.example.demo.DTO.AutomovelDTO;
import com.example.demo.Model.Automovel;
import com.example.demo.Repository.AutomovelRepository;
import org.hibernate.annotations.Array;
import org.hibernate.annotations.NotFound;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Optional;

@Service
public class AutomovelService {


    private AutomovelRepository automovelRepository;

    public AutomovelService(AutomovelRepository automovelRepository) {
        this.automovelRepository = automovelRepository;
    }

    public AutomovelDTO addAutomovel(AutomovelDTO automovelDTO) {
        Automovel automovel = automovelDTO.toEntity();
        Automovel savedAutomovel = automovelRepository.save(automovel);
        return savedAutomovel.toDto();
    }

    public Automovel getAutomovelwithId(Long id) {
        Optional<Automovel> automovel = this.automovelRepository.findById(id);


    return automovel.orElseThrow(() -> new NotFound(Arrays.asList("Automovel not found"))).toDto();
    }

}
