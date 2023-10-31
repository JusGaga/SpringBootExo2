# Exercice 2

Creation du API qui gere des etudiants.

On souhaite donc que cette api qui possede un restControler et un Service nous fournit les endpoints suivants :

- localhost:port/students => nous fournis la liste de tous les etidiants
- localhost:port/students/"un id" => me renvoie l'etudiant qui possede l'id choisie
- localhost:port/students => permet de cree un etudiant
- localhost:port/students/"un id" => modifie l'etudiant avec l'id choisie
- localhost:port/students/"un id" => supprime l'etudiant avec l'id choisie

Un etudiant est caracterise par :
- un id
- un nom (lastname)
- un prenom (firstname)
- un age (age)