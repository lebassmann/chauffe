/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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

/**
 *
 * @author jazz
 */
@Entity
@Table(name = "PIECES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pieces.findAll", query = "SELECT p FROM Pieces p")
    , @NamedQuery(name = "Pieces.findByPieceId", query = "SELECT p FROM Pieces p WHERE p.pieceId = :pieceId")
    , @NamedQuery(name = "Pieces.findByPieceNom", query = "SELECT p FROM Pieces p WHERE p.pieceNom = :pieceNom")
    , @NamedQuery(name = "Pieces.findByPieceSurface", query = "SELECT p FROM Pieces p WHERE p.pieceSurface = :pieceSurface")})
public class Pieces implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "PIECE_ID", nullable = false)
    private Integer pieceId;
    @Column(name = "PIECE_NOM", length = 255)
    private String pieceNom;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PIECE_SURFACE", precision = 52)
    private Double pieceSurface;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pieceId", fetch = FetchType.LAZY)
    private Collection<Modifications> modificationsCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pieceId", fetch = FetchType.LAZY)
    private Collection<Appareils> appareilsCollection;
    @JoinColumn(name = "HABITATION_ID", referencedColumnName = "HABITATION_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Habitations habitationId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pieceId", fetch = FetchType.LAZY)
    private Collection<Arduinos> arduinosCollection;

    public Pieces() {
    }

    public Pieces(Integer pieceId) {
        this.pieceId = pieceId;
    }

    public Integer getPieceId() {
        return pieceId;
    }

    public void setPieceId(Integer pieceId) {
        this.pieceId = pieceId;
    }

    public String getPieceNom() {
        return pieceNom;
    }

    public void setPieceNom(String pieceNom) {
        this.pieceNom = pieceNom;
    }

    public Double getPieceSurface() {
        return pieceSurface;
    }

    public void setPieceSurface(Double pieceSurface) {
        this.pieceSurface = pieceSurface;
    }

    @XmlTransient
    public Collection<Modifications> getModificationsCollection() {
        return modificationsCollection;
    }

    public void setModificationsCollection(Collection<Modifications> modificationsCollection) {
        this.modificationsCollection = modificationsCollection;
    }

    @XmlTransient
    public Collection<Appareils> getAppareilsCollection() {
        return appareilsCollection;
    }

    public void setAppareilsCollection(Collection<Appareils> appareilsCollection) {
        this.appareilsCollection = appareilsCollection;
    }

    public Habitations getHabitationId() {
        return habitationId;
    }

    public void setHabitationId(Habitations habitationId) {
        this.habitationId = habitationId;
    }

    @XmlTransient
    public Collection<Arduinos> getArduinosCollection() {
        return arduinosCollection;
    }

    public void setArduinosCollection(Collection<Arduinos> arduinosCollection) {
        this.arduinosCollection = arduinosCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pieceId != null ? pieceId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pieces)) {
            return false;
        }
        Pieces other = (Pieces) object;
        if ((this.pieceId == null && other.pieceId != null) || (this.pieceId != null && !this.pieceId.equals(other.pieceId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DTO.Pieces[ pieceId=" + pieceId + " ]";
    }
    
}
