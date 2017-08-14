/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chauffe.fonctions.entities;

import java.io.Serializable;
import java.util.Collection;
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

/**
 *
 * @author Arezki GASTAUD
 */
@Entity
@Table(name = "APPAREILS", catalog = "", schema = "MARCEL")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Appareils.findAll", query = "SELECT a FROM Appareils a")
    , @NamedQuery(name = "Appareils.findByAppareilId", query = "SELECT a FROM Appareils a WHERE a.appareilId = :appareilId")
    , @NamedQuery(name = "Appareils.findByAppareilNom", query = "SELECT a FROM Appareils a WHERE a.appareilNom = :appareilNom")
    , @NamedQuery(name = "Appareils.findByAppareilType", query = "SELECT a FROM Appareils a WHERE a.appareilType = :appareilType")
    , @NamedQuery(name = "Appareils.findByAppareilPuissance", query = "SELECT a FROM Appareils a WHERE a.appareilPuissance = :appareilPuissance")})
public class Appareils implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "APPAREIL_ID")
    private Integer appareilId;
    @Column(name = "APPAREIL_NOM")
    private String appareilNom;
    @Column(name = "APPAREIL_TYPE")
    private String appareilType;
    @Column(name = "APPAREIL_PUISSANCE")
    private Integer appareilPuissance;
    @JoinColumn(name = "PIECE_ID", referencedColumnName = "PIECE_ID")
    @ManyToOne(optional = false)
    private Pieces pieceId;
    @OneToMany(mappedBy = "appareilId")
    private Collection<Arduinos> arduinosCollection;

    public Appareils() {
    }

    public Appareils(Integer appareilId) {
        this.appareilId = appareilId;
    }

    public Integer getAppareilId() {
        return appareilId;
    }

    public void setAppareilId(Integer appareilId) {
        this.appareilId = appareilId;
    }

    public String getAppareilNom() {
        return appareilNom;
    }

    public void setAppareilNom(String appareilNom) {
        this.appareilNom = appareilNom;
    }

    public String getAppareilType() {
        return appareilType;
    }

    public void setAppareilType(String appareilType) {
        this.appareilType = appareilType;
    }

    public Integer getAppareilPuissance() {
        return appareilPuissance;
    }

    public void setAppareilPuissance(Integer appareilPuissance) {
        this.appareilPuissance = appareilPuissance;
    }

    public Pieces getPieceId() {
        return pieceId;
    }

    public void setPieceId(Pieces pieceId) {
        this.pieceId = pieceId;
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
        hash += (appareilId != null ? appareilId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Appareils)) {
            return false;
        }
        Appareils other = (Appareils) object;
        if ((this.appareilId == null && other.appareilId != null) || (this.appareilId != null && !this.appareilId.equals(other.appareilId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.chauffe.fonctions.Appareils[ appareilId=" + appareilId + " ]";
    }
    
}
