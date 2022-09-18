package br.edu.universidadedevassouras.SCP.Model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Getter
public class Pessoa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idpessoa;
    @Column(nullable = false, unique = true)
    private String CPF;
    @Column(nullable = false)
    private String Nome;
    @Column(nullable = false, unique = true)
    private int Matricula;
    @Column(nullable = true)
    private Date Nascimento;
    @Column(nullable = true)
    private char Genero;
    @Column(nullable = true)
    @Lob
    private String Foto;
    @Column(nullable = false, unique = true)
    private String username;
    @Column(nullable = false)
    private String Senha;
    /*
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pessoaidPessoa")
    private List<Presenca> presencaList;*/
}
