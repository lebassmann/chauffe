/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author jazz
 */
@Entity
@Table(name = "HABITATIONS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Habitations.findAll", query = "SELECT h FROM Habitations h")
    , @NamedQuery(name = "Habitations.findByHabitationId", query = "SELECT h FROM Habitations h WHERE h.habitationId = :habitationId")
    , @NamedQuery(name = "Habitations.findByHabitationNom", query = "SELECT h FROM Habitations h WHERE h.habitationNom = :habitationNom")
    , @NamedQuery(name = "Habitations.findByHabitationAdresse1", query = "SELECT h FROM Habitations h WHERE h.habitationAdresse1 = :habitationAdresse1")
    , @NamedQuery(name = "Habitations.findByHabitationAdresse2", query = "SELECT h FROM Habitations h WHERE h.habitationAdresse2 = :habitationAdresse2")
    , @NamedQuery(name = "Habitations.findByHabitationCp", query = "SELECT h FROM Habitations h WHERE h.habitationCp = :habitationCp")
    , @NamedQuery(name = "Habitations.findByHabitationVille", query = "SELECT h FROM Habitations h WHERE h.habitationVille = :habitationVille")})
public class Habitations implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "HABITATION_ID", nullable = false)
    private Integer habitationId;
    @Column(name = "HABITATION_NOM", length = 255)
    private String habitationNom;
    @Column(name = "HABITATION_ADRESSE1", length = 255)
    private String habitationAdresse1;
    @Column(name = "HABITATION_ADRESSE2", length = 255)
    private String habitationAdresse2;
    @Column(name = "HABITATION_CP")
    private Integer habitationCp;
    @Column(name = "HABITATION_VILLE", length = 255)
    private String habitationVille;
    @OneToMany(mappedBy = "habitationId", fetch = FetchType.LAZY)
    private Collection<Pieces> piecesCollection;

    public Habitations() {
    }

    public Habitations(Integer habitationId) {
        this.habitationId = habitationId;
    }

    public Integer getHabitationId() {
        return habitationId;
    }

    public void setHabitationId(Integer habitationId) {
        this.habitationId = habitationId;
    }

    public String getHabitationNom() {
        return habitationNom;
    }

    public void setHabitationNom(String habitationNom) {
        this.habitationNom = habitationNom;
    }

    public String getHabitationAdresse1() {
        return habitationAdresse1;
    }

    public void setHabitationAdresse1(String habitationAdresse1) {
        this.habitationAdresse1 = habitationAdresse1;
    }

    public String getHabitationAdresse2() {
        return habitationAdresse2;
    }

    public void setHabitationAdresse2(String habitationAdresse2) {
        this.habitationAdresse2 = habitationAdresse2;
    }

    public Integer getHabitationCp() {
        return habitationCp;
    }

    public void setHabitationCp(Integer habitationCp) {
        this.habitationCp = habitationCp;
    }

    public String getHabitationVille() {
        return habitationVille;
    }

    public void setHabitationVille(String habitationVille) {
        this.habitationVille = habitationVille;
    }

    @XmlTransient
    public Collection<Pieces> getPiecesCollection() {
        return piecesCollection;
    }

    public void setPiecesCollection(Collection<Pieces> piecesCollection) {
        this.piecesCollection = piecesCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (habitationId != null ? habitationId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Habitations)) {
            return false;
        }
        Habitations other = (Habitations) object;
        if ((this.habitationId == null && other.habitationId != null) || (this.habitationId != null && !this.habitationId.equals(other.habitationId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DTO.Habitations[ habitationId=" + habitationId + " ]";
    }
    
}
