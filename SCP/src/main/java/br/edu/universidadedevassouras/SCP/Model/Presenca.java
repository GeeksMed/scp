package br.edu.universidadedevassouras.SCP.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Presenca implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idpresenca;
    @Column(nullable = false)
    private Date data;
    @Column(nullable = false)
    private Boolean situacao;
    /*
    @ManyToOne(optional = false)
    @JoinColumn(name = "Pessoa_idpessoa", referencedColumnName = "idPessoa")
    private Pessoa pessoaidPessoa;
    */
}
