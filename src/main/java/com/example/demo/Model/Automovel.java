package com.example.demo.Model;

import com.example.demo.DTO.AutomovelDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import javax.annotation.processing.Generated;

@Entity
public class Automovel {


        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;

        private String NomePessoa;
        private String cpf;
        private String optionCarro;

        public Automovel (long id, String NomePessoa, String cpf, String optionCarro){
            this.id = id;
            this.NomePessoa = NomePessoa;
            this.cpf = cpf;
            this.optionCarro = optionCarro;
        }

        public Automovel(){

        }

        public AutomovelDTO toDto(){
            AutomovelDTO automovel = new AutomovelDTO();

            automovel.setId(this.id);
            automovel.setCpf(this.cpf);
            automovel.setNomePessoa(this.NomePessoa);
            automovel.setOptionCarro(this.optionCarro);

            return automovel;
        }

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public String getNomePessoa() {
            return NomePessoa;
        }

        public void setNomePessoa(String nomePessoa) {
            NomePessoa = nomePessoa;
        }

        public String getCpf() {
            return cpf;
        }

        public void setCpf(String cpf) {
            this.cpf = cpf;
        }

        public String getOptionCarro() {
            return optionCarro;
        }

        public void setOptionCarro(String optionCarro) {
            this.optionCarro = optionCarro;
        }
    }


