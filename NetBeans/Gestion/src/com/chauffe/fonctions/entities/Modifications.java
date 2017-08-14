/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chauffe.fonctions.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author jazz
 */
@Entity
@Table(name = "MODIFICATIONS", catalog = "", schema = "MARCEL")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Modifications.findAll", query = "SELECT m FROM Modifications m")
    , @NamedQuery(name = "Modifications.findByModificationId", query = "SELECT m FROM Modifications m WHERE m.modificationId = :modificationId")
    , @NamedQuery(name = "Modifications.findByModificationDate", query = "SELECT m FROM Modifications m WHERE m.modificationDate = :modificationDate")
    , @NamedQuery(name = "Modifications.findByModificationTemperature", query = "SELECT m FROM Modifications m WHERE m.modificationTemperature = :modificationTemperature")})
public class Modifications implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "MODIFICATION_ID")
    private Integer modificationId;
    @Basic(optional = false)
    @Column(name = "MODIFICATION_DATE")
    @Temporal(TemporalType.DATE)
    private Date modificationDate;
    @Basic(optional = false)
    @Column(name = "MODIFICATION_TEMPERATURE")
    private int modificationTemperature;
    @ManyToMany(mappedBy = "modificationsCollection")
    private Collection<Arduinos> arduinosCollection;
    @JoinColumn(name = "PIECE_ID", referencedColumnName = "PIECE_ID")
    @ManyToOne(optional = false)
    private Pieces pieceId;

    public Modifications() {
    }

    public Modifications(Integer modificationId) {
        this.modificationId = modificationId;
    }

    public Modifications(Integer modificationId, Date modificationDate, int modificationTemperature) {
        this.modificationId = modificationId;
        this.modificationDate = modificationDate;
        this.modificationTemperature = modificationTemperature;
    }

    public Integer getModificationId() {
        return modificationId;
    }

    public void setModificationId(Integer modificationId) {
        this.modificationId = modificationId;
    }

    public Date getModificationDate() {
        return modificationDate;
    }

    public void setModificationDate(Date modificationDate) {
        this.modificationDate = modificationDate;
    }

    public int getModificationTemperature() {
        return modificationTemperature;
    }

    public void setModificationTemperature(int modificationTemperature) {
        this.modificationTemperature = modificationTemperature;
    }

    @XmlTransient
    public Collection<Arduinos> getArduinosCollection() {
        return arduinosCollection;
    }

    public void setArduinosCollection(Collection<Arduinos> arduinosCollection) {
        this.arduinosCollection = arduinosCollection;
    }

    public Pieces getPieceId() {
        return pieceId;
    }

    public void setPieceId(Pieces pieceId) {
        this.pieceId = pieceId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (modificationId != null ? modificationId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Modifications)) {
            return false;
        }
        Modifications other = (Modifications) object;
        if ((this.modificationId == null && other.modificationId != null) || (this.modificationId != null && !this.modificationId.equals(other.modificationId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.chauffe.fonctions.Modifications[ modificationId=" + modificationId + " ]";
    }
    
}
