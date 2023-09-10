package com.ms.email.models;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.ms.email.enums.StatusEmail;

@Entity
@Table(name = "table_email")
public class Email implements Serializable{
private static final long serialVersionUID = 1L;

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long id;
private String emailOrigem;
private String emailDestino;
private String remetente;
private String titulo;
@Column(columnDefinition = "TEXT") //Para não limitar a 255 caracter
private String mensagem;
private StatusEmail statusEmail;
private LocalDateTime dataEnvio;

public void setId(Long id) {
    this.id = id;
}
public Long getId() {
    return id;
}

public String getEmailOrigem() {
    return emailOrigem;
}
public void setEmailOrigem(String emailOrigem) {
    this.emailOrigem = emailOrigem;
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

public void setStatusEmail(StatusEmail statusEmail) {
    this.statusEmail = statusEmail;
}
public StatusEmail getStatusEmail() {
    return statusEmail;
}

public void setDataEnvio(LocalDateTime dataEnvio) {
    this.dataEnvio = dataEnvio;
}
public LocalDateTime getDataEnvio() {
    return dataEnvio;
}

    

}
