package org.example.presentation;


import org.example.dao.Etudiant;
import org.example.dao.EtudiantDAO;
import org.example.dao.EtudiantDAODictionary;
import org.example.metier.EtudiantManager;

public class Presentation {
    public static void main(String[] args) {
        // Créer une instance de EtudiantDAODictionary
        EtudiantDAODictionary etudiantDAO = new EtudiantDAODictionary();

        // Créer une instance de EtudiantManager avec EtudiantDAODictionary
        EtudiantManager etudiantManager = new EtudiantManager(etudiantDAO);

        // Ajouter 4 étudiants
        Etudiant etudiant1 = new Etudiant("Etu1", "Etu1", "Etu1@example.com");
        Etudiant etudiant2 = new Etudiant("Etu2", "Etu2", "Etu2@example.com");
        Etudiant etudiant3 = new Etudiant("Etu3", "Etu3", "Etu3@example.com");
        Etudiant etudiant4 = new Etudiant("Etu4", "Etu3", "Etu4@example.com");

        // Tester l'ajout des étudiants
        etudiantManager.addEtudiant(etudiant1);
        etudiantManager.addEtudiant(etudiant2);
        etudiantManager.addEtudiant(etudiant3);
        etudiantManager.addEtudiant(etudiant4);

        // Tester la récupération de la liste des étudiants
        System.out.println("Liste des étudiants :");
        for (Etudiant e : etudiantManager.getAllEtudiants()) {
            System.out.println(e.getPrenom() + " " + e.getNom() + " - " + e.getEmail());
        }
    }
}




