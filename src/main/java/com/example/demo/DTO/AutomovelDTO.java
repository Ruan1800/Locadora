package com.example.demo.DTO;

import com.example.demo.Model.Automovel;

public class AutomovelDTO {

    private long id;
    private String NomePessoa;
    private String cpf;
    private String optionCarro;

    public AutomovelDTO() {

    }

    public Automovel toEntity(){
        Automovel automovel = new Automovel();
        automovel.setCpf(this.cpf);
        automovel.setOptionCarro(this.optionCarro);
        automovel.setNomePessoa(this.NomePessoa);

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
