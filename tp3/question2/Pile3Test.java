package question2;

/**
 * Classe-test Pile3Test.
 * 
 * @author (votre nom)
 * @version (un numÃ©ro de version ou une date)
 * 
 *          Les classes-test sont documentÃ©es ici :
 *          http://junit.sourceforge.net/javadoc/junit/framework/TestCase.html
 *          et sont basÃ©es sur le document Â© 2002 Robert A. Ballance intitulÃ©
 *          Â«JUnit: Unit Testing FrameworkÂ».
 * 
 *          Les objets Test (et TestSuite) sont associÃ©s aux classes Ã  tester
 *          par la simple relation yyyTest (e.g. qu'un Test de la classe
 *          Name.java se nommera NameTest.java); les deux se retrouvent dans le
 *          mÃªme paquetage. Les "engagements" (anglais : "fixture") forment un
 *          ensemble de conditions qui sont vraies pour chaque mÃ©thode Test Ã 
 *          exÃ©cuter. Il peut y avoir plus d'une mÃ©thode Test dans une classe
 *          Test; leur ensemble forme un objet TestSuite. BlueJ dÃ©couvrira
 *          automatiquement (par introspection) les mÃ©thodes Test de votre
 *          classe Test et gÃ©nÃ©rera la TestSuite consÃ©quente. Chaque appel d'une
 *          mÃ©thode Test sera prÃ©cÃ©dÃ© d'un appel de setUp(), qui rÃ©alise les
 *          engagements, et suivi d'un appel Ã  tearDown(), qui les dÃ©truit.
 */
public class Pile3Test extends junit.framework.TestCase {
	// Définissez ici les variables d'instance nécessaires à vos engagements;
	// Vous pouvez également les saisir automatiquement du présentoir
	// à l'aide du menu contextuel "Présentoir --> Engagements".
	// Notez cependant que ce dernier ne peut saisir les objets primitifs
	// du présentoir (les objets sans constructeur, comme int, float, etc.).

	/**
	 * Constructeur de la classe-test Pile3Test
	 */
	public Pile3Test() {
	}

	/**
	 * Met en place les engagements.
	 * 
	 * Méthode appelée avant chaque appel de méthode de test.
	 */
	protected void setUp() // throws java.lang.Exception
	{
		// Initialisez ici vos engagements

	}

	/**
	 * Supprime les engagements
	 * 
	 * Méthode appelée après chaque appel de méthode de test.
	 */
	protected void tearDown() // throws java.lang.Exception
	{
		// Libérez ici les ressources engagées par setUp()
	}

	/**
	 * Il ne vous reste plus qu'à définir une ou plusieurs méthodes de test. Ces
	 * méthodes doivent vérifier les résultats attendus à l'aide d'assertions
	 * assertTrue(<boolean>). Par convention, leurs noms devraient débuter par
	 * "test". Vous pouvez ébaucher le corps grâce au menu contextuel
	 * "Enregistrer une méthode de test".
	 */

}