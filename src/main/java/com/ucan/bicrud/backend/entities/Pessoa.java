package com.ucan.bicrud.backend.entities;


import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ivandro
 */
@Entity
@Table(name = "pessoa", catalog = "pessoa_db", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pessoa.findAll", query = "SELECT p FROM Pessoa p")
    , @NamedQuery(name = "Pessoa.findByPkPessoa", query = "SELECT p FROM Pessoa p WHERE p.pkPessoa = :pkPessoa")
    , @NamedQuery(name = "Pessoa.findByNome", query = "SELECT p FROM Pessoa p WHERE p.nome = :nome")
    , @NamedQuery(name = "Pessoa.findByDataNascimento", query = "SELECT p FROM Pessoa p WHERE p.dataNascimento = :dataNascimento")
    , @NamedQuery(name = "Pessoa.findByNumeroIdentificacao", query = "SELECT p FROM Pessoa p WHERE p.numeroIdentificacao = :numeroIdentificacao")
    , @NamedQuery(name = "Pessoa.findByEhNacional", query = "SELECT p FROM Pessoa p WHERE p.ehNacional = :ehNacional")
    , @NamedQuery(name = "Pessoa.findByDataEmissao", query = "SELECT p FROM Pessoa p WHERE p.dataEmissao = :dataEmissao")
    , @NamedQuery(name = "Pessoa.findByPrazoValidade", query = "SELECT p FROM Pessoa p WHERE p.prazoValidade = :prazoValidade")
    , @NamedQuery(name = "Pessoa.findByVitalicio", query = "SELECT p FROM Pessoa p WHERE p.vitalicio = :vitalicio")
    , @NamedQuery(name = "Pessoa.findByPai", query = "SELECT p FROM Pessoa p WHERE p.pai = :pai")
    , @NamedQuery(name = "Pessoa.findByMae", query = "SELECT p FROM Pessoa p WHERE p.mae = :mae")})
public class Pessoa implements Serializable
{

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "pk_pessoa", nullable = false)
    private Integer pkPessoa;
    
    
    @Column(name = "nome", length = 2147483647)
    private String nome;
    
    @Column(name = "data_nascimento")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataNascimento;
    
    @Column(name = "numero_identificacao", length = 2147483647)
    private String numeroIdentificacao;
    @Column(name = "eh_nacional")
    private Boolean ehNacional;
    @Column(name = "data_emissao")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataEmissao;
    @Column(name = "prazo_validade")
    @Temporal(TemporalType.TIMESTAMP)
    private Date prazoValidade;
    
    @Column(name = "vitalicio")
    private Boolean vitalicio;
    
    @Column(name = "pai", length = 2147483647)
    private String pai;
    
    
    @Column(name = "mae", length = 2147483647)
    private String mae;
    @JoinColumn(name = "fk_local_nascimento", referencedColumnName = "pk_localidade")
    @ManyToOne
    private Localidade fkLocalNascimento;
    @JoinColumn(name = "fk_residencia", referencedColumnName = "pk_localidade")
    @ManyToOne
    private Localidade fkResidencia;
    @JoinColumn(name = "fk_sexo", referencedColumnName = "pk_sexo")
    @ManyToOne
    private Sexo fkSexo;

    public Pessoa()
    {
    }

    public Pessoa(Integer pkPessoa)
    {
        this.pkPessoa = pkPessoa;
    }

    public Integer getPkPessoa()
    {
        return pkPessoa;
    }

    public void setPkPessoa(Integer pkPessoa)
    {
        this.pkPessoa = pkPessoa;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public Date getDataNascimento()
    {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento)
    {
        this.dataNascimento = dataNascimento;
    }

    public String getNumeroIdentificacao()
    {
        return numeroIdentificacao;
    }

    public void setNumeroIdentificacao(String numeroIdentificacao)
    {
        this.numeroIdentificacao = numeroIdentificacao;
    }

    public Boolean getEhNacional()
    {
        return ehNacional;
    }

    public void setEhNacional(Boolean ehNacional)
    {
        this.ehNacional = ehNacional;
    }

    public Date getDataEmissao()
    {
        return dataEmissao;
    }

    public void setDataEmissao(Date dataEmissao)
    {
        this.dataEmissao = dataEmissao;
    }

    public Date getPrazoValidade()
    {
        return prazoValidade;
    }

    public void setPrazoValidade(Date prazoValidade)
    {
        this.prazoValidade = prazoValidade;
    }

    public Boolean getVitalicio()
    {
        return vitalicio;
    }

    public void setVitalicio(Boolean vitalicio)
    {
        this.vitalicio = vitalicio;
    }

    public String getPai()
    {
        return pai;
    }

    public void setPai(String pai)
    {
        this.pai = pai;
    }

    public String getMae()
    {
        return mae;
    }

    public void setMae(String mae)
    {
        this.mae = mae;
    }

    public Localidade getFkLocalNascimento()
    {
        return fkLocalNascimento;
    }

    public void setFkLocalNascimento(Localidade fkLocalNascimento)
    {
        this.fkLocalNascimento = fkLocalNascimento;
    }

    public Localidade getFkResidencia()
    {
        return fkResidencia;
    }

    public void setFkResidencia(Localidade fkResidencia)
    {
        this.fkResidencia = fkResidencia;
    }

    public Sexo getFkSexo()
    {
        return fkSexo;
    }

    public void setFkSexo(Sexo fkSexo)
    {
        this.fkSexo = fkSexo;
    }

    @Override
    public int hashCode()
    {
        int hash = 0;
        hash += (pkPessoa != null ? pkPessoa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object)
    {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pessoa)) {
            return false;
        }
        Pessoa other = (Pessoa) object;
        if ((this.pkPessoa == null && other.pkPessoa != null) || (this.pkPessoa != null && !this.pkPessoa.equals(other.pkPessoa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString()
    {
        return "ejbs.entities.Pessoa[ pkPessoa=" + pkPessoa + " ]";
    }
    
}
