package org.example.dao;

import java.util.Date;

    public class Etudiant {
        private String nom;
        private String prenom;
        private String email;

        // Constructeur
        public Etudiant(String nom, String prenom, String email) {
            this.nom = nom;
            this.prenom = prenom;
            this.email = email;
        }

        // Getters et setters
        public String getNom() {
            return nom;
        }

        public void setNom(String nom) {
            this.nom = nom;
        }

        public String getPrenom() {
            return prenom;
        }

        public void setPrenom(String prenom) {
            this.prenom = prenom;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        @Override
        public String toString() {
            return "Etudiant{" +
                    "nom='" + nom + '\'' +
                    ", prenom='" + prenom + '\'' +
                    ", email='" + email + '\'' +
                    '}';
        }
    };


