package com.ucan.bicrud.backend.entities;

import java.io.Serializable;
import java.util.List;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 *
 * @author ivandro
 */
@Entity
@Table(name = "localidade", catalog = "pessoa_db", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Localidade.findAll", query = "SELECT l FROM Localidade l")
    , @NamedQuery(name = "Localidade.findByPkLocalidade", query = "SELECT l FROM Localidade l WHERE l.pkLocalidade = :pkLocalidade")
    , @NamedQuery(name = "Localidade.findByNome", query = "SELECT l FROM Localidade l WHERE l.nome = :nome")})
public class Localidade implements Serializable
{

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "pk_localidade", nullable = false)
    private Integer pkLocalidade;
    
    
    @Column(name = "nome", length = 2147483647)
    private String nome;
    
    @OneToMany(mappedBy = "fkLocalNascimento")
    private List<Pessoa> pessoaList;
    @OneToMany(mappedBy = "fkResidencia")
    private List<Pessoa> pessoaList1;
    @OneToMany(mappedBy = "fkLocalidade")
    private List<Localidade> localidadeList;
    @JoinColumn(name = "fk_localidade", referencedColumnName = "pk_localidade")
    @ManyToOne
    private Localidade fkLocalidade;

    public Localidade()
    {
    }

    public Localidade(Integer pkLocalidade)
    {
        this.pkLocalidade = pkLocalidade;
    }

    public Integer getPkLocalidade()
    {
        return pkLocalidade;
    }

    public void setPkLocalidade(Integer pkLocalidade)
    {
        this.pkLocalidade = pkLocalidade;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }


    public void setPessoaList(List<Pessoa> pessoaList)
    {
        this.pessoaList = pessoaList;
    }
    

    public void setPessoaList1(List<Pessoa> pessoaList1)
    {
        this.pessoaList1 = pessoaList1;
    }

    @JsonIgnore
    @XmlTransient
    public List<Pessoa> getPessoaList()
    {
        return pessoaList;
    }

    @JsonIgnore
    @XmlTransient
    public List<Pessoa> getPessoaList1()
    {
        return pessoaList1;
    }

    @JsonIgnore
    @XmlTransient
    public List<Localidade> getLocalidadeList()
    {
        return localidadeList;
    }

    public void setLocalidadeList(List<Localidade> localidadeList)
    {
        this.localidadeList = localidadeList;
    }

    public Localidade getFkLocalidade()
    {
        return fkLocalidade;
    }

    public void setFkLocalidade(Localidade fkLocalidade)
    {
        this.fkLocalidade = fkLocalidade;
    }

    @Override
    public int hashCode()
    {
        int hash = 0;
        hash += (pkLocalidade != null ? pkLocalidade.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object)
    {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Localidade)) {
            return false;
        }
        Localidade other = (Localidade) object;
        if ((this.pkLocalidade == null && other.pkLocalidade != null) || (this.pkLocalidade != null && !this.pkLocalidade.equals(other.pkLocalidade))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString()
    {
        return "ejbs.entities.Localidade[ pkLocalidade=" + pkLocalidade + " ]";
    }
    
}
