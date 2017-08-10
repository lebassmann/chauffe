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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author jazz
 */
@Entity
@Table(name = "ARDUINOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Arduinos.findAll", query = "SELECT a FROM Arduinos a")
    , @NamedQuery(name = "Arduinos.findByArduinoId", query = "SELECT a FROM Arduinos a WHERE a.arduinoId = :arduinoId")
    , @NamedQuery(name = "Arduinos.findByArduinoBlueid", query = "SELECT a FROM Arduinos a WHERE a.arduinoBlueid = :arduinoBlueid")
    , @NamedQuery(name = "Arduinos.findByArduinoNom", query = "SELECT a FROM Arduinos a WHERE a.arduinoNom = :arduinoNom")})
public class Arduinos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ARDUINO_ID", nullable = false)
    private Integer arduinoId;
    @Column(name = "ARDUINO_BLUEID", length = 255)
    private String arduinoBlueid;
    @Column(name = "ARDUINO_NOM", length = 255)
    private String arduinoNom;
    @JoinTable(name = "MODIFICATIONS_ARDUINOS", joinColumns = {
        @JoinColumn(name = "ARDUINO_ID", referencedColumnName = "ARDUINO_ID", nullable = false)}, inverseJoinColumns = {
        @JoinColumn(name = "MODIFICATION_ID", referencedColumnName = "MODIFICATION_ID", nullable = false)})
    @ManyToMany(fetch = FetchType.LAZY)
    private Collection<Modifications> modificationsCollection;
    @JoinColumn(name = "APPAREIL_ID", referencedColumnName = "APPAREIL_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Appareils appareilId;
    @JoinColumn(name = "PIECE_ID", referencedColumnName = "PIECE_ID", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Pieces pieceId;
    @JoinColumn(name = "TYPE_ID", referencedColumnName = "TYPE_ID", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Types typeId;

    public Arduinos() {
    }

    public Arduinos(Integer arduinoId) {
        this.arduinoId = arduinoId;
    }

    public Integer getArduinoId() {
        return arduinoId;
    }

    public void setArduinoId(Integer arduinoId) {
        this.arduinoId = arduinoId;
    }

    public String getArduinoBlueid() {
        return arduinoBlueid;
    }

    public void setArduinoBlueid(String arduinoBlueid) {
        this.arduinoBlueid = arduinoBlueid;
    }

    public String getArduinoNom() {
        return arduinoNom;
    }

    public void setArduinoNom(String arduinoNom) {
        this.arduinoNom = arduinoNom;
    }

    @XmlTransient
    public Collection<Modifications> getModificationsCollection() {
        return modificationsCollection;
    }

    public void setModificationsCollection(Collection<Modifications> modificationsCollection) {
        this.modificationsCollection = modificationsCollection;
    }

    public Appareils getAppareilId() {
        return appareilId;
    }

    public void setAppareilId(Appareils appareilId) {
        this.appareilId = appareilId;
    }

    public Pieces getPieceId() {
        return pieceId;
    }

    public void setPieceId(Pieces pieceId) {
        this.pieceId = pieceId;
    }

    public Types getTypeId() {
        return typeId;
    }

    public void setTypeId(Types typeId) {
        this.typeId = typeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (arduinoId != null ? arduinoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Arduinos)) {
            return false;
        }
        Arduinos other = (Arduinos) object;
        if ((this.arduinoId == null && other.arduinoId != null) || (this.arduinoId != null && !this.arduinoId.equals(other.arduinoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DTO.Arduinos[ arduinoId=" + arduinoId + " ]";
    }
    
}
