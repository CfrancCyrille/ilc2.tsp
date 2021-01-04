# TP 4A 2020-21: The traveling salesman problem (TSP) with genetic algorithm

## Questions
1. Fork this github repository  (2 points)
2. Run the project
3. Comment the 3 classes: City, Population & Tour (3 points)
4. Commit your changes and check-it into github
5. On github, make a pull request (1 point)
6. Complete the next section: "Analyze IADT functions" into this file (2 points)
7. Commit your changes (commit README.md)
8. On github, update your pull request (1 point)
9. Make tests defined into section: "Functions to test now" (call your test functions using the rule: GIVEN_WHEN_THEN) (10 points)
10. Check the test coverage with the Jacoco coverage report provided into: /target/site/jacoco/index.html
11. Commit your changes
12. On github, update your pull request (1 point)
13. that ends

## Analyze IADT functions
Hereafter, for each classes give function to be tested. Remember that all functions does not have to be tested, some code can be checked by a simple inspection or an analyse, another code can be validated by definition (rules, etc) the others function can be tecsted by unit tests, integration tests or validation tests (IADT: Inspect, Analyse, Define, Test). 

### Class City

| Function      |     I A D T     |        Comment |
| :------------ | :-------------: | :------------- |
| distanceToCity | T | On peut tester cette méthode. | 
| getX | D | Cette méthode est un setter autogénéré. | 
| getY | D | Cette méthode est un setter autogénéré. | 
| toString | D | Cette méthode est un appel à deux setters autogénérés dont le résultat est concaténé. | 

### Class Tour

| Function      |     I A D T     |        Comment |
| :------------ | :-------------: | :------------- |
| containsCity  | D | On ne teste pas la méthode contains de la classe ArrayList de Java. |
| getCity  | D | Cette méthode est un setter autogénéré. |
| getDistance  | T | On peut tester cette méthode. |
| getFitness  | T | On peut tester cette méthode car elle modifie l'attribut fitness avant de le renvoyer en fonction de sa valeur précédente. |
| setCity  | D | On ne teste pas la méthode set de la classe ArrayList de Java.  |
| tourSize  | D | On ne teste pas la méthode size de la classe ArrayList de Java. |
| toString  | D | Cette méthode parcourt et affiche chaque ville. Elle pourrait être autogénérée. |

### Class Population

| Function      |     I A D T     |        Comment |
| :------------ | :-------------: | :------------- |
| getFittest  | T | On peut tester cette méthode. Elle renvoie le meilleur individu d'une population en fonction de son fitness. |
| getTour  | D | On ne teste pas la méthode de sélection de la structure de donnée array de Java. |
| populationSize  | D | On ne teste pas la méthode de modification de la structure de donnée array de Java. |
| saveTour  | D |  On ne teste pas la méthode lenght de la classe Array de Java. |

## Functions to test now

### Class City

```Java
public double distanceTo(City city)
```

### Class Tour

```Java
public int getDistance()
```

### Class GA

```Java
public static Population evolvePopulation(Population pop)
```

## Tricks & tips

- Start with simple classes (models, libraries, etc) at the end make test into complex classes (classes with multiple relations)
- Never test auto generate code
- Never test creator (its a design problem)
- Use @Test before each testFunction !
- You can test a function than throws an exception with the argument: expected
```Java
@Test(expected=Exception.class)
```

## Documentation
http://www.theprojectspot.com/tutorial-post/applying-a-genetic-algorithm-to-the-travelling-salesman-problem/5