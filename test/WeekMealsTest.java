import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import fr.carboneIUT.model.Model;
import fr.carboneIUT.model.ModelFood;
import fr.carboneIUT.model.ModelFood.Meal;

public class WeekMealsTest {
	private static Model model;
	private static ModelFood wm;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		model = new Model();
		wm=new ModelFood(model);
	}
	
	@Before
	public void setUp() throws Exception {
		wm.init();
	}

	@Test
	public void testInit() {
		
		assertEquals(0,wm.getNbVegetarien());
		assertEquals(0,wm.getNbAutreViandePoisson());
		assertEquals(0,wm.getNbBoeuf());
		assertEquals(0,wm.getNbVegan());
	}
	
	
	@Test
	public void testAddMealVegetarien1() {
		wm.addMeals(Meal.VEGETARIEN, 1);
		assertEquals(1,wm.getNbVegetarien());
		assertEquals(0,wm.getNbAutreViandePoisson());
		assertEquals(0,wm.getNbBoeuf());
		assertEquals(0,wm.getNbVegan());
	}
	
	@Test
	public void testAddMealBoeuf5() {
		wm.addMeals(Meal.BOEUF, 5);
		assertEquals(0,wm.getNbVegetarien());
		assertEquals(0,wm.getNbAutreViandePoisson());
		assertEquals(5,wm.getNbBoeuf());
		assertEquals(0,wm.getNbVegan());
	}
		
	
	@Test
	public void testAddMealVegetarienMoin2() {
		wm.addMeals(Meal.VEGETARIEN, -2);
		assertEquals(-2,wm.getNbVegetarien());
		assertEquals(0,wm.getNbAutreViandePoisson());
		assertEquals(0,wm.getNbBoeuf());
		assertEquals(0,wm.getNbVegan());
	}
		
	
	@Test
	public void testAddMealAutre0() {
		wm.addMeals(Meal.AUTRE_VIANDE_POISSON, 0);
		assertEquals(0,wm.getNbVegetarien());
		assertEquals(0,wm.getNbAutreViandePoisson());
		assertEquals(0,wm.getNbBoeuf());
		assertEquals(0,wm.getNbVegan());
	}
	
	@Test
	public void testComputeCO2All() {
		wm.addMeals(Meal.BOEUF, 1);
		wm.addMeals(Meal.VEGAN, 1);
		wm.addMeals(Meal.AUTRE_VIANDE_POISSON, 1);
		wm.addMeals(Meal.VEGETARIEN, 1);
		
		System.out.println(wm.computeCO2());
		
		assertEquals(9.0, wm.computeCO2(), 0.1);
		
	}


}
