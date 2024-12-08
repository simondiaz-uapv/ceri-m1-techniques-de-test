
## Badges

[![CircleCI](https://circleci.com/gh/simondiaz-uapv/ceri-m1-techniques-de-test.svg?style=svg)](https://circleci.com/gh/simondiaz-uapv/ceri-m1-techniques-de-test)
[![codecov](https://codecov.io/gh/simondiaz-uapv/ceri-m1-techniques-de-test/graph/badge.svg?token=Q95P7TA1HU)](https://codecov.io/gh/simondiaz-uapv/ceri-m1-techniques-de-test)
![Checkstyle](https://img.shields.io/badge/checkstyle-passing-brightgreen)


# UCE Génie Logiciel Avancé : Techniques de tests
## Informations

- **Nom et Prénom**: Simon Diaz
- **Groupe**: Groupe M1_ILSEN_ALT


## Rapport personnel du TP
Pour les choix d'implémentation à partir du tp4 j'ai essayé de faire ce que me demandait l'énoncé. 
La "liberté" que je me suis permis c'est de générer aléatoirement les iv et de stocker les pokemonMetadata dans un HashMap.

Pour le TP6 voici mes observations :
Dès le début je n'ai pas pu commit la classe java rajouté car le checkstyle ne me le permettait pas ( il y avait ou manquait des espaces ).
Après rajout de la classe de la team Rocket sur Github mon codecov est passé de 99% à 74% car cette classe n'était pas couvertes.
Pour appliquer mes test à cette classe j'ai copié collé ce qu'il y avait dans ma classe PokemonFactoryTest en remplaçant la classe pokemonFactory par la nouvelle.
Les tests ne sont pas passé car les données de pokémon sont différentes des miennes, j'ai alors changé l'id de test et le nom de pokemon.
J'ai aussi eu des erreurs sur les stats de défense et d'attaque car l'implémentation de la team rocket la fait aléatoirement entre 0 à 100.
J'ai du aussi changer l'encapsulation de la fonction generateRandomStat pour faire les test dessus.
Une fois les modifications faites en fonction de ce que fait la classe c'est passé.
En conclusion cet exercice à pu me montrer les différences d'implémentation entre la mienne et celle de la team rocket.

