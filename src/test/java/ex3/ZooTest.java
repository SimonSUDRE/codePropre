package ex3;

import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class ZooTest {

	private Zoo zoo;
	
	@Before
	public void setup() throws Exception {
		zoo = new Zoo("Thoiry");
	}
	
	@Test
	public void testConstructeur() throws Exception  {
		
	}
	
	@Test
	public void testAddZone() throws Exception {
		
	}
	
	@Test
	public void testGetZoneByType() throws Exception {
		
	}

	@Test
	public void testAddAnimal() throws Exception {
		zoo.addAnimal(new Mamifere("Gazelle", "HERBIVORE"));
		zoo.addAnimal(new Mamifere("Lion", "CARNIVORE"));
		zoo.addAnimal(new Poisson("Truite doree", "HERBIVORE"));
		zoo.addAnimal(new Reptile("Boa constrictor", "CARNIVORE"));
		
		assertEquals(zoo.getZoneByType(TypeZone.SAVANE_AFRICAINE).getNbAnimaux(), 1);
		assertEquals(zoo.getZoneByType(TypeZone.AQUARIUM).getNbAnimaux(), 1);
		assertEquals(zoo.getZoneByType(TypeZone.FERME_REPTILE).getNbAnimaux(), 1);
		assertEquals(zoo.getZoneByType(TypeZone.ZONE_CARNIVORE).getNbAnimaux(), 1);
	}
	
	@Test
	public void testAfficherListeAnimaux() throws Exception  {
		
	}
}