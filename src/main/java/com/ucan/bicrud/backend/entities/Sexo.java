package com.ucan.bicrud.backend.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "sexo", catalog = "pessoa_db", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sexo.findAll", query = "SELECT s FROM Sexo s")
    , @NamedQuery(name = "Sexo.findByPkSexo", query = "SELECT s FROM Sexo s WHERE s.pkSexo = :pkSexo")
    , @NamedQuery(name = "Sexo.findByNome", query = "SELECT s FROM Sexo s WHERE s.nome = :nome")})
public class Sexo implements Serializable
{

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "pk_sexo", nullable = false)
    private Integer pkSexo;
    
    @Column(name = "nome", length = 2147483647)
    private String nome;
    @OneToMany(mappedBy = "fkSexo")
    private List<Pessoa> pessoaList;

    public Sexo()
    {
    }

    public Sexo(Integer pkSexo)
    {
        this.pkSexo = pkSexo;
    }

    public Integer getPkSexo()
    {
        return pkSexo;
    }

    public void setPkSexo(Integer pkSexo)
    {
        this.pkSexo = pkSexo;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    @JsonIgnore
    @XmlTransient
    public List<Pessoa> getPessoaList()
    {
        return pessoaList;
    }

    public void setPessoaList(List<Pessoa> pessoaList)
    {
        this.pessoaList = pessoaList;
    }

    @Override
    public int hashCode()
    {
        int hash = 0;
        hash += (pkSexo != null ? pkSexo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object)
    {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sexo)) {
            return false;
        }
        Sexo other = (Sexo) object;
        if ((this.pkSexo == null && other.pkSexo != null) || (this.pkSexo != null && !this.pkSexo.equals(other.pkSexo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString()
    {
        return "ejbs.entities.Sexo[ pkSexo=" + pkSexo + " ]";
    }
    
}
