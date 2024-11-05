package org.example.metier;

import org.example.dao.Etudiant;
import org.example.dao.EtudiantDAODictionary;

import java.util.List;

public class EtudiantManager {

    public EtudiantDAODictionary etudiantDAO;


    public EtudiantManager(EtudiantDAODictionary etudiantDAO) {
        this.etudiantDAO = etudiantDAO;
    }

    public Etudiant addEtudiant(Etudiant etudiant) {

        if (etudiantDAO.getEtudiantByEmail(etudiant.getEmail()) != null) {
            System.out.println("L'email est déjà utilisé : " + etudiant.getEmail());
            return null;
        }

        return etudiantDAO.addEtudiant(etudiant);
    }

    public List<Etudiant> getAllEtudiants() {
        return etudiantDAO.getAllEtudiants();
    }
}