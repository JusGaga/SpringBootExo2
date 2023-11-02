# Exercice 3

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

Bonus :

- un endpoint pour rechercher un student d'apres son nom


Suite :
On souhaite rajoute une partie web a notre application :

4 pages :
- une page Home (avec une image)
- une page formulaire (pour l'ajout d'un étudiant)
- une page qui liste tous les etudiants et affiche un message si aucun etudiant est inscrit
- une page qui affiche les details d'un etudiant et permet de supprimmer ou modifier l'etudiant

Chaque page contient une barre de navigation et un footer.