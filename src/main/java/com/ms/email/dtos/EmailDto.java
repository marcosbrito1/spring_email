package com.ms.email.dtos;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class EmailDto {
    @NotBlank
    @Email
    private String emailOrigem;
    @NotBlank
    @Email
    private String emailDestino;
    @NotBlank
    private String remetente;    
    @NotBlank
    private String titulo;
    @NotBlank
    private String mensagem;

    public void setEmailOrigem(String emailOrigem) {
        this.emailOrigem = emailOrigem;
    }
    public String getEmailOrigem() {
        return emailOrigem;
    }

    public void setEmailDestino(String emailDestino) {
        this.emailDestino = emailDestino;
    }
    public String getEmailDestino() {
        return emailDestino;
    }

    public void setRemetente(String remetente) {
        this.remetente = remetente;
    }
    public String getRemetente() {
        return remetente;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getTitulo() {
        return titulo;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
    public String getMensagem() {
        return mensagem;
    }

}
