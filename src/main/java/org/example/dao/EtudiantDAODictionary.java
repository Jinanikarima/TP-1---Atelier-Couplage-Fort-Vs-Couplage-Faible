package org.example.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EtudiantDAODictionary {

    private Map<String, Etudiant> etudiantsMap = new HashMap<>();


    public Etudiant addEtudiant(Etudiant etudiant) {
        etudiantsMap.put(etudiant.getEmail(), etudiant);
        return etudiant;
    }


    public List<Etudiant> getAllEtudiants() {
        return etudiantsMap.values().stream().collect(Collectors.toList());
    }

    public Etudiant getEtudiantByEmail(String email) {
        return etudiantsMap.get(email);
    }

    public Etudiant removeEtudiant(String email) {
        return etudiantsMap.remove(email);
    }
}